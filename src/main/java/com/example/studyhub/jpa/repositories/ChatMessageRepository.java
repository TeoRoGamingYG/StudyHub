package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.ChatMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessageEntity, Long> {

    @Query("SELECT m FROM ChatMessageEntity m " +
            "JOIN FETCH m.sender " +
            "WHERE m.roomId = :roomId AND m.isDeleted = false " +
            "ORDER BY m.sentAt ASC")
    List<ChatMessageEntity> findByRoomId(@Param("roomId") String roomId);

    @Query("SELECT m FROM ChatMessageEntity m " +
            "JOIN FETCH m.sender " +
            "WHERE m.roomId = :roomId AND m.isDeleted = false " +
            "ORDER BY m.sentAt ASC " +
            "LIMIT 50")
    List<ChatMessageEntity> findLast50ByRoomId(@Param("roomId") String roomId);
}