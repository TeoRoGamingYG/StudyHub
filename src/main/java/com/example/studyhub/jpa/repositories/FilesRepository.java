package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.FilesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FilesRepository extends JpaRepository<FilesEntity, Long> {

    long count();
    List<FilesEntity> findTop10ByOrderByUploadedAtDesc();
    Optional<FilesEntity> findByFilePath(String filePath);
}