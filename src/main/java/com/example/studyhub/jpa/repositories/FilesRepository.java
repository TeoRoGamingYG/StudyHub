package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.FilesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<FilesEntity, Long> {
}