package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.CalendarService;
import com.example.studyhub.jpa.entities.CalendarEventEntity;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Named("calendarBean")
@ViewScoped
@Getter @Setter
public class CalendarBean implements Serializable {

    @Getter @Setter
    public static class ColorOption implements Serializable {
        private String value;
        public ColorOption(String value) { this.value = value; }
    }

    @Inject
    private CalendarService calendarService;

    @Inject
    private SessionBean sessionBean;

    private ScheduleModel scheduleModel;

    // Form pentru eveniment nou/edit
    private String eventTitle;
    private String eventDescription;
    private Date eventStart;
    private Date eventEnd;
    private boolean eventAllDay = false;
    private String eventColor = "#4f6ef7";
    private boolean eventPublic = true;

    // Evenimentul selectat pentru vizualizare/ștergere
    private DefaultScheduleEvent<?> selectedEvent;
    private Long selectedEventId;
    private boolean canDeleteSelected = false;

    // Dialog mode
    private boolean editMode = false;

    @PostConstruct
    public void init() {
        loadEvents();
    }

    public void loadEvents() {
        scheduleModel = new DefaultScheduleModel();
        List<CalendarEventEntity> events =
                calendarService.getVisibleEvents(sessionBean.getUserId());

        for (CalendarEventEntity e : events) {
            DefaultScheduleEvent<?> event = DefaultScheduleEvent.builder()
                    .title(e.getTitle())
                    .startDate(toLocalDateTime(e.getStartTime()))
                    .endDate(e.getEndTime() != null ? toLocalDateTime(e.getEndTime())
                            : toLocalDateTime(e.getStartTime()))
                    .description(e.getDescription())
                    .allDay(Boolean.TRUE.equals(e.getAllDay()))
                    .backgroundColor(e.getColor())
                    .borderColor(e.getColor())
                    .data(e.getId())
                    .build();
            scheduleModel.addEvent(event);
        }
    }

    public void onEventSelect(SelectEvent<ScheduleEvent<?>> selectEvent) {
        ScheduleEvent<?> event = selectEvent.getObject();
        selectedEventId = (Long) event.getData();
        selectedEvent = (DefaultScheduleEvent<?>) event;

        // Verifică dacă userul poate șterge
        calendarService.findById(selectedEventId).ifPresent(e -> {
            canDeleteSelected = e.getCreatedBy() != null &&
                    e.getCreatedBy().getId().equals(sessionBean.getUserId());
        });
    }

    public void onDateSelect(SelectEvent<LocalDateTime> selectEvent) {
        // Deschide dialogul de creare cu data pre-selectată
        resetForm();
        eventStart = toDate(selectEvent.getObject());
        eventEnd = toDate(selectEvent.getObject().plusHours(1));
        editMode = false;
    }

    public void resetForm() {
        eventTitle = "";
        eventDescription = "";
        eventStart = null;
        eventEnd = null;
        eventAllDay = false;
        eventColor = "#4f6ef7";
        // Doar HIGHERSTUD poate crea evenimente publice
        eventPublic = "HIGHERSTUD".equals(sessionBean.getRole());
        editMode = false;
    }

    public void saveEvent() {
        CalendarEventEntity entity = new CalendarEventEntity();
        entity.setTitle(eventTitle);
        entity.setDescription(eventDescription);
        entity.setStartTime(toLocalDateTime(eventStart));
        entity.setEndTime(eventEnd != null ? toLocalDateTime(eventEnd) : null);
        entity.setAllDay(eventAllDay);
        entity.setColor(eventColor);
        entity.setIsPublic(eventPublic);
        entity.setCreatedBy(calendarService.getUserReference(sessionBean.getUserId()));

        calendarService.saveEvent(entity);
        loadEvents();
        resetForm();
    }

    public void deleteEvent() {
        if (selectedEventId != null) {
            calendarService.deleteEvent(selectedEventId, sessionBean.getUserId());
            loadEvents();
            selectedEventId = null;
            selectedEvent = null;
        }
    }

    // Culori predefinite pentru picker
    public List<String> getColorOptions() {
        return List.of(
                "#4f6ef7", "#6c63ff", "#43e97b", "#ff6584",
                "#ffc107", "#f75f6e", "#00b4d8", "#ff9f43"
        );
    }

    // Helpers conversie
    private LocalDateTime toLocalDateTime(Date date) {
        if (date == null) return null;
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    private LocalDateTime toLocalDateTime(LocalDateTime ldt) {
        return ldt;
    }

    private Date toDate(LocalDateTime ldt) {
        if (ldt == null) return null;
        return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
    }
}