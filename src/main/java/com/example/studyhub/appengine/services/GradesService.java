package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.GradesEntity;
import com.example.studyhub.jpa.repositories.GradesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradesService {

    private final GradesRepository gradesRepository;

    public List<GradesEntity> getFilteredGrades(
            Long studentId, Integer studyYear, Integer semester) {
        return gradesRepository.findGradesFiltered(studentId, studyYear, semester);
    }

    public double calculateAverage(List<GradesEntity> grades) {
        if (grades == null || grades.isEmpty()) return 0.0;
        return grades.stream()
                .filter(g -> g.getGrade() != null)
                .mapToInt(GradesEntity::getGrade)
                .average()
                .orElse(0.0);
    }

    public int calculateTotalCredits(List<GradesEntity> grades) {
        if (grades == null) return 0;
        return grades.stream()
                .filter(g -> g.getGrade() != null && g.getGrade() >= 5)
                .mapToInt(g -> g.getCourse().getCredits() != null
                        ? g.getCourse().getCredits() : 0)
                .sum();
    }

    public int calculateTotalCreditPoints(List<GradesEntity> grades) {
        if (grades == null) return 0;
        return grades.stream()
                .filter(g -> g.getGrade() != null && g.getGrade() >= 5)
                .mapToInt(g -> g.getGrade() *
                        (g.getCourse().getCredits() != null
                                ? g.getCourse().getCredits() : 0))
                .sum();
    }

    public int getCreditPointsForGrade(GradesEntity grade) {
        if (grade.getGrade() == null || grade.getCourse().getCredits() == null)
            return 0;
        return grade.getGrade() * grade.getCourse().getCredits();
    }

    public boolean isPromoted(GradesEntity grade) {
        return grade.getGrade() != null && grade.getGrade() >= 5;
    }
}
