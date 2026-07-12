package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.CalendarEventEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.CalendarEventRepository;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CalendarService {

    private final CalendarEventRepository calendarEventRepository;
    private final UsersRepository usersRepository;

    public List<CalendarEventEntity> getVisibleEvents(Long userId) {
        return calendarEventRepository.findVisibleEvents(userId);
    }

    @Transactional
    public void saveEvent(CalendarEventEntity event) {
        calendarEventRepository.save(event);
    }

    @Transactional
    public void deleteEvent(Long eventId, Long userId) {
        calendarEventRepository.findById(eventId).ifPresent(event -> {
            // Poate șterge doar dacă e creatorul
            if (event.getCreatedBy() != null &&
                    event.getCreatedBy().getId().equals(userId)) {
                calendarEventRepository.delete(event);
            }
        });
    }

    public Optional<CalendarEventEntity> findById(Long id) {
        return calendarEventRepository.findById(id);
    }

    public UsersEntity getUserReference(Long userId) {
        return usersRepository.findById(userId).orElse(null);
    }
}