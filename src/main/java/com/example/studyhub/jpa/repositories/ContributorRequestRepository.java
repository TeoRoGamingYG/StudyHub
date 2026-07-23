package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.ContributorRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface ContributorRequestRepository
        extends JpaRepository<ContributorRequestEntity, Long> {

    List<ContributorRequestEntity> findByStatusOrderByCreatedAtDesc(String status);

    List<ContributorRequestEntity> findAllByOrderByCreatedAtDesc();

    long countByStatus(String status);

    Optional<ContributorRequestEntity> findByUserId(Long userId);

    boolean existsByUserIdAndStatus(Long userId, String status);
}