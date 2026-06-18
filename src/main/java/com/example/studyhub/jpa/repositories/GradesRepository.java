package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.GradesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<GradesEntity, Long> {
}
