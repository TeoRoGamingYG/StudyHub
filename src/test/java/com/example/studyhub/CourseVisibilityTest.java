package com.example.studyhub;

import com.example.studyhub.appengine.services.CourseService;
import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.repositories.CoursesRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Scenariu 2 - Vizualizarea cursurilor")
class CourseVisibilityTest {

    @Mock
    private CoursesRepository coursesRepository;

    @InjectMocks
    private CourseService courseService;

    private List<CoursesEntity> mockCourses;

    @BeforeEach
    void setUp() {
        CoursesEntity c1 = new CoursesEntity();
        c1.setId(1L);
        c1.setName("Programare Java");
        c1.setSpecialization("Informatică");
        c1.setStudyYear(2);
        c1.setSemester(2);
        c1.setCredits(5);
        c1.setIsActive(true);

        CoursesEntity c2 = new CoursesEntity();
        c2.setId(2L);
        c2.setName("Baze de Date");
        c2.setSpecialization("Informatică");
        c2.setStudyYear(2);
        c2.setSemester(2);
        c2.setCredits(4);
        c2.setIsActive(true);

        mockCourses = List.of(c1, c2);
    }

    @Test
    @DisplayName("2.1 - Cursurile sunt filtrate după specializare, an și semestru")
    void testCoursesFilteredByProfile() {
        when(coursesRepository.findCoursesForStudent(
                "Informatică", 2, 2))
                .thenReturn(mockCourses);

        List<CoursesEntity> result = courseService.getCoursesForStudent(
                "Informatică", 2, 2
        );

        assertNotNull(result);
        assertEquals(2, result.size(),
                "Trebuie returnate exact 2 cursuri");
    }

    @Test
    @DisplayName("2.2 - Toate cursurile returnate sunt active")
    void testOnlyActiveCoursesReturned() {
        when(coursesRepository.findCoursesForStudent(
                "Informatică", 2, 2))
                .thenReturn(mockCourses);

        List<CoursesEntity> result = courseService.getCoursesForStudent(
                "Informatică", 2, 2
        );

        assertTrue(result.stream().allMatch(CoursesEntity::getIsActive),
                "Toate cursurile returnate trebuie să fie active");
    }

    @Test
    @DisplayName("2.3 - Profil fără cursuri returnează listă goală")
    void testNoCoursesForUnknownProfile() {
        when(coursesRepository.findCoursesForStudent(
                "Necunoscută", 5, 1))
                .thenReturn(Collections.emptyList());

        List<CoursesEntity> result = courseService.getCoursesForStudent(
                "Necunoscută", 5, 1
        );

        assertNotNull(result);
        assertTrue(result.isEmpty(),
                "Trebuie returnată o listă goală pentru profil necunoscut");
    }

    @Test
    @DisplayName("2.4 - Cursurile conțin informațiile necesare")
    void testCoursesHaveRequiredFields() {
        when(coursesRepository.findCoursesForStudent(
                "Informatică", 2, 2))
                .thenReturn(mockCourses);

        List<CoursesEntity> result = courseService.getCoursesForStudent(
                "Informatică", 2, 2
        );

        result.forEach(c -> {
            assertNotNull(c.getName(), "Cursul trebuie să aibă nume");
            assertNotNull(c.getCredits(), "Cursul trebuie să aibă credite");
            assertNotNull(c.getSemester(), "Cursul trebuie să aibă semestru");
        });
    }
}
