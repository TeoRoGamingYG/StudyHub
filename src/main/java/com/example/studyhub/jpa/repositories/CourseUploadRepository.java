package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.CourseUploadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseUploadRepository extends JpaRepository<CourseUploadEntity, Long> {
    List<CourseUploadEntity> findByCourseId(Long courseId);
    List<CourseUploadEntity> findByStudentId(Long studentId);
}
