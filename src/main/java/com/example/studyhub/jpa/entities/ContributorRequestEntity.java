package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contributor_requests", schema = "study_hub")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContributorRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_contributor_requests_id")
    @SequenceGenerator(name = "seq_contributor_requests_id",
            sequenceName = "seq_contributor_requests_id",
            allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UsersEntity user;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "study_year", length = 50)
    private String studyYear;

    @Column(length = 100)
    private String specialization;

    @Column(columnDefinition = "TEXT")
    private String message;

    @Column(nullable = false, length = 20)
    private String status = "PENDING"; // PENDING, APPROVED, REJECTED

    @Column(name = "rejection_reason", columnDefinition = "TEXT")
    private String rejectionReason;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "reviewed_at")
    private LocalDateTime reviewedAt;
}