package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.dto.OkmDocumentDTO;
import com.example.studyhub.appengine.services.FileService;
import com.example.studyhub.appengine.enums.FileType;
import com.example.studyhub.appengine.services.OpenKMService;
import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.repositories.CoursesRepository;
import com.example.studyhub.jpa.repositories.FilesRepository;
import com.example.studyhub.openkm.document.Document;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.file.UploadedFile;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("fileManagementBean")
@ViewScoped
@Getter @Setter
public class FileManagementBean implements Serializable {

    @Inject
    private FileService fileService;

    @Inject
    private OpenKMService openKmService;

    @Inject
    private SessionBean sessionBean;

    @Inject
    private CoursesRepository coursesRepository;

    @Inject
    private FilesRepository filesRepository;

    private List<CoursesEntity> availableCourses;
    private Long selectedCourseId;

    private List<OkmDocumentDTO> documents = new ArrayList<>();

    private OkmDocumentDTO selectedDocument;
    private byte[] previewContent;
    private boolean previewPdf = false;
    private boolean previewImage = false;

    private FileType selectedFileType = FileType.OTHER;

    @Getter @Setter
    private OkmDocumentDTO documentToDelete;

    @PostConstruct
    public void init() {
        loadCourses();
        openKmService.createFolder(openKmService.getBaseFolder());
        openKmService.createFolder(openKmService.getBaseFolder() + "/cursuri");
    }

    public void deleteSelectedDocument() {
        if (documentToDelete != null) {
            deleteDocument(documentToDelete);
            documentToDelete = null;
        }
    }

    public boolean canDelete(OkmDocumentDTO doc) {
        String role = sessionBean.getRole();
        if ("ADMIN".equals(role)) return true;
        if ("HIGHERSTUD".equals(role)) {
            return doc.getUploadedById() != null &&
                    doc.getUploadedById().equals(sessionBean.getUserId());
        }
        return false;
    }

    public void loadCourses() {
        availableCourses = coursesRepository.findAll().stream()
                .filter(c -> Boolean.TRUE.equals(c.getIsActive()))
                .sorted(java.util.Comparator.comparing(CoursesEntity::getName))
                .toList();
    }

    public void loadDocuments() {
        if (selectedCourseId == null) {
            documents = new ArrayList<>();
            return;
        }

        CoursesEntity course = coursesRepository.findById(selectedCourseId).orElse(null);
        if (course == null) return;

        String folderPath = openKmService.getCourseFolder(
                course.getId(), course.getName()
        );

        List<Document> rawDocs = openKmService.getDocumentsInFolder(folderPath);
        documents = rawDocs.stream()
                .map(this::mapToDocument)
                .toList();
    }

    public void handleFileUpload(FileUploadEvent event) {

        FacesContext context = FacesContext.getCurrentInstance();

        if (selectedCourseId == null) {
            context.addMessage(null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_WARN,
                            "Selectează mai întâi un curs din lista din stânga!",
                            null));
            return;
        }

        if (selectedFileType == null) {
            context.addMessage(null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_WARN,
                            "Selectează tipul fișierului!",
                            null));
            return;
        }

        try {
            CoursesEntity course = coursesRepository
                    .findById(selectedCourseId)
                    .orElseThrow();

            openKmService.ensureCourseFolder(course.getName(), course.getId());

            UploadedFile file = event.getFile();

            fileService.uploadFile(
                    file.getContent(),
                    file.getFileName(),
                    file.getContentType(),
                    selectedFileType,
                    sessionBean.getUserId(),
                    course
            );

            loadDocuments();

            context.addMessage(null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_INFO,
                            "Fișier încărcat cu succes!",
                            null));

            selectedFileType = FileType.OTHER;

        } catch (Exception e) {
            context.addMessage(null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "Eroare la upload: " + e.getMessage(),
                            null));
        }
    }

    public void previewDocument(OkmDocumentDTO doc) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            this.selectedDocument = doc;
            this.previewContent = openKmService.getDocumentPreview(doc.getPath());

            String mime = doc.getMimeType();
            previewPdf = mime != null && mime.contains("pdf");
            previewImage = mime != null && mime.contains("image");

        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la preview: " + e.getMessage(), null));
        }
    }

    public StreamedContent downloadDocument(OkmDocumentDTO doc) {
        try {
            byte[] content = openKmService.downloadDocument(doc.getPath());
            return DefaultStreamedContent.builder()
                    .name(doc.getName())
                    .contentType(doc.getMimeType() != null
                            ? doc.getMimeType() : "application/octet-stream")
                    .stream(() -> new ByteArrayInputStream(content))
                    .build();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Eroare la download: " + e.getMessage(), null));
            return null;
        }
    }

    public void deleteDocument(OkmDocumentDTO doc) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            openKmService.deleteDocument(doc.getPath());
            fileService.deleteFileByPath(doc.getPath());
            loadDocuments();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Fișier șters: " + doc.getName(), null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la ștergere: " + e.getMessage(), null));
        }
    }

    public void selectCourse(Long courseId) {
        this.selectedCourseId = courseId;
        loadDocuments();
        PrimeFaces.current().ajax().update("mainForm:filesContent");
        PrimeFaces.current().ajax().update("mainForm");
    }

    public String getPreviewBase64() {
        if (previewContent == null) return null;
        return java.util.Base64.getEncoder().encodeToString(previewContent);
    }

    public List<FileType> getFileTypes() {
        return List.of(FileType.values());
    }

    public boolean isAdmin() {
        return "ADMIN".equals(sessionBean.getRole());
    }

    public boolean canUpload() {
        String role = sessionBean.getRole();
        return "ADMIN".equals(role) || "HIGHERSTUD".equals(role);
    }

    private OkmDocumentDTO mapToDocument(Document document) {
        OkmDocumentDTO dto = new OkmDocumentDTO();
        dto.setPath(document.getPath());
        String path = document.getPath();
        dto.setName(
                path.substring(path.lastIndexOf("/") + 1)
        );
        dto.setMimeType(document.getMimeType());

        if (document.getActualVersion() != null) {
            dto.setSize(document.getActualVersion().getSize());
            dto.setAuthor(document.getActualVersion().getAuthor());
        }

        filesRepository.findByFilePath(document.getPath())
                .ifPresent(f -> {
                    if (f.getType() != null) {
                        try {
                            dto.setType(f.getType());
                        } catch (IllegalArgumentException ignored) {}
                    }
                    if (f.getUploadedBy() != null) {
                        dto.setUploadedById(f.getUploadedBy().getId());
                    }
                });
        return dto;
    }
}