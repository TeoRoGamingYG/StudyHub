package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "course_upload", schema = "study_hub")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseUploadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_course_upload_id")
    @SequenceGenerator(name = "seq_course_upload_id", sequenceName = "seq_course_upload_id", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CoursesEntity course;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private UsersEntity student;

    @ManyToOne
    @JoinColumn(name = "file_id", nullable = false)
    private FilesEntity file;

    @Column(name = "uploaded_at")
    private LocalDateTime uploadedAt = LocalDateTime.now();
}
