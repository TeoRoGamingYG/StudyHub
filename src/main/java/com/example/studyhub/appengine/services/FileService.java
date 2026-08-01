package com.example.studyhub.appengine.services;

import com.example.studyhub.jpa.entities.CourseUploadEntity;
import com.example.studyhub.jpa.entities.FilesEntity;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.entities.CoursesEntity;
import com.example.studyhub.jpa.repositories.CourseUploadRepository;
import com.example.studyhub.jpa.repositories.FilesRepository;
import com.example.studyhub.jpa.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FileService {

    private final OpenKMService openKmService;
    private final FilesRepository filesRepository;
    private final CourseUploadRepository courseUploadRepository;
    private final UsersRepository usersRepository;

    @Transactional
    public void uploadFile(byte[] content,
                           String fileName,
                           String mimeType,
                           Long uploaderId,
                           CoursesEntity course) {

        UsersEntity uploader =
                usersRepository.findById(uploaderId).orElse(null);

        openKmService.ensureCourseFolder(
                course.getName(),
                course.getId());

        String folder =
                openKmService.getCourseFolder(
                        course.getId(),
                        course.getName());

        try {

            openKmService.uploadDocument(
                    folder,
                    fileName,
                    content,
                    mimeType);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        FilesEntity file = new FilesEntity();

        file.setFileName(fileName);
        file.setFilePath(folder + "/" + fileName);
        file.setFileSize((long) content.length);
        file.setMimeType(mimeType);
        file.setUploadedBy(uploader);
        file.setUploadedAt(LocalDateTime.now());
        file.setStatus("OK");

        filesRepository.save(file);

        if (course != null && uploader != null) {

            CourseUploadEntity upload = new CourseUploadEntity();
            upload.setCourse(course);
            upload.setStudent(uploader);
            upload.setFile(file);
            upload.setUploadedAt(LocalDateTime.now());

            courseUploadRepository.save(upload);
        }
    }

    public void deleteFileByPath(String path) {
        filesRepository.findByFilePath(path)
                .ifPresent(f -> filesRepository.deleteById(f.getId()));
    }

    @Transactional
    public void deleteFile(Long fileId) {
        FilesEntity file = filesRepository.findById(fileId)
                .orElseThrow(() -> new IllegalArgumentException("Fișier negăsit"));

        try {
            openKmService.deleteDocument(file.getFilePath());
        } catch (Exception e) {
            // Continua chiar daca OpenKM esueaza
        }

        filesRepository.deleteById(fileId);
    }
}