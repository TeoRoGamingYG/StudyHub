package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "enrollments", schema = "study_hub",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"student_id", "course_id"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_enrollments_id")
    @SequenceGenerator(name = "seq_enrollments_id", sequenceName = "seq_enrollments_id", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private UsersEntity student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CoursesEntity course;

    @Column(name = "enrolled_at")
    private LocalDateTime enrolledAt = LocalDateTime.now();

    @Column(length = 20)
    private String status = "ACTIVE";
}
