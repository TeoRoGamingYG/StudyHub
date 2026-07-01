package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.repositories.CoursesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CoursesRepository coursesRepository;

    public List<CoursesEntity> getCoursesForStudent(String specialization, Integer studyYear, Integer semester)
    {
        return coursesRepository
                .findCoursesForStudent(specialization, studyYear, semester);
    }
}