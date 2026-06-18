package com.example.studyhub.decisionengine.enums;

import lombok.Getter;

@Getter
public enum StudentLevelEnum {

    HIGH_PERFORMER("High Performer", "Performant"),
    CONSISTENT("Consistent Learner", "Consecvent"),
    PROCRASTINATOR("Procrastinator", "Amana frecvent"),
    AT_RISK("At Risk", "In risc academic"),
    FAST_LEARNER("Fast Learner", "Invatare rapida"),
    STRUGGLING("Struggling Student", "Intampina dificultati"),
    INACTIVE("Inactive", "Inactiv"),
    IMPROVING("Improving", "Progreseaza"),
    DECLINING("Declining Performance", "Performanta in scadere");

    private final String labelEn;
    private final String labelRo;

    StudentLevelEnum(String labelEn, String labelRo) {
        this.labelEn = labelEn;
        this.labelRo = labelRo;
    }
}
