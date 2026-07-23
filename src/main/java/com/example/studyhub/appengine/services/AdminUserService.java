package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AdminUserService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    public List<UsersEntity> searchUsers(String query, String role, String faculty) {
        return usersRepository.searchUsers(
                query == null ? "" : query.trim(),
                role == null ? "" : role.trim(),
                faculty == null ? "" : faculty.trim()
        );
    }

    public UsersEntity findById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

    @Transactional
    public void updateUser(UsersEntity user) {
        UsersEntity existing = usersRepository.findById(user.getId())
                .orElseThrow(() -> new IllegalArgumentException("User negăsit"));

        existing.setFirstName(user.getFirstName());
        existing.setLastName(user.getLastName());
        existing.setEmail(user.getEmail());
        existing.setRole(user.getRole());
        existing.setFaculty(user.getFaculty());
        existing.setSpecialization(user.getSpecialization());
        existing.setStudyYear(user.getStudyYear());
        existing.setSemester(user.getSemester());
        existing.setGroupName(user.getGroupName());
        existing.setUpdatedAt(LocalDateTime.now());

        usersRepository.save(existing);
    }

    @Transactional
    public void toggleActive(Long userId) {
        UsersEntity user = usersRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User negăsit"));
        user.setActive(!Boolean.TRUE.equals(user.getActive()));
        user.setUpdatedAt(LocalDateTime.now());
        usersRepository.save(user);
    }

    @Transactional
    public String resetPassword(Long userId) {
        UsersEntity user = usersRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User negăsit"));

        String tempPassword = UUID.randomUUID().toString().substring(0, 10);
        user.setPassword(passwordEncoder.encode(tempPassword));
        user.setUpdatedAt(LocalDateTime.now());
        usersRepository.save(user);
        return tempPassword;
    }

    @Transactional
    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }

    public List<String> getDistinctFaculties() {
        return usersRepository.findDistinctFaculties();
    }
}