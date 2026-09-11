package com.example.studyhub.jpa.entities;

import com.example.studyhub.appengine.enums.FileStatusEnum;
import com.example.studyhub.appengine.enums.FileType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "files", schema = "study_hub")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_files_id")
    @SequenceGenerator(name = "seq_files_id", sequenceName = "seq_files_id", allocationSize = 1)
    private Long id;

    @Column(name = "file_name", nullable = false, length = 255)
    private String fileName;

    @Column(name = "file_path", nullable = false, length = 500)
    private String filePath;

    @Column(name = "file_size")
    private Long fileSize;

    @Column(name = "mime_type", length = 100)
    private String mimeType;

    @Column(name = "uploaded_at")
    private LocalDateTime uploadedAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "uploaded_by")
    private UsersEntity uploadedBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private FileStatusEnum status = FileStatusEnum.OK;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private FileType type = FileType.OTHER;
}
