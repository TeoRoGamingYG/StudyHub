package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public UsersEntity register(UsersEntity user) {
        if (usersRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Email deja folosit");
        }

        // Encode parola
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Avatar initials din primul si ultimul nume
        String initials = "";
        if (user.getFirstName() != null && !user.getFirstName().isEmpty())
            initials += user.getFirstName().charAt(0);
        if (user.getLastName() != null && !user.getLastName().isEmpty())
            initials += user.getLastName().charAt(0);
        user.setAvatarInitials(initials.toUpperCase());

        user.setCreatedAt(LocalDateTime.now());
        user.setActive(false);
        user.setEmailConfirmed(false);
        user.setStreakDays(0);
        user.setCreditPoints(0);

        return usersRepository.save(user);
    }

    @Transactional
    public void updateLastLogin(String email) {
        UsersEntity user = usersRepository.findByEmail(email);
        if (user != null) {
            user.setLastLogin(LocalDateTime.now());
            usersRepository.save(user);
        }
    }

    public UsersEntity findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    @Transactional
    public void resetPassword(String email, String temporaryPassword) {
        UsersEntity user = usersRepository.findByEmail(email);
        if (user != null) {
            user.setPassword(passwordEncoder.encode(temporaryPassword));
            user.setUpdatedAt(LocalDateTime.now());
            usersRepository.save(user);
        }
    }
}