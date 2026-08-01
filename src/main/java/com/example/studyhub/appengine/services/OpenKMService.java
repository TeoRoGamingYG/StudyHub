package com.example.studyhub.appengine.services;

import com.example.studyhub.openkm.auth.OKMAuth;
import com.example.studyhub.openkm.auth.OKMAuth_Service;
import com.example.studyhub.openkm.document.Document;
import com.example.studyhub.openkm.document.OKMDocument;
import com.example.studyhub.openkm.document.OKMDocument_Service;
import com.example.studyhub.openkm.folder.Folder;
import com.example.studyhub.openkm.folder.OKMFolder;
import com.example.studyhub.openkm.folder.OKMFolder_Service;
import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.mail.util.ByteArrayDataSource;
import jakarta.xml.ws.BindingProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

@Service
public class OpenKMService {

    @Value("${openkm.url}")
    private String serverUrl;

    @Value("${openkm.username}")
    private String username;

    @Value("${openkm.password}")
    private String password;

    private static final String BASE_FOLDER = "/okm:root/StudyHub";

    private final OKMAuth authPort;
    private final OKMDocument documentPort;
    private final OKMFolder folderPort;

    private String token;

    public OpenKMService() {

        OKMAuth_Service authService = new OKMAuth_Service();
        OKMDocument_Service documentService = new OKMDocument_Service();
        OKMFolder_Service folderService = new OKMFolder_Service();

        authPort = authService.getOKMAuthPort();
        documentPort = documentService.getOKMDocumentPort();
        folderPort = folderService.getOKMFolderPort();
    }

    /**
     * Login dacă nu există deja token.
     */
    private void login() throws Exception {

        if (token != null) {
            return;
        }

        token = authPort.login(username, password);
    }

    public String getBaseFolder() {
        return BASE_FOLDER;
    }

    public String getCourseFolder(Long id, String courseName) {

        return BASE_FOLDER +
                "/cursuri/" +
                id +
                "_" +
                courseName.replace(" ", "_");
    }

    /**
     * Creează folder dacă nu există.
     */
    public void createFolder(String path) {

        try {

            login();

            folderPort.createSimple(token, path);

        } catch (Exception ignored) {

            // există deja
        }
    }

    public void ensureCourseFolder(String courseName, Long courseId) {

        createFolder(getCourseFolder(courseId, courseName));

    }

    /**
     * Upload document.
     */
    public void uploadDocument(String folderPath,
                               String fileName,
                               byte[] bytes,
                               String mimeType) throws Exception {

        login();

        Document doc = new Document();

        doc.setPath(folderPath + "/" + fileName);
        doc.setMimeType(mimeType);

        DataSource ds =
                new ByteArrayDataSource(bytes, mimeType);

        DataHandler handler =
                new DataHandler(ds);

        documentPort.create(token, doc, handler);
    }

    /**
     * Documentele din folder.
     */
    public List<Document> getDocumentsInFolder(String folderPath) {

        try {

            login();

            return documentPort.getChildren(token, folderPath);

        } catch (Exception e) {

            return Collections.emptyList();
        }
    }

    /**
     * Download document.
     */
    public byte[] downloadDocument(String path) throws Exception {

        login();

        DataHandler handler =
                documentPort.getContent(token, path, false);

        InputStream in = handler.getInputStream();

        return in.readAllBytes();
    }

    /**
     * Preview = download.
     */
    public byte[] getDocumentPreview(String path) throws Exception {

        return downloadDocument(path);

    }

    /**
     * Ștergere document.
     */
    public void deleteDocument(String path) throws Exception {

        login();

        documentPort.delete(token, path);

    }

    /**
     * Proprietăți document.
     */
    public Document getDocument(String path) throws Exception {

        login();

        return documentPort.getProperties(token, path);

    }

    /**
     * Logout.
     */
    public void logout() {

        try {

            if (token != null) {

                authPort.logout(token);

                token = null;

            }

        } catch (Exception ignored) {
        }

    }

}