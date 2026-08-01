package com.example.studyhub.appengine.controllers;

import com.example.studyhub.appengine.services.OpenKMService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.io.IOException;

@WebServlet("/api/files/preview")
public class FileDownloadServlet extends HttpServlet {

    @Autowired
    private OpenKMService openKmService;

    @Override
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(
                this, getServletContext()
        );
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws IOException {

        String docPath = req.getParameter("path");
        boolean inline = "true".equals(req.getParameter("inline"));

        if (docPath == null || docPath.isEmpty()) {
            resp.sendError(400, "Path lipsă");
            return;
        }

        try {
            byte[] content = openKmService.downloadDocument(docPath);

            String fileName = docPath.substring(docPath.lastIndexOf("/") + 1);
            String mime = guessMime(fileName);

            resp.setContentType(mime);
            resp.setContentLength(content.length);

            if (inline) {
                resp.setHeader("Content-Disposition",
                        "inline; filename=\"" + fileName + "\"");
            } else {
                resp.setHeader("Content-Disposition",
                        "attachment; filename=\"" + fileName + "\"");
            }

            resp.getOutputStream().write(content);

        } catch (Exception e) {
            resp.sendError(500, "Eroare: " + e.getMessage());
        }
    }

    private String guessMime(String fileName) {
        String lower = fileName.toLowerCase();
        if (lower.endsWith(".pdf")) return "application/pdf";
        if (lower.endsWith(".png")) return "image/png";
        if (lower.endsWith(".jpg") || lower.endsWith(".jpeg")) return "image/jpeg";
        if (lower.endsWith(".gif")) return "image/gif";
        if (lower.endsWith(".txt")) return "text/plain";
        if (lower.endsWith(".docx")) return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        if (lower.endsWith(".xlsx")) return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
        return "application/octet-stream";
    }
}