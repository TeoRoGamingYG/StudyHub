package com.example.studyhub.appengine.enums;

import lombok.Getter;

@Getter
public enum FileType {
    COURSE_MATERIAL("Course_Material", "Materiale_Curs"),
    EXAM_MODEL("Exam_Model", "Model_Examen"),
    PROJECT_MATERIAL("Project_Material", "Materiale_Proiect"),
    LABORATORY_MATERIAL("Laboratory_Material", "Materiale_Laborator"),
    OTHER("Other", "Altele");

    private final String labelEn;
    private final String labelRo;

    FileType(String labelEn, String labelRo) {
        this.labelEn = labelEn;
        this.labelRo = labelRo;
    }

    public String getLabel() { return labelRo; }
}
