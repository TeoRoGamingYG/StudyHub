package com.example.studyhub.appengine.enums;

import lombok.Getter;

@Getter
public enum FileStatusEnum {
    OK("Ok", "Ok"),
    TOO_BIG("TooBig", "PreaMare"),
    CORRUPTED("Corrupted", "Corupt"),
    VIRUSED("Virused", "Virusat"),;

    private final String labelEn;
    private final String labelRo;

    FileStatusEnum(String labelEn, String labelRo) {
        this.labelEn = labelEn;
        this.labelRo = labelRo;
    }
}
