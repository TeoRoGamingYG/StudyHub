package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.dto.OkmDocumentDTO;
import com.example.studyhub.appengine.enums.FileType;
import com.example.studyhub.appengine.services.CourseService;
import com.example.studyhub.appengine.services.OpenKMService;
import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.repositories.CoursesRepository;
import com.example.studyhub.jpa.repositories.FilesRepository;
import com.example.studyhub.openkm.document.Document;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("courseBean")
@ViewScoped
@Getter @Setter
public class CourseBean implements Serializable {

    @Inject
    private CourseService courseService;

    @Inject
    private SessionBean sessionBean;

    @Inject
    private LanguageBean languageBean;

    @Inject
    private CoursesRepository coursesRepository;

    @Inject
    private FilesRepository filesRepository;

    @Inject
    private OpenKMService openKmService;

    private List<CoursesEntity> courses;

    private Long selectedCourseId;
    private CoursesEntity selectedCourse;
    private List<OkmDocumentDTO> documents = new ArrayList<>();

    @PostConstruct
    public void init() {
        courses = courseService.getCoursesForStudent(
                sessionBean.getSpecialization(),
                sessionBean.getStudyYear(),
                sessionBean.getSemester()
        );
    }

    public void selectCourse(Long courseId) {
        selectedCourseId = courseId;
        selectedCourse = coursesRepository.findById(courseId).orElse(null);
        loadDocuments();
        PrimeFaces.current().ajax().update("courseMaterials");
    }

    private void loadDocuments() {
        documents = new ArrayList<>();

        if (selectedCourse == null) {
            return;
        }

        String folderPath = openKmService.getCourseFolder(
                selectedCourse.getId(),
                selectedCourse.getName()
        );

        List<Document> rawDocuments =
                openKmService.getDocumentsInFolder(folderPath);

        for (Document document : rawDocuments) {
            OkmDocumentDTO dto = mapToDocument(document);

            if (dto != null) {
                documents.add(dto);
            }
        }
    }

    private OkmDocumentDTO mapToDocument(Document document) {

        OkmDocumentDTO dto = new OkmDocumentDTO();

        String path = document.getPath();

        dto.setPath(path);
        dto.setName(
                path.substring(path.lastIndexOf("/") + 1)
        );
        dto.setMimeType(document.getMimeType());

        if (document.getActualVersion() != null) {
            dto.setSize(document.getActualVersion().getSize());
            dto.setAuthor(document.getActualVersion().getAuthor());
        }

        filesRepository.findByFilePath(path)
                .ifPresent(file -> {
                    dto.setType(file.getType());
                });

        return dto;
    }

    public List<OkmDocumentDTO> getDocumentsByType(String typeName) {
        try {
            FileType type = FileType.valueOf(typeName);
            return documents.stream()
                    .filter(doc -> doc.getType() == type)
                    .toList();
        } catch (IllegalArgumentException e) {
            return List.of();
        }
    }

    public boolean hasDocumentsByType(String typeName) {
        try {
            FileType type = FileType.valueOf(typeName);
            return documents.stream()
                    .anyMatch(doc -> doc.getType() == type);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public String getFileTypeLabel(String typeName) {
        try {
            FileType type = FileType.valueOf(typeName);
            if (languageBean.getCurrentLocale() != null &&
                    languageBean.getCurrentLocale().getLanguage().equals("ro")) {
                return type.getLabelRo();
            }
            return type.getLabelEn();
        } catch (IllegalArgumentException e) {
            return typeName;
        }
    }

    public List<String> getAllFileTypes() {
        return java.util.Arrays.stream(FileType.values())
                .map(Enum::name)
                .toList();
    }
}