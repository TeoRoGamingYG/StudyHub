package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.NotificationsEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.NotificationsRepository;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationsRepository notificationRepository;
    private final UsersRepository usersRepository;

    @Transactional
    public void notify(Long userId, String title,
                       String message, String type, String linkUrl) {
        UsersEntity user = usersRepository.findById(userId).orElse(null);
        if (user == null) return;

        NotificationsEntity notif = new NotificationsEntity();
        notif.setUser(user);
        notif.setTitle(title);
        notif.setMessage(message);
        notif.setType(type);
        notif.setLinkUrl(linkUrl);
        notif.setIsRead(false);
        notif.setCreatedAt(LocalDateTime.now());
        notificationRepository.save(notif);
    }

    @Transactional
    public void notifyGroup(String groupName, String title,
                            String message, String type, String linkUrl) {
        usersRepository.findByGroupName(groupName).forEach(user ->
                notify(user.getId(), title, message, type, linkUrl)
        );
    }

    // Notifică toți studenții unui curs
    @Transactional
    public void notifyByCourse(Long courseId, String title,
                               String message, String type, String linkUrl) {
        usersRepository.findStudentsByCourseId(courseId).forEach(user ->
                notify(user.getId(), title, message, type, linkUrl)
        );
    }

    public List<NotificationsEntity> getRecent(Long userId) {
        return notificationRepository
                .findTop20ByUserIdOrderByCreatedAtDesc(userId);
    }

    public long getUnreadCount(Long userId) {
        return notificationRepository
                .countByUserIdAndIsReadFalse(userId);
    }

    @Transactional
    public void markAllRead(Long userId) {
        notificationRepository.markAllReadByUserId(userId);
    }

    @Transactional
    public void markRead(Long notifId) {
        notificationRepository.findById(notifId).ifPresent(n -> {
            n.setIsRead(true);
            notificationRepository.save(n);
        });
    }
}
