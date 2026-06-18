package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "grades", schema = "study_hub")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GradesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_grades_id")
    @SequenceGenerator(name = "seq_grades_id", sequenceName = "seq_grades_id", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private UsersEntity student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CoursesEntity course;

    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal grade;

    @ManyToOne
    @JoinColumn(name = "graded_by")
    private UsersEntity gradedBy;

    @Column(name = "graded_at")
    private LocalDateTime gradedAt = LocalDateTime.now();

    @Column(columnDefinition = "TEXT")
    private String notes;
}
