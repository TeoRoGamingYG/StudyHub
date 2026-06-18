package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users", schema = "study_hub")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "seq_users_id", allocationSize = 1)
    private Long id;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, unique = true, length = 20)
    private String cnp;

    @Column(name = "registration_number", nullable = false, unique = true, length = 20)
    private String registrationNumber;

    @Column(nullable = false, length = 20)
    private String role;

    @Column(length = 100)
    private String faculty;

    @Column(name = "study_year")
    private Integer studyYear;

    @Column
    private Integer semester;

    @Column(name = "group_name", length = 20)
    private String groupName;

    @Column(length = 100)
    private String specialization;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "avatar_initials", length = 5)
    private String avatarInitials;

    @Column(name = "streak_days")
    private Integer streakDays = 0;

    @Column(name = "total_hours", precision = 6, scale = 1)
    private BigDecimal totalHours = BigDecimal.ZERO;

    @Column(name = "average_grade", precision = 4, scale = 2)
    private BigDecimal averageGrade = BigDecimal.ZERO;

    @Column(name = "credit_points")
    private Integer creditPoints = 0;

    @Column(name = "email_confirmed")
    private Boolean emailConfirmed = false;

    @Column
    private Boolean active = false;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    // RELATIONS

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NotificationsEntity> notifications;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<EnrollmentsEntity> enrollments;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<GradesEntity> grades;

    @OneToMany(mappedBy = "uploadedBy", cascade = CascadeType.ALL)
    private List<FilesEntity> files;
}
