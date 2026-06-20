package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
    UsersEntity findByEmail(String email);
    Optional<UsersEntity> findByVerificationToken(String token);
}