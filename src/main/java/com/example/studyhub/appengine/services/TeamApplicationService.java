package com.example.studyhub.appengine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamApplicationService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String appEmail;

//    @Value("${app.admin.email}")
//    private String adminEmail;

    public void sendApplication(String fullName, String studyYear,
                                String specialization, String message,
                                String applicantEmail) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(appEmail);
        mail.setReplyTo(applicantEmail);
        mail.setTo(appEmail);
        mail.setSubject("Cerere nouă contributor: " + fullName);
        mail.setText(
                "=== CERERE CONTRIBUTOR STUDYHUB ===\n\n" +
                        "Nume complet: " + fullName + "\n" +
                        "Email: " + applicantEmail + "\n" +
                        "An de studiu: " + studyYear + "\n" +
                        "Specializare: " + specialization + "\n\n" +
                        "Mesaj:\n" + message + "\n\n" +
                        "==================================="
        );
        mailSender.send(mail);
    }
}
