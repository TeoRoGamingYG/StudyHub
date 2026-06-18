package com.example.studyhub.decisionengine.enums;

import lombok.Getter;

@Getter
public enum CourseLevelEnum {

    BEGINNER("Beginner", "Incepator"),
    INTERMEDIATE("Intermediate", "Intermediar"),
    ADVANCED("Advanced", "Avansat");

    private final String labelEn;
    private final String labelRo;

    CourseLevelEnum(String labelEn, String labelRo) {
        this.labelEn = labelEn;
        this.labelRo = labelRo;
    }
}
