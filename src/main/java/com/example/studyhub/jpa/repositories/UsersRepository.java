package com.example.studyhub.jpa.repositories;

import com.example.studyhub.jpa.entities.UsersEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
    UsersEntity findByEmail(String email);
    UsersEntity findByCnp(String cnp);
    UsersEntity findByRegistrationNumber(String registrationNumber);
    Optional<UsersEntity> findByVerificationToken(String token);
    long count();
    long countByActiveTrue();
    long countByEmailConfirmedFalse();
    long countByRole(String role);

    List<UsersEntity> findTop10ByOrderByCreatedAtDesc();

    @Query(value = """
        SELECT EXTRACT(MONTH FROM created_at) AS month,
               COUNT(*) AS total
        FROM study_hub.users
        WHERE EXTRACT(YEAR FROM created_at) = EXTRACT(YEAR FROM CURRENT_DATE)
        GROUP BY EXTRACT(MONTH FROM created_at)
        ORDER BY EXTRACT(MONTH FROM created_at)
        """, nativeQuery = true)
    List<Object[]> countMonthlyRegistrationsForCurrentYear();

    @Query("SELECT u FROM UsersEntity u WHERE " +
            "(:query = '' OR LOWER(u.firstName) LIKE LOWER(CONCAT('%', :query, '%')) " +
            "OR LOWER(u.lastName) LIKE LOWER(CONCAT('%', :query, '%')) " +
            "OR LOWER(u.email) LIKE LOWER(CONCAT('%', :query, '%')) " +
            "OR LOWER(u.registrationNumber) LIKE LOWER(CONCAT('%', :query, '%'))) " +
            "AND (:role = '' OR u.role = :role) " +
            "AND (:faculty = '' OR u.faculty = :faculty) " +
            "ORDER BY u.createdAt DESC")
    List<UsersEntity> searchUsers(
            @Param("query") String query,
            @Param("role") String role,
            @Param("faculty") String faculty
    );

    @Query("SELECT DISTINCT u.faculty FROM UsersEntity u " +
            "WHERE u.faculty IS NOT NULL ORDER BY u.faculty")
    List<String> findDistinctFaculties();
}