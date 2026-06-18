package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "courses", schema = "study_hub")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoursesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_courses_id")
    @SequenceGenerator(name = "seq_courses_id", sequenceName = "seq_courses_id", allocationSize = 1)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 10)
    private String icon;

    @Column(length = 20)
    private String color;

    @Column(nullable = false)
    private Integer credits;

    @Column
    private Integer semester;

    @Column(name = "max_students")
    private Integer maxStudents;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private TeachersEntity professor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<EnrollmentsEntity> enrollments;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<GradesEntity> grades;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<CourseUploadEntity> courseUploads;
}