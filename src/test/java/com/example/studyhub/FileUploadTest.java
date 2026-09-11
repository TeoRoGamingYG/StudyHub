package com.example.studyhub;

import com.example.studyhub.appengine.enums.FileStatusEnum;
import com.example.studyhub.appengine.enums.FileType;
import com.example.studyhub.appengine.services.FileService;
import com.example.studyhub.appengine.services.NotificationService;
import com.example.studyhub.appengine.services.OpenKMService;
import com.example.studyhub.jpa.entities.*;
import com.example.studyhub.jpa.repositories.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Scenariu 3 - Încărcarea unui material")
class FileUploadTest {

    @Mock private OpenKMService openKmService;
    @Mock private FilesRepository filesRepository;
    @Mock private CourseUploadRepository courseUploadRepository;
    @Mock private UsersRepository usersRepository;
    @Mock private NotificationService notificationService;

    @InjectMocks
    private FileService fileService;

    private UsersEntity mockUser;
    private CoursesEntity mockCourse;

    @BeforeEach
    void setUp() {
        mockUser = new UsersEntity();
        mockUser.setId(1L);
        mockUser.setEmail("higherstud@test.com");
        mockUser.setRole("HIGHERSTUD");
        mockUser.setFirstName("Ana");
        mockUser.setLastName("Ion");

        mockCourse = new CoursesEntity();
        mockCourse.setId(10L);
        mockCourse.setName("Programare Java");
        mockCourse.setIsActive(true);
    }

    @Test
    @DisplayName("3.1 - Fișierul este salvat în baza de date după upload")
    void testFileIsSavedInDatabase() throws Exception {
        byte[] content = "test content".getBytes();

        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockUser));
        when(openKmService.getCourseFolder(10L, "Programare Java"))
                .thenReturn("/okm:root/StudyHub/cursuri/10_Programare_Java");

        doNothing().when(openKmService)
                .uploadDocument(any(), any(), any(), any());

        when(filesRepository.save(any()))
                .thenAnswer(i -> i.getArgument(0));

        fileService.uploadFile(content, "test.pdf",
                        "application/pdf", FileType.COURSE_MATERIAL, 1L, mockCourse);

        verify(filesRepository, times(1)).save(any(FilesEntity.class));
    }

    @Test
    @DisplayName("3.2 - Metadata fișierului este corectă")
    void testFileMetadata() throws Exception {
        byte[] content = "test content".getBytes();
        ArgumentCaptor<FilesEntity> captor =
                ArgumentCaptor.forClass(FilesEntity.class);

        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockUser));
        when(openKmService.getCourseFolder(any(), any()))
                .thenReturn("/okm:root/StudyHub/cursuri/10_Programare_Java");

        doNothing().when(openKmService)
                .uploadDocument(any(), any(), any(), any());

        when(filesRepository.save(captor.capture()))
                .thenAnswer(i -> i.getArgument(0));

        fileService.uploadFile(content, "test.pdf",
                        "application/pdf", FileType.COURSE_MATERIAL, 1L, mockCourse);

        FilesEntity saved = captor.getValue();

        assertEquals("test.pdf", saved.getFileName(),
                "Numele fișierului trebuie salvat corect");
        assertEquals("application/pdf", saved.getMimeType(),
                "MIME type trebuie salvat corect");
        assertEquals(FileType.COURSE_MATERIAL, saved.getType(),
                "Tipul fișierului trebuie salvat corect");
        assertEquals(FileStatusEnum.OK, saved.getStatus(),
                "Statusul trebuie să fie OK");
        assertNotNull(saved.getUploadedAt(),
                "Data upload trebuie setată");
        assertNotNull(saved.getUploadedBy(),
                "Userul care a uploadat trebuie setat");
    }

    @Test
    @DisplayName("3.3 - Asocierea cu cursul este creată")
    void testCourseUploadCreated() throws Exception {
        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockUser));
        when(openKmService.getCourseFolder(any(), any()))
                .thenReturn("/folder");

        doNothing().when(openKmService)
                .uploadDocument(any(), any(), any(), any());

        when(filesRepository.save(any()))
                .thenAnswer(i -> i.getArgument(0));

        fileService.uploadFile("test".getBytes(), "test.pdf",
                        "application/pdf", FileType.COURSE_MATERIAL, 1L, mockCourse);

        verify(courseUploadRepository, times(1))
                .save(any(CourseUploadEntity.class));
    }

    @Test
    @DisplayName("3.4 - Notificările sunt trimise studenților cursului")
    void testNotificationsSent() throws Exception {
        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockUser));
        when(openKmService.getCourseFolder(any(), any()))
                .thenReturn("/folder");

        doNothing().when(openKmService)
                .uploadDocument(any(), any(), any(), any());

        when(filesRepository.save(any()))
                .thenAnswer(i -> i.getArgument(0));
        when(usersRepository.findStudentsByCourseId(10L))
                .thenReturn(List.of());

        fileService.uploadFile("test".getBytes(), "test.pdf",
                        "application/pdf", FileType.COURSE_MATERIAL, 1L, mockCourse);

        verify(usersRepository, times(1))
                .findStudentsByCourseId(10L);
    }
}