package com.example.studyhub;

import com.example.studyhub.appengine.dto.ChatMessage;
import com.example.studyhub.appengine.services.ChatService;
import com.example.studyhub.jpa.entities.*;
import com.example.studyhub.jpa.repositories.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Scenariu 5 - Comunicarea prin chat")
class ChatServiceTest {

    @Mock private ChatMessageRepository chatMessageRepository;
    @Mock private UsersRepository usersRepository;

    @InjectMocks private ChatService chatService;

    private UsersEntity mockAdmin;
    private UsersEntity mockStudent;
    private ChatMessageEntity mockMessage;

    @BeforeEach
    void setUp() {
        mockAdmin = new UsersEntity();
        mockAdmin.setId(1L);
        mockAdmin.setEmail("admin@test.com");
        mockAdmin.setFirstName("Admin");
        mockAdmin.setLastName("Test");
        mockAdmin.setRole("ADMIN");
        mockAdmin.setAvatarInitials("AT");

        mockStudent = new UsersEntity();
        mockStudent.setId(2L);
        mockStudent.setEmail("student@test.com");
        mockStudent.setFirstName("Ion");
        mockStudent.setLastName("Popescu");
        mockStudent.setRole("STUDENT");
        mockStudent.setAvatarInitials("IP");

        mockMessage = new ChatMessageEntity();
        mockMessage.setId(1L);
        mockMessage.setRoomId("announcements");
        mockMessage.setRoomType("ANNOUNCEMENTS");
        mockMessage.setContent("Anunț important!");
        mockMessage.setSender(mockAdmin);
        mockMessage.setSentAt(java.time.LocalDateTime.now());
        mockMessage.setIsDeleted(false);
    }

    @Test
    @DisplayName("5.1 - Mesajul este salvat în baza de date")
    void testMessageIsSaved() {
        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockAdmin));
        when(chatMessageRepository.save(any()))
                .thenReturn(mockMessage);

        ChatMessage result = chatService.sendMessage(
                "announcements", "ANNOUNCEMENTS",
                "Anunț important!", 1L
        );

        assertNotNull(result, "Mesajul returnat nu trebuie să fie null");
        verify(chatMessageRepository, times(1))
                .save(any(ChatMessageEntity.class));
    }

    @Test
    @DisplayName("5.2 - Mesajul conține datele expeditorului")
    void testMessageContainsSenderData() {
        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockAdmin));
        when(chatMessageRepository.save(any()))
                .thenReturn(mockMessage);

        ChatMessage result = chatService.sendMessage(
                "announcements", "ANNOUNCEMENTS",
                "Anunț important!", 1L
        );

        assertEquals("Admin Test", result.getSenderName(),
                "Numele expeditorului trebuie să fie corect");
        assertEquals("ADMIN", result.getSenderRole(),
                "Rolul expeditorului trebuie să fie corect");
    }

    @Test
    @DisplayName("5.3 - Mesajul este asociat camerei corecte")
    void testMessageAssociatedToCorrectRoom() {
        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockAdmin));
        when(chatMessageRepository.save(any()))
                .thenReturn(mockMessage);

        ChatMessage result = chatService.sendMessage(
                "announcements", "ANNOUNCEMENTS",
                "Anunț important!", 1L
        );

        assertEquals("announcements", result.getRoomId(),
                "Mesajul trebuie asociat camerei corecte");
    }

    @Test
    @DisplayName("5.4 - Mesaj gol nu este procesat")
    void testEmptyMessageNotSaved() {
        assertThrows(IllegalArgumentException.class,
                () -> chatService.sendMessage(
                        "announcements", "ANNOUNCEMENTS", "  ", 1L),
                "Mesajul gol trebuie să genereze excepție");
    }

    @Test
    @DisplayName("5.5 - Adminul poate șterge orice mesaj")
    void testAdminCanDeleteAnyMessage() {
        mockMessage.setSender(mockStudent);
        when(chatMessageRepository.findById(1L))
                .thenReturn(Optional.of(mockMessage));
        when(usersRepository.findById(1L))
                .thenReturn(Optional.of(mockAdmin));
        when(chatMessageRepository.save(any()))
                .thenReturn(mockMessage);

        chatService.deleteMessage(1L, 1L);

        verify(chatMessageRepository, times(1)).save(any());
        assertTrue(mockMessage.getIsDeleted(),
                "Mesajul trebuie marcat ca șters");
    }

    @Test
    @DisplayName("5.6 - Studentul poate șterge doar propriul mesaj")
    void testStudentCanDeleteOwnMessage() {
        mockMessage.setSender(mockStudent);
        when(chatMessageRepository.findById(1L))
                .thenReturn(Optional.of(mockMessage));
        when(usersRepository.findById(2L))
                .thenReturn(Optional.of(mockStudent));
        when(chatMessageRepository.save(any()))
                .thenReturn(mockMessage);

        chatService.deleteMessage(1L, 2L);

        assertTrue(mockMessage.getIsDeleted(),
                "Studentul trebuie să poată șterge propriul mesaj");
    }

    @Test
    @DisplayName("5.7 - Studentul nu poate șterge mesajul altcuiva")
    void testStudentCannotDeleteOthersMessage() {
        mockMessage.setSender(mockAdmin);
        when(chatMessageRepository.findById(1L))
                .thenReturn(Optional.of(mockMessage));
        when(usersRepository.findById(2L))
                .thenReturn(Optional.of(mockStudent));

        chatService.deleteMessage(1L, 2L);

        assertFalse(mockMessage.getIsDeleted(),
                "Studentul nu trebuie să poată șterge mesajul altcuiva");
        verify(chatMessageRepository, never()).save(any());
    }
}
