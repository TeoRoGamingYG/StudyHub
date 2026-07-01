package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CoursesRepository extends JpaRepository<CoursesEntity, Long> {

    @Query("SELECT c FROM CoursesEntity c WHERE c.isActive = true " +
            "AND c.specialization = :specialization " +
            "AND c.studyYear = :studyYear " +
            "AND c.semester = :semester")
    List<CoursesEntity> findCoursesForStudent(
            @Param("specialization") String specialization,
            @Param("studyYear") Integer studyYear,
            @Param("semester") Integer semester
    );
}