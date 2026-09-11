package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.NotificationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotificationsRepository extends JpaRepository<NotificationsEntity, Long> {

    List<NotificationsEntity> findByUserIdAndIsReadFalseOrderByCreatedAtDesc(Long userId);

    List<NotificationsEntity> findTop20ByUserIdOrderByCreatedAtDesc(Long userId);

    long countByUserIdAndIsReadFalse(Long userId);

    @Modifying
    @Query("UPDATE NotificationsEntity n SET n.isRead = true WHERE n.user.id = :userId")
    void markAllReadByUserId(@Param("userId") Long userId);
}
