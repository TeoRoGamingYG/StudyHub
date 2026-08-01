package com.example.studyhub.appengine.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GradeImportRow {
    private int rowNumber;
    private String registrationNumber;
    private String courseName;
    private Integer grade;
    private String studentName;
    private String status; // OK, ERROR, DUPLICATE
    private String errorMessage;

    public boolean isValid() {
        return "OK".equals(status);
    }
}