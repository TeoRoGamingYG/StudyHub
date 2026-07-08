package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;

    @Transactional
    public UsersEntity register(UsersEntity user) {
        if (usersRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Email-ul este deja folosit");
        }

        if (usersRepository.findByCnp(user.getCnp()) != null) {
            throw new IllegalArgumentException("CNP-ul este deja înregistrat");
        }

        if (usersRepository.findByRegistrationNumber(user.getRegistrationNumber()) != null) {
            throw new IllegalArgumentException("Numărul matricol este deja înregistrat");
        }

        if (user.getPassword() == null || user.getPassword().length() < 8) {
            throw new IllegalArgumentException("Parola trebuie să aibă minim 8 caractere");
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

        if (LocalDateTime.now().isAfter(LocalDateTime.of(LocalDateTime.now().getYear(), Month.OCTOBER, 1, 0, 0)) &&
        LocalDateTime.now().isBefore(LocalDateTime.of(LocalDateTime.now().getYear(), Month.FEBRUARY, 22, 0, 0))) user.setSemester(1);
        else user.setSemester(2);

        user.setCreatedAt(LocalDateTime.now());
        user.setActive(false);
        user.setEmailConfirmed(false);
        user.setStreakDays(0);
        user.setCreditPoints(0);

        String token = UUID.randomUUID().toString();
        user.setVerificationToken(token);

        UsersEntity saved = usersRepository.save(user);
        emailService.sendVerificationEmail(saved.getEmail(), token);
        return saved;
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

    @Transactional
    public boolean verifyEmail(String token) {
        return usersRepository.findByVerificationToken(token).map(user -> {
            user.setEmailConfirmed(true);
            user.setActive(true);
            user.setVerificationToken(null);
            user.setUpdatedAt(LocalDateTime.now());
            usersRepository.save(user);
            return true;
        }).orElse(false);
    }
}