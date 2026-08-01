package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.dto.GradeImportRow;
import com.example.studyhub.appengine.services.GradeImportService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import java.io.Serializable;
import java.util.List;

@Named("gradeImportBean")
@ViewScoped
@Getter @Setter
public class GradeImportBean implements Serializable {

    @Inject
    private GradeImportService gradeImportService;

    private List<GradeImportRow> previewRows;
    private UploadedFile uploadedFile;

    private boolean previewReady = false;
    private boolean importDone = false;
    private int importedCount = 0;
    private int errorCount = 0;
    private int duplicateCount = 0;

    @PostConstruct
    public void init() {
        reset();
    }

    public void reset() {
        previewRows = null;
        uploadedFile = null;
        previewReady = false;
        importDone = false;
        importedCount = 0;
        errorCount = 0;
        duplicateCount = 0;
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            uploadedFile = event.getFile();
            previewRows = gradeImportService.parseAndValidate(
                    uploadedFile.getInputStream()
            );

            // Calculează statistici preview
            importedCount = 0;
            errorCount = 0;
            duplicateCount = 0;

            for (GradeImportRow row : previewRows) {
                switch (row.getStatus()) {
                    case "OK" -> importedCount++;
                    case "ERROR" -> errorCount++;
                    case "DUPLICATE" -> duplicateCount++;
                }
            }

            previewReady = true;
            importDone = false;

        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la procesarea fișierului: " + e.getMessage(), null));
        }
    }

    public void confirmImport() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (previewRows == null || previewRows.isEmpty()) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_WARN,
                    "Nu există date de importat.", null));
            return;
        }

        try {
            int count = gradeImportService.importRows(previewRows);
            importedCount = count;
            importDone = true;
            previewReady = false;

            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    count + " note importate cu succes!", null));

        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la import: " + e.getMessage(), null));
        }
    }

    public String getStatusClass(String status) {
        return switch (status) {
            case "OK" -> "import-ok";
            case "ERROR" -> "import-error";
            case "DUPLICATE" -> "import-duplicate";
            default -> "";
        };
    }

    public String getStatusLabel(String status) {
        return switch (status) {
            case "OK" -> "✓ Valid";
            case "ERROR" -> "✕ Eroare";
            case "DUPLICATE" -> "⚠ Duplicat";
            default -> status;
        };
    }

    public boolean hasValidRows() {
        return previewRows != null && previewRows.stream()
                .anyMatch(r -> "OK".equals(r.getStatus()));
    }
}