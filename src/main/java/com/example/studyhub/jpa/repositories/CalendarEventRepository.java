package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.CalendarEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CalendarEventRepository extends JpaRepository<CalendarEventEntity, Long> {

    @Query("SELECT e FROM CalendarEventEntity e WHERE e.isPublic = true " +
            "OR e.createdBy.id = :userId " +
            "ORDER BY e.startTime ASC")
    List<CalendarEventEntity> findVisibleEvents(@Param("userId") Long userId);

    @Query("SELECT e FROM CalendarEventEntity e " +
            "WHERE e.startTime >= :from " +
            "AND (e.isPublic = true OR e.createdBy.id = :userId) " +
            "AND e.startTime IS NOT NULL " +
            "ORDER BY e.startTime ASC " +
            "LIMIT :limit")
    List<CalendarEventEntity> findUpcomingForUser(
            @Param("userId") Long userId,
            @Param("from") java.time.LocalDateTime from,
            @Param("limit") int limit
    );
}