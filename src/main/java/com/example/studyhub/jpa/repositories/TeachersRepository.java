package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.TeachersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<TeachersEntity, Long> {
}
