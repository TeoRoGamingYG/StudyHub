package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.CourseService;
import com.example.studyhub.jpa.entities.CoursesEntity;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import java.util.List;

@Named("courseBean")
@RequestScoped
@Getter
public class CourseBean {

    @Inject
    private CourseService courseService;

    @Inject
    private SessionBean sessionBean;

    private List<CoursesEntity> courses;

    @PostConstruct
    public void init() {
        courses = courseService.getCoursesForStudent(
                sessionBean.getSpecialization(),
                sessionBean.getStudyYear(),
                sessionBean.getSemester()
        );
    }
}