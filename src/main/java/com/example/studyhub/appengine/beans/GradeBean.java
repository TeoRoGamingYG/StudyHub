package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.GradesService;
import com.example.studyhub.jpa.entities.GradesEntity;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Named("gradeBean")
@ViewScoped
@Getter
@Setter
public class GradeBean implements Serializable {

    @Inject
    private GradesService gradesService;

    @Inject
    private SessionBean sessionBean;

    private List<GradesEntity> grades;
    private Integer selectedYear;
    private Integer selectedSemester = 0;

    private double average;
    private int totalCredits;
    private int totalCreditPoints;

    @PostConstruct
    public void init() {
        selectedYear = sessionBean.getStudyYear();
        loadGrades();
    }

    public void loadGrades() {
        grades = gradesService.getFilteredGrades(
                sessionBean.getUserId(),
                selectedYear,
                selectedSemester
        );
        average = gradesService.calculateAverage(grades);
        totalCredits = gradesService.calculateTotalCredits(grades);
        totalCreditPoints = gradesService.calculateTotalCreditPoints(grades);
    }

    public int getCreditPointsForGrade(GradesEntity grade) {
        return gradesService.getCreditPointsForGrade(grade);
    }

    public boolean isPromoted(GradesEntity grade) {
        return gradesService.isPromoted(grade);
    }

    public List<Integer> getAvailableYears() {
        List<Integer> years = new java.util.ArrayList<>();
        for (int i = 1; i <= sessionBean.getStudyYear(); i++) {
            years.add(i);
        }
        return years;
    }

    public String getAverageFormatted() {
        return String.format("%.2f", average);
    }
}
