package com.example.studyhub.appengine.controllers;

import com.example.studyhub.appengine.dto.ChatMessage;
import com.example.studyhub.appengine.services.ChatService;
import com.example.studyhub.appengine.beans.SessionBean;
import com.example.studyhub.appengine.services.NotificationService;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;
    private final SimpMessagingTemplate messagingTemplate;
    private final NotificationService notificationService;
    private final UsersRepository usersRepository;

    @MessageMapping("/chat.send")
    public void sendMessage(@Payload Map<String, String> payload,
                            Principal principal) {
        String roomId = payload.get("roomId");
        String roomType = payload.get("roomType");
        String content = payload.get("content");
        Long senderId = Long.parseLong(payload.get("senderId"));

        if (content == null || content.trim().isEmpty()) return;

        ChatMessage message = chatService.sendMessage(
                roomId, roomType, content, senderId
        );

        messagingTemplate.convertAndSend("/topic/chat/" + roomId, message);

        if ("ANNOUNCEMENTS".equals(roomType)) {
            usersRepository.findAll().stream()
                    .filter(u -> !u.getId().equals(senderId))
                    .filter(u -> Boolean.TRUE.equals(u.getActive()))
                    .forEach(u -> notificationService.notify(
                            u.getId(),
                            "Anunț nou",
                            message.getSenderName() + ": " + content,
                            "CHAT",
                            "/pages/student/chat.xhtml"
                    ));
        }

        if ("GROUP".equals(roomType)) {
            String groupName = roomId.replace("group_", "").replace("_", " ");
            usersRepository.findByGroupName(groupName).stream()
                    .filter(u -> !u.getId().equals(senderId))
                    .forEach(u -> notificationService.notify(
                            u.getId(),
                            "Mesaj nou în grupă",
                            message.getSenderName() + ": " + content,
                            "CHAT",
                            "/pages/student/chat.xhtml"
                    ));
        }
    }

    @MessageMapping("/chat.delete")
    public void deleteMessage(@Payload Map<String, String> payload) {
        Long messageId = Long.parseLong(payload.get("messageId"));
        Long requesterId = Long.parseLong(payload.get("requesterId"));
        String roomId = payload.get("roomId");

        chatService.deleteMessage(messageId, requesterId);

        // Notifică toți că mesajul a fost șters
        messagingTemplate.convertAndSend("/topic/chat/" + roomId,
                Map.of("type", "DELETE", "messageId", messageId));
    }

    @GetMapping("/api/chat/messages")
    @ResponseBody
    public java.util.List<ChatMessage> getMessages(
            @RequestParam String roomId,
            @RequestParam Long userId) {
        return chatService.getMessages(roomId, userId);
    }
}