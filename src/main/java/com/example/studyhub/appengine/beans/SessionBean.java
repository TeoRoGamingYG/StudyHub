package com.example.studyhub.appengine.beans;

import com.example.studyhub.jpa.entities.UsersEntity;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component("sessionBean")
@SessionScope
@Getter
@Setter
public class SessionBean implements Serializable {

    private Long userId;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private String faculty;
    private String specialization;
    private Integer studyYear;
    private String userInitials;
    private Integer streakDays = 0;
    private BigDecimal totalHours = BigDecimal.ZERO;
    private BigDecimal averageGrade = BigDecimal.ZERO;
    private Integer creditPoints = 0;

    public void populateFromEntity(UsersEntity user) {
        this.userId = user.getId();
        this.email = user.getEmail();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.role = user.getRole();
        this.faculty = user.getFaculty();
        this.specialization = user.getSpecialization();
        this.studyYear = user.getStudyYear();
        this.userInitials = user.getAvatarInitials();
        this.streakDays = user.getStreakDays() != null ? user.getStreakDays() : 0;
        this.totalHours = user.getTotalHours() != null ? user.getTotalHours() : BigDecimal.ZERO;
        this.averageGrade = user.getAverageGrade() != null ? user.getAverageGrade() : BigDecimal.ZERO;
        this.creditPoints = user.getCreditPoints() != null ? user.getCreditPoints() : 0;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void clear() {
        userId = null;
        email = null;
        firstName = null;
        lastName = null;
        role = null;
        faculty = null;
        specialization = null;
        studyYear = null;
        userInitials = null;
        streakDays = 0;
        totalHours = BigDecimal.ZERO;
        averageGrade = BigDecimal.ZERO;
        creditPoints = 0;
    }
}