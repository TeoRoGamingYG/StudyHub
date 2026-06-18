package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.CourseUploadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseUploadRepository extends JpaRepository<CourseUploadEntity, Long> {
}
