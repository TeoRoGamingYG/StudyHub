package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.*;
import com.example.studyhub.jpa.entities.*;
import com.example.studyhub.jpa.repositories.*;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

@Named("forYouBean")
@ViewScoped
@Getter
public class ForYouBean implements Serializable {

    @Inject private SessionBean sessionBean;
    @Inject private GradesService gradeService;
    @Inject private NotificationService notificationService;
    @Inject private OpenKMService openKmService;
    @Inject private CoursesRepository coursesRepository;
    @Inject private GradesRepository gradesRepository;
    @Inject private CalendarEventRepository calendarEventRepository;
    @Inject private FilesRepository filesRepository;

    // Stats
    private long totalCourses;
    private double average;
    private int totalCredits;
    private int totalCreditPoints;

    // Cursuri
    private List<CoursesEntity> courses;

    // Fisiere recente
    private List<FilesEntity> recentFiles;

    // Notificari recente
    private List<NotificationsEntity> recentNotifications;

    // Calendar - urmatoarele 3 evenimente
    private List<CalendarEventEntity> upcomingEvents;

    @PostConstruct
    public void init() {
        if (sessionBean.getUserId() == null) return;
        loadStats();
        loadCourses();
        loadRecentFiles();
        loadRecentNotifications();
        loadUpcomingEvents();
    }

    private void loadStats() {
        courses = coursesRepository.findBySpecializationAndStudyYearAndSemesterAndIsActiveTrue(
                sessionBean.getSpecialization(),
                sessionBean.getStudyYear(),
                sessionBean.getSemester()
        );
        totalCourses = courses != null ? courses.size() : 0;

        List<GradesEntity> grades = gradesRepository
                .findGradesFiltered(
                        sessionBean.getUserId(),
                        sessionBean.getStudyYear(),
                        0
                );

        average = gradeService.calculateAverage(grades);
        totalCredits = gradeService.calculateTotalCredits(grades);
        totalCreditPoints = gradeService.calculateTotalCreditPoints(grades);
    }

    private void loadCourses() {
        if (courses == null) courses = new ArrayList<>();
    }

    private void loadRecentFiles() {
        if (courses == null || courses.isEmpty()) {
            recentFiles = new ArrayList<>();
            return;
        }

        // Ultimele 6 fisiere adaugate la cursurile studentului
        List<Long> courseIds = courses.stream()
                .map(CoursesEntity::getId)
                .collect(Collectors.toList());

        recentFiles = filesRepository
                .findTop6ByCourseIdsOrderByUploadedAtDesc(courseIds);
    }

    private void loadRecentNotifications() {
        recentNotifications = notificationService
                .getRecent(sessionBean.getUserId())
                .stream()
                .filter(n -> !n.getIsRead())
                .limit(5)
                .collect(Collectors.toList());
    }

    private void loadUpcomingEvents() {
        upcomingEvents = calendarEventRepository
                .findUpcomingForUser(
                        sessionBean.getUserId(),
                        LocalDate.now().atStartOfDay(),
                        3
                );
    }

    public String getTodayFormatted() {
        LocalDate today = LocalDate.now();
        String dayName = today.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("ro"));
        return dayName.substring(0,1).toUpperCase() + dayName.substring(1)
                + ", " + today.format(DateTimeFormatter.ofPattern("d MMMM yyyy",
                new Locale("ro")));
    }

    public String getAverageFormatted() {
        return String.format("%.2f", average);
    }

    public boolean hasUpcomingEvents() {
        return upcomingEvents != null && !upcomingEvents.isEmpty();
    }

    public boolean hasRecentFiles() {
        return recentFiles != null && !recentFiles.isEmpty();
    }

    public boolean hasUnreadNotifications() {
        return recentNotifications != null && !recentNotifications.isEmpty();
    }

    public String getNotifIcon(String type) {
        if (type == null) return "🔔";
        return switch (type) {
            case "FILE" -> "📁";
            case "GRADE" -> "📊";
            case "CHAT" -> "💬";
            default -> "🔔";
        };
    }

    public String getEventDateFormatted(CalendarEventEntity event) {
        if (event.getStartTime() == null) return "";
        return event.getStartTime().format(
                DateTimeFormatter.ofPattern("d MMM, HH:mm", new Locale("ro")));
    }
}