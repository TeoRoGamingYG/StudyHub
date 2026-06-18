package com.example.studyhub.decisionengine.enums;

import lombok.Getter;

@Getter
public enum StudyObjectiveEnum {

    JOB("Job", "Angajare"),
    EXAM("Exam Preparation", "Pregătire examen"),
    HOBBY("Personal Interest", "Hobby");

    private final String labelEn;
    private final String labelRo;

    StudyObjectiveEnum(String labelEn, String labelRo) {
        this.labelEn = labelEn;
        this.labelRo = labelRo;
    }
}
