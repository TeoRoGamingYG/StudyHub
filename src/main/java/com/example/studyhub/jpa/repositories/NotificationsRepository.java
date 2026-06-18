package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.NotificationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepository extends JpaRepository<NotificationsEntity, Long> {
}
