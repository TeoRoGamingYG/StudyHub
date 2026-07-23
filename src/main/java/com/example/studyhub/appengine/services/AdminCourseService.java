package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.entities.TeachersEntity;
import com.example.studyhub.jpa.repositories.CoursesRepository;
import com.example.studyhub.jpa.repositories.TeachersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCourseService {

    private final CoursesRepository coursesRepository;
    private final TeachersRepository teachersRepository;

    public List<CoursesEntity> searchCourses(
            String specialization, String faculty, Integer studyYear) {
        return coursesRepository.searchCourses(
                specialization == null ? "" : specialization,
                faculty == null ? "" : faculty,
                studyYear
        );
    }

    public CoursesEntity findById(Long id) {
        return coursesRepository.findById(id).orElse(null);
    }

    @Transactional
    public void createCourse(CoursesEntity course) {
        coursesRepository.save(course);
    }

    @Transactional
    public void updateCourse(CoursesEntity course) {
        CoursesEntity existing = coursesRepository.findById(course.getId())
                .orElseThrow(() -> new IllegalArgumentException("Curs negăsit"));

        existing.setName(course.getName());
        existing.setCredits(course.getCredits());
        existing.setSemester(course.getSemester());
        existing.setStudyYear(course.getStudyYear());
        existing.setSpecialization(course.getSpecialization());
        existing.setIsActive(course.getIsActive());
        existing.setProfessor(course.getProfessor());
        coursesRepository.save(existing);
    }

    @Transactional
    public void toggleActive(Long courseId) {
        CoursesEntity course = coursesRepository.findById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Curs negăsit"));
        course.setIsActive(!Boolean.TRUE.equals(course.getIsActive()));
        coursesRepository.save(course);
    }

    @Transactional
    public void deleteCourse(Long courseId) {
        coursesRepository.deleteById(courseId);
    }

    public List<TeachersEntity> getAllTeachers() {
        return teachersRepository.findAll();
    }

    public List<String> getDistinctSpecializations() {
        return coursesRepository.findDistinctSpecializations();
    }

    public List<String> getDistinctFaculties() {
        return coursesRepository.findDistinctFaculties();
    }
}