package com.example.studyhub.appengine.services;

import com.example.studyhub.appengine.dto.GradeImportRow;
import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.entities.GradesEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.CoursesRepository;
import com.example.studyhub.jpa.repositories.GradesRepository;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeImportService {

    private final UsersRepository usersRepository;
    private final CoursesRepository coursesRepository;
    private final GradesRepository gradesRepository;

    public List<GradeImportRow> parseAndValidate(InputStream inputStream) {
        List<GradeImportRow> rows = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {

            String line;
            int rowNum = 0;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                rowNum++;

                if (firstLine) {
                    firstLine = false;
                    if (line.toLowerCase().contains("matricol") ||
                            line.toLowerCase().contains("nr") ||
                            line.toLowerCase().contains("student")) {
                        continue;
                    }
                }

                if (line.trim().isEmpty()) continue;

                GradeImportRow row = parseLine(line, rowNum);
                validateRow(row);
                rows.add(row);
            }

        } catch (Exception e) {
            GradeImportRow errorRow = new GradeImportRow();
            errorRow.setRowNumber(0);
            errorRow.setStatus("ERROR");
            errorRow.setErrorMessage("Eroare la citirea fișierului: " + e.getMessage());
            rows.add(errorRow);
        }

        return rows;
    }

    private GradeImportRow parseLine(String line, int rowNum) {
        GradeImportRow row = new GradeImportRow();
        row.setRowNumber(rowNum);

        try {
            String[] parts = line.contains(";")
                    ? line.split(";", -1)
                    : line.split(",", -1);

            if (parts.length < 3) {
                row.setStatus("ERROR");
                row.setErrorMessage("Format invalid — necesare 3 coloane: nr_matricol, curs, notă");
                return row;
            }

            row.setRegistrationNumber(parts[0].trim());
            row.setCourseName(parts[1].trim());
            row.setGrade(Integer.parseInt(parts[2].trim()));

        } catch (NumberFormatException e) {
            row.setStatus("ERROR");
            row.setErrorMessage("Nota nu este un număr valid");
        } catch (Exception e) {
            row.setStatus("ERROR");
            row.setErrorMessage("Eroare la parsare: " + e.getMessage());
        }

        return row;
    }

    private void validateRow(GradeImportRow row) {
        if (row.getStatus() != null && row.getStatus().equals("ERROR")) return;

        if (row.getGrade() == null || row.getGrade() < 1 || row.getGrade() > 10) {
            row.setStatus("ERROR");
            row.setErrorMessage("Nota trebuie să fie între 1 și 10");
            return;
        }

        UsersEntity student = usersRepository
                .findByRegistrationNumber(row.getRegistrationNumber());
        if (student == null) {
            row.setStatus("ERROR");
            row.setErrorMessage("Studentul cu nr. matricol '"
                    + row.getRegistrationNumber() + "' nu există");
            return;
        }
        row.setStudentName(student.getFirstName() + " " + student.getLastName());

        List<CoursesEntity> courses = coursesRepository
                .findByNameIgnoreCase(row.getCourseName());
        if (courses.isEmpty()) {
            row.setStatus("ERROR");
            row.setErrorMessage("Cursul '" + row.getCourseName() + "' nu există");
            return;
        }

        boolean exists = gradesRepository.existsByStudentRegistrationNumberAndCourseName(
                row.getRegistrationNumber(), row.getCourseName()
        );
        if (exists) {
            row.setStatus("DUPLICATE");
            row.setErrorMessage("Notă deja existentă pentru acest student și curs");
            return;
        }

        row.setStatus("OK");
    }

    @Transactional
    public int importRows(List<GradeImportRow> rows) {
        int imported = 0;

        for (GradeImportRow row : rows) {
            if (!"OK".equals(row.getStatus())) continue;

            try {
                UsersEntity student = usersRepository
                        .findByRegistrationNumber(row.getRegistrationNumber());
                List<CoursesEntity> courses = coursesRepository
                        .findByNameIgnoreCase(row.getCourseName());

                if (student == null || courses.isEmpty()) continue;

                GradesEntity grade = new GradesEntity();
                grade.setStudent(student);
                grade.setCourse(courses.get(0));
                grade.setGrade(row.getGrade());
                grade.setGradedAt(LocalDateTime.now());

                gradesRepository.save(grade);
                imported++;

            } catch (Exception e) {
                row.setStatus("ERROR");
                row.setErrorMessage("Eroare la import: " + e.getMessage());
            }
        }

        return imported;
    }
}