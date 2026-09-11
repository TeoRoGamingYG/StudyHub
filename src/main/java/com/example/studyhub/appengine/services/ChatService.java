package com.example.studyhub.appengine.services;

import com.example.studyhub.appengine.dto.ChatMessage;
import com.example.studyhub.jpa.entities.ChatMessageEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.ChatMessageRepository;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final UsersRepository usersRepository;

    public static final String ANNOUNCEMENTS_ROOM = "announcements";

    public static String groupRoom(String groupName) {
        return "group_" + groupName.replaceAll("[^a-zA-Z0-9]", "_");
    }

    @Transactional(readOnly = true)
    public List<ChatMessage> getMessages(String roomId, Long currentUserId) {
        return chatMessageRepository.findLast50ByRoomId(roomId)
                .stream()
                .map(m -> ChatMessage.from(m, currentUserId))
                .toList();
    }

    @Transactional
    public ChatMessage sendMessage(String roomId, String roomType,
                                   String content, Long senderId) {
        if (content == null || content.trim().isEmpty()) {
            throw new IllegalArgumentException("Conținutul mesajului nu poate fi gol");
        }

        UsersEntity sender = usersRepository.findById(senderId)
                .orElseThrow(() -> new IllegalArgumentException("User negăsit"));

        ChatMessageEntity msg = new ChatMessageEntity();
        msg.setRoomId(roomId);
        msg.setRoomType(roomType);
        msg.setContent(content.trim());
        msg.setSender(sender);
        msg.setSentAt(LocalDateTime.now());

        ChatMessageEntity saved = chatMessageRepository.save(msg);
        return ChatMessage.from(saved, senderId);
    }

    @Transactional
    public void deleteMessage(Long messageId, Long requesterId) {
        chatMessageRepository.findById(messageId).ifPresent(msg -> {
            UsersEntity requester = usersRepository.findById(requesterId).orElse(null);
            if (requester == null) return;

            boolean isAdmin = "ADMIN".equals(requester.getRole());
            boolean isOwner = msg.getSender().getId().equals(requesterId);

            if (isAdmin || isOwner) {
                msg.setIsDeleted(true);
                chatMessageRepository.save(msg);
            }
        });
    }
}