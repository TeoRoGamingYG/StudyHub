package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.NotificationService;
import com.example.studyhub.jpa.entities.NotificationsEntity;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Named("notifBean")
@ViewScoped
@Getter
@Setter
public class NotificationBean implements Serializable {

    @Inject
    private NotificationService notificationService;

    @Inject
    private SessionBean sessionBean;

    private List<NotificationsEntity> notifications;
    private long unreadCount;

    @PostConstruct
    public void init() {
        loadNotifications();
    }

    public void loadNotifications() {
        if (sessionBean.getUserId() == null) return;
        notifications = notificationService.getRecent(sessionBean.getUserId());
        unreadCount = notificationService.getUnreadCount(sessionBean.getUserId());
    }

    public void markAllRead() {
        notificationService.markAllRead(sessionBean.getUserId());
        loadNotifications();
        PrimeFaces.current().ajax().update("notifPanel");
    }

    public String getTypeIcon(String type) {
        if (type == null) return "🔔";
        return switch (type) {
            case "FILE" -> "📁";
            case "GRADE" -> "📊";
            case "CHAT" -> "💬";
            default -> "🔔";
        };
    }

    public String getTimeAgo(LocalDateTime dateTime) {
        if (dateTime == null) return "";
        long minutes = java.time.temporal.ChronoUnit.MINUTES
                .between(dateTime, LocalDateTime.now());
        if (minutes < 1) return "acum";
        if (minutes < 60) return minutes + " min";
        long hours = minutes / 60;
        if (hours < 24) return hours + "h";
        return dateTime.format(
                java.time.format.DateTimeFormatter.ofPattern("dd.MM"));
    }

    public void openPanel() {
        loadNotifications();
        if (unreadCount > 0) {
            notificationService.markAllRead(sessionBean.getUserId());
            unreadCount = 0;
        }
    }

    public void refreshCount() {
        if (sessionBean.getUserId() == null) return;
        unreadCount = notificationService.getUnreadCount(sessionBean.getUserId());
    }
}
