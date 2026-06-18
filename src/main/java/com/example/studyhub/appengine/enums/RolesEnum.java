package com.example.studyhub.appengine.enums;

import lombok.Getter;

@Getter
public enum RolesEnum {

    STUDENT("Student", "Student"),
    HIGHERSTUD("Higherstud", "Studenttutore"),
    ADMIN("Admin", "Admin");

    private final String labelEn;
    private final String labelRo;

    RolesEnum(String labelEn, String labelRo) {
        this.labelEn = labelEn;
        this.labelRo = labelRo;
    }
}
