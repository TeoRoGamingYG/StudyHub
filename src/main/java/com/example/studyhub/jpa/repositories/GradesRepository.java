package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.GradesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GradesRepository extends JpaRepository<GradesEntity, Long> {
    @Query("SELECT g FROM GradesEntity g " +
            "JOIN FETCH g.course c " +
            "LEFT JOIN FETCH g.gradedBy " +
            "WHERE g.student.id = :studentId " +
            "AND c.studyYear = :studyYear " +
            "AND (:semester = 0 OR c.semester = :semester) " +
            "ORDER BY c.studyYear ASC, c.semester ASC, c.name ASC")
    List<GradesEntity> findGradesFiltered(
            @Param("studentId") Long studentId,
            @Param("studyYear") Integer studyYear,
            @Param("semester") Integer semester
    );
}
