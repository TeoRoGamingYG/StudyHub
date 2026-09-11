package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.FilesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FilesRepository extends JpaRepository<FilesEntity, Long> {

    long count();
    List<FilesEntity> findTop10ByOrderByUploadedAtDesc();
    Optional<FilesEntity> findByFilePath(String filePath);
    @Query("SELECT f FROM FilesEntity f " +
            "JOIN CourseUploadEntity cu ON cu.file.id = f.id " +
            "WHERE cu.course.id IN :courseIds " +
            "AND f.status = 'OK' " +
            "ORDER BY f.uploadedAt DESC " +
            "LIMIT 6")
    List<FilesEntity> findTop6ByCourseIdsOrderByUploadedAtDesc(
            @Param("courseIds") List<Long> courseIds
    );
}