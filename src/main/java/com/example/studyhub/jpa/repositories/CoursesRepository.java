package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<CoursesEntity, Long> {
}
