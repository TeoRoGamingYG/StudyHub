package com.example.studyhub.appengine.dto;

import com.example.studyhub.appengine.enums.FileType;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class OkmDocumentDTO {
    private String path;
    private String name;
    private String mimeType;
    private Long size;
    private LocalDateTime created;
    private LocalDateTime lastModified;
    private String author;
    private FileType type;
    private Long uploadedById;

    public String getSizeFormatted() {
        if (size == null) return "—";
        if (size < 1024) return size + " B";
        if (size < 1024 * 1024) return String.format("%.1f KB", size / 1024.0);
        return String.format("%.1f MB", size / (1024.0 * 1024));
    }

    public String getFileIcon() {
        if (mimeType == null) return "📄";
        if (mimeType.contains("pdf")) return "📕";
        if (mimeType.contains("word") || mimeType.contains("doc")) return "📘";
        if (mimeType.contains("excel") || mimeType.contains("sheet")) return "📗";
        if (mimeType.contains("image")) return "🖼";
        if (mimeType.contains("zip") || mimeType.contains("rar")) return "🗜";
        if (mimeType.contains("text")) return "📝";
        return "📄";
    }
}