package com.example.studyhub.appengine.services;

import com.example.studyhub.appengine.dto.DashboardStats;
import com.example.studyhub.jpa.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AdminDashboardService {

    private final UsersRepository usersRepository;
    private final CoursesRepository coursesRepository;
    private final GradesRepository gradesRepository;
    private final FilesRepository filesRepository;
    private final TeachersRepository teachersRepository;
    private final ContributorRequestRepository contributorRequestRepository;

    @Transactional(readOnly = true)
    public DashboardStats getDashboard() {
        DashboardStats stats = new DashboardStats();

        // 1. Metricile pentru carduri
        stats.setTotalUsers(usersRepository.count());
        stats.setUnconfirmedUsers(usersRepository.countByEmailConfirmedFalse());
        stats.setProfessorsCount(teachersRepository.count());

        stats.setActiveCourses(coursesRepository.countByIsActiveTrue());
        stats.setTotalGrades(gradesRepository.count());
        stats.setTotalFiles(filesRepository.count());
        stats.setPendingContributorRequests((int) contributorRequestRepository.countByStatus("PENDING"));

        // 2. Liste pentru activitate recentă
        stats.setRecentGrades(gradesRepository.findTop10ByOrderByGradedAtDesc());
        stats.setNewestUsers(usersRepository.findTop10ByOrderByCreatedAtDesc());
        stats.setRecentFiles(filesRepository.findTop10ByOrderByUploadedAtDesc());

        return stats;
    }

    @Transactional(readOnly = true)
    public Map<Integer, Long> getMonthlyUserRegistrations() {
        List<Object[]> results = usersRepository.countMonthlyRegistrationsForCurrentYear();
        Map<Integer, Long> monthlyData = new HashMap<>();
        for (Object[] result : results) {
            monthlyData.put(((Number) result[0]).intValue(), ((Number) result[1]).longValue());
        }
        return monthlyData;
    }

    @Transactional(readOnly = true)
    public Map<Integer, Long> getMonthlyGrades() {
        List<Object[]> results = gradesRepository.countMonthlyGradesForCurrentYear();
        Map<Integer, Long> monthlyData = new HashMap<>();
        for (Object[] result : results) {
            monthlyData.put(((Number) result[0]).intValue(), ((Number) result[1]).longValue());
        }
        return monthlyData;
    }
}
