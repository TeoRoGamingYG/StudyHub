package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.EnrollmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentsRepository extends JpaRepository<EnrollmentsEntity, Long> {
}
