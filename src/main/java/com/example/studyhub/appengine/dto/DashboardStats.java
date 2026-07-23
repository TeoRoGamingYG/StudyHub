package com.example.studyhub.appengine.dto;

import com.example.studyhub.jpa.entities.FilesEntity;
import com.example.studyhub.jpa.entities.GradesEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DashboardStats {

    // Count-uri pentru Cards
    private long totalUsers;
    private long activeUsers;
    private long unconfirmedUsers;
    private long professorsCount;
    private long activeCourses;
    private long totalGrades;
    private long totalFiles;
    private long pendingContributorRequests;

    // Liste pentru activitate recentă (pentru pasul următor)
    private List<GradesEntity> recentGrades;
    private List<UsersEntity> newestUsers;
    private List<FilesEntity> recentFiles;
}
