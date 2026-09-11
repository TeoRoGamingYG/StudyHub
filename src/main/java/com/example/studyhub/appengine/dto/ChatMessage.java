package com.example.studyhub.appengine.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class ChatMessage {
    private Long id;
    private String roomId;
    private String content;
    private Long senderId;
    private String senderName;
    private String senderInitials;
    private String senderRole;
    private String sentAt;
    private boolean canDelete;

    public static ChatMessage from(
            com.example.studyhub.jpa.entities.ChatMessageEntity entity,
            Long currentUserId) {

        ChatMessage dto = new ChatMessage();
        dto.setId(entity.getId());
        dto.setRoomId(entity.getRoomId());
        dto.setContent(entity.getContent());
        dto.setSenderId(entity.getSender().getId());
        dto.setSenderName(entity.getSender().getFirstName()
                + " " + entity.getSender().getLastName());
        dto.setSenderInitials(entity.getSender().getAvatarInitials());
        dto.setSenderRole(entity.getSender().getRole());
        dto.setSentAt(entity.getSentAt().format(
                DateTimeFormatter.ofPattern("HH:mm dd.MM")));
        dto.setCanDelete(
                "ADMIN".equals(entity.getSender().getRole()) ||
                        entity.getSender().getId().equals(currentUserId)
        );
        return dto;
    }
}