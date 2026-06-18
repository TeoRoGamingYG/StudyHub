package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "teachers", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"full_name"})
})
@Getter
@Setter
public class TeachersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_teachers_id")
    @SequenceGenerator(name = "seq_teachers_id", sequenceName = "seq_teachers_id", allocationSize = 1)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 200)
    private String fullName;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(length = 20)
    private String phone;

    @Column(length = 100)
    private String faculty;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<CoursesEntity> courses;
}