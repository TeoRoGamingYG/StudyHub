package com.example.studyhub.appengine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendVerificationEmail(String toEmail, String token) {
        String link = "http://localhost:8080/verify?token=" + token;

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Verificare cont StudyHub");
        message.setText("Bună!\n\nApasă linkul de mai jos pentru a-ți verifica contul:\n\n"
                + link + "\n\nDacă nu ai creat un cont, ignoră acest email.");
        mailSender.send(message);
    }
}