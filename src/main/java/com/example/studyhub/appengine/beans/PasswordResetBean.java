package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.UserService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.security.SecureRandom;

@Named("passwordResetBean")
@RequestScoped
public class PasswordResetBean implements Serializable {

    @Inject
    private UserService userService;

    private String email;
    private String temporaryPassword;
    private boolean resetDone = false;

    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$!";

    public String reset() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (email == null || email.isBlank()) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Introduceți adresa de email.", null));
            return null;
        }

        var user = userService.findByEmail(email);

        if (user != null) {
            temporaryPassword = generateTemporaryPassword(10);
            userService.resetPassword(email, temporaryPassword);
        }

        resetDone = true;
        return null;
    }

    private String generateTemporaryPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARS.charAt(random.nextInt(CHARS.length())));
        }
        return sb.toString();
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTemporaryPassword() { return temporaryPassword; }
    public boolean isResetDone() { return resetDone; }
}