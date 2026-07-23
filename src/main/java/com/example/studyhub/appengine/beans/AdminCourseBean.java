package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.AdminCourseService;
import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.entities.TeachersEntity;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Named("adminCourseBean")
@ViewScoped
@Getter @Setter
public class AdminCourseBean implements Serializable {

    @Inject
    private AdminCourseService adminCourseService;

    private List<CoursesEntity> courses;
    private CoursesEntity selectedCourse;
    private boolean newCourse = false;

    // Filtre
    private String filterSpecialization = "";
    private String filterFaculty = "";
    private Integer filterYear;

    @PostConstruct
    public void init() {
        loadCourses();
    }

    public void loadCourses() {
        courses = adminCourseService.searchCourses(
                filterSpecialization, filterFaculty, filterYear
        );
    }

    public void prepareNew() {
        selectedCourse = new CoursesEntity();
        selectedCourse.setIsActive(true);
        newCourse = true;
    }

    public void selectCourse(CoursesEntity course) {
        selectedCourse = adminCourseService.findById(course.getId());
        newCourse = false;
    }

    public void saveCourse() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            if (newCourse) {
                adminCourseService.createCourse(selectedCourse);
                context.addMessage(null, new FacesMessage(
                        FacesMessage.SEVERITY_INFO,
                        "Curs creat cu succes!", null));
            } else {
                adminCourseService.updateCourse(selectedCourse);
                context.addMessage(null, new FacesMessage(
                        FacesMessage.SEVERITY_INFO,
                        "Curs actualizat cu succes!", null));
            }
            loadCourses();
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare: " + e.getMessage(), null));
        }
    }

    public void toggleActive(CoursesEntity course) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminCourseService.toggleActive(course.getId());
            loadCourses();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Status curs modificat!", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare: " + e.getMessage(), null));
        }
    }

    public void deleteCourse(CoursesEntity course) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminCourseService.deleteCourse(course.getId());
            loadCourses();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Curs șters!", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la ștergere: " + e.getMessage(), null));
        }
    }

    public List<TeachersEntity> getAvailableTeachers() {
        return adminCourseService.getAllTeachers();
    }

    public List<String> getAvailableSpecializations() {
        return adminCourseService.getDistinctSpecializations();
    }

    public List<String> getAvailableFaculties() {
        return adminCourseService.getDistinctFaculties();
    }
}