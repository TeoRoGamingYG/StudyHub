package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

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
    @SequenceGenerator(
            name = "seq_grades_id",
            sequenceName = "seq_grades_id",
            allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private UsersEntity student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private CoursesEntity course;

    @Column(name = "grade", nullable = false)
    private Integer grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "graded_by")
    private TeachersEntity gradedBy;

    @Column(name = "graded_at")
    private LocalDateTime gradedAt;
}
