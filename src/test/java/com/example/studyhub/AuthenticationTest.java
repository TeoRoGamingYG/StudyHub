package com.example.studyhub;

import com.example.studyhub.appengine.services.UserService;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.UsersRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Scenariu 1 - Autentificarea unui student")
class AuthenticationTest {

    @Mock
    private UsersRepository usersRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    private UsersEntity mockUser;

    @BeforeEach
    void setUp() {
        mockUser = new UsersEntity();
        mockUser.setId(1L);
        mockUser.setEmail("student@test.com");
        mockUser.setPassword("$2a$10$hashedPassword");
        mockUser.setFirstName("Ion");
        mockUser.setLastName("Popescu");
        mockUser.setRole("STUDENT");
        mockUser.setEmailConfirmed(true);
        mockUser.setActive(true);
    }

    @Test
    @DisplayName("1.1 - Utilizatorul există în baza de date")
    void testUserExists() {
        when(usersRepository.findByEmail("student@test.com"))
                .thenReturn(mockUser);

        UsersEntity found = userService.findByEmail("student@test.com");

        assertNotNull(found, "Utilizatorul trebuie să existe");
        assertEquals("student@test.com", found.getEmail());
    }

    @Test
    @DisplayName("1.2 - Emailul este confirmat")
    void testEmailConfirmed() {
        when(usersRepository.findByEmail("student@test.com"))
                .thenReturn(mockUser);

        UsersEntity found = userService.findByEmail("student@test.com");

        assertTrue(found.getEmailConfirmed(),
                "Emailul trebuie să fie confirmat pentru autentificare");
    }

    @Test
    @DisplayName("1.3 - Contul este activ")
    void testAccountActive() {
        when(usersRepository.findByEmail("student@test.com"))
                .thenReturn(mockUser);

        UsersEntity found = userService.findByEmail("student@test.com");

        assertTrue(found.getActive(),
                "Contul trebuie să fie activ pentru autentificare");
    }

    @Test
    @DisplayName("1.4 - Rolul este STUDENT")
    void testUserRole() {
        when(usersRepository.findByEmail("student@test.com"))
                .thenReturn(mockUser);

        UsersEntity found = userService.findByEmail("student@test.com");

        assertEquals("STUDENT", found.getRole(),
                "Rolul utilizatorului trebuie să fie STUDENT");
    }

    @Test
    @DisplayName("1.5 - Utilizatorul inexistent returnează null")
    void testUserNotFound() {
        when(usersRepository.findByEmail("inexistent@test.com"))
                .thenReturn(null);

        UsersEntity found = userService.findByEmail("inexistent@test.com");

        assertNull(found, "Utilizatorul inexistent trebuie să returneze null");
    }

    @Test
    @DisplayName("1.6 - Actualizare last login la autentificare reușită")
    void testLastLoginUpdated() {
        when(usersRepository.findByEmail("student@test.com"))
                .thenReturn(mockUser);
        when(usersRepository.save(any())).thenReturn(mockUser);

        userService.updateLastLogin("student@test.com");

        verify(usersRepository, times(1)).save(mockUser);
        assertNotNull(mockUser.getLastLogin(),
                "LastLogin trebuie actualizat după autentificare");
    }
}