package com.example.studyhub.jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calendar_events", schema = "study_hub")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalendarEventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_calendar_events_id")
    @SequenceGenerator(name = "seq_calendar_events_id",
            sequenceName = "seq_calendar_events_id",
            allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "all_day")
    private Boolean allDay = false;

    @Column(length = 20)
    private String color = "#4f6ef7";

    // null = vizibil pentru toți, altfel doar pentru user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private UsersEntity createdBy;

    @Column(name = "is_public")
    private Boolean isPublic = true;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}