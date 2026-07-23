package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.ContributorRequestEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.ContributorRequestRepository;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TeamApplicationService {

    private final JavaMailSender mailSender;
    private final UsersRepository usersRepository;
    private final ContributorRequestRepository requestRepository;

    @Value("${spring.mail.username}")
    private String appEmail;

//    @Value("${app.admin.email}")
//    private String adminEmail;

    @Transactional
    public void sendApplication(String fullName, String studyYear,
                                String specialization, String message,
                                String applicantEmail, Long userId) {

        // Verifică dacă există deja o cerere pending
        if (requestRepository.existsByUserIdAndStatus(userId, "PENDING")) {
            throw new IllegalStateException("Ai deja o cerere în așteptare!");
        }

        // Salvează în DB
        UsersEntity user = usersRepository.findById(userId).orElse(null);
        if (user != null) {
            ContributorRequestEntity request = new ContributorRequestEntity();
            request.setUser(user);
            request.setFullName(fullName);
            request.setStudyYear(studyYear);
            request.setSpecialization(specialization);
            request.setMessage(message);
            request.setStatus("PENDING");
            requestRepository.save(request);
        }

        // Trimite email notificare admin
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
                        "Poți gestiona cererea din panoul admin:\n" +
                        "http://localhost:8080/pages/admin/contributors.xhtml\n\n" +
                        "==================================="
        );
        mailSender.send(mail);
    }

    @Transactional
    public void approveRequest(Long requestId) {
        ContributorRequestEntity request = requestRepository.findById(requestId)
                .orElseThrow(() -> new IllegalArgumentException("Cerere negăsită"));

        // Schimbă rolul userului
        UsersEntity user = request.getUser();
        user.setRole("HIGHERSTUD");
        usersRepository.save(user);

        // Actualizează cererea
        request.setStatus("APPROVED");
        request.setReviewedAt(java.time.LocalDateTime.now());
        requestRepository.save(request);

        // Trimite email de confirmare utilizatorului
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(appEmail);
        mail.setTo(user.getEmail());
        mail.setSubject("Cerere aprobată - StudyHub Contributor");
        mail.setText(
                "Bună, " + user.getFirstName() + "!\n\n" +
                        "Felicitări! Cererea ta de a deveni contributor StudyHub a fost aprobată.\n" +
                        "Contul tău a fost actualizat și poți acum accesa funcționalitățile de contributor.\n\n" +
                        "Echipa StudyHub"
        );
        mailSender.send(mail);
    }

    @Transactional
    public void rejectRequest(Long requestId, String reason) {
        ContributorRequestEntity request = requestRepository.findById(requestId)
                .orElseThrow(() -> new IllegalArgumentException("Cerere negăsită"));

        request.setStatus("REJECTED");
        request.setRejectionReason(reason);
        request.setReviewedAt(java.time.LocalDateTime.now());
        requestRepository.save(request);

        // Trimite email de respingere
        UsersEntity user = request.getUser();
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(appEmail);
        mail.setTo(user.getEmail());
        mail.setSubject("Cerere respinsă - StudyHub Contributor");
        mail.setText(
                "Bună, " + user.getFirstName() + "!\n\n" +
                        "Îți mulțumim pentru interes, însă cererea ta nu a putut fi aprobată.\n\n" +
                        (reason != null && !reason.isEmpty()
                                ? "Motiv: " + reason + "\n\n"
                                : "") +
                        "Poți trimite o nouă cerere în viitor.\n\n" +
                        "Echipa StudyHub"
        );
        mailSender.send(mail);
    }

    public java.util.List<ContributorRequestEntity> getAllRequests() {
        return requestRepository.findAllByOrderByCreatedAtDesc();
    }

    public java.util.List<ContributorRequestEntity> getPendingRequests() {
        return requestRepository.findByStatusOrderByCreatedAtDesc("PENDING");
    }

    public long getPendingCount() {
        return requestRepository.countByStatus("PENDING");
    }
}
