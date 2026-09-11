package com.example.studyhub;

import com.example.studyhub.appengine.services.FileService;
import com.example.studyhub.appengine.services.OpenKMService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Scenariu 4 - Accesarea unui material")
class FileAccessTest {

    @Mock
    private OpenKMService openKmService;

    @InjectMocks
    private FileService fileService;

    private static final String DOC_PATH =
            "/okm:root/StudyHub/cursuri/10_Java/test.pdf";

    @Test
    @DisplayName("4.1 - Conținutul documentului este returnat din OpenKM")
    void testDocumentContentReturned() throws Exception {
        byte[] expected = "PDF content".getBytes();
        when(openKmService.downloadDocument(DOC_PATH))
                .thenReturn(expected);

        byte[] result = fileService.downloadFile(DOC_PATH);

        assertNotNull(result);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("4.2 - OpenKM este apelat cu path-ul corect")
    void testOpenKmCalledWithCorrectPath() throws Exception {
        when(openKmService.downloadDocument(DOC_PATH))
                .thenReturn("content".getBytes());

        openKmService.downloadDocument(DOC_PATH);

        verify(openKmService, times(1)).downloadDocument(DOC_PATH);
    }

    @Test
    @DisplayName("4.3 - Eroare la document inexistent")
    void testDocumentNotFound() throws Exception {
        when(openKmService.downloadDocument("cale_invalida"))
                .thenThrow(new Exception("Document negăsit în OpenKM"));

        assertThrows(Exception.class,
                () -> openKmService.downloadDocument("cale_invalida"),
                "Trebuie aruncată excepție pentru document inexistent");
    }

    @Test
    @DisplayName("4.4 - Path-ul null aruncă excepție")
    void testNullPathThrowsException() throws Exception {
        when(openKmService.downloadDocument(null))
                .thenThrow(new Exception("Path-ul nu poate fi null"));

        assertThrows(Exception.class,
                () -> openKmService.downloadDocument(null),
                "Path-ul null trebuie să genereze excepție");
    }
}
