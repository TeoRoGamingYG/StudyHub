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

    long countByIsActiveTrue();

    @Query("SELECT c FROM CoursesEntity c " +
            "LEFT JOIN FETCH c.professor " +
            "WHERE (:specialization = '' OR c.specialization = :specialization) " +
            "AND (:faculty = '' OR c.faculty = :faculty) " +
            "AND (:studyYear IS NULL OR c.studyYear = :studyYear) " +
            "ORDER BY c.studyYear ASC, c.semester ASC, c.name ASC")
    List<CoursesEntity> searchCourses(
            @Param("specialization") String specialization,
            @Param("faculty") String faculty,
            @Param("studyYear") Integer studyYear
    );

    @Query("SELECT DISTINCT c.specialization FROM CoursesEntity c " +
            "WHERE c.specialization IS NOT NULL ORDER BY c.specialization")
    List<String> findDistinctSpecializations();

    @Query("SELECT DISTINCT c.faculty FROM CoursesEntity c " +
            "WHERE c.faculty IS NOT NULL ORDER BY c.faculty")
    List<String> findDistinctFaculties();
}