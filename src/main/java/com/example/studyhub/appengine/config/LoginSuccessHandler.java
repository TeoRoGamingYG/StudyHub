package com.example.studyhub.appengine.config;

import com.example.studyhub.appengine.beans.SessionBean;
import com.example.studyhub.jpa.entities.UsersEntity;
import com.example.studyhub.jpa.repositories.UsersRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    private final UsersRepository usersRepository;
    private final SessionBean sessionBean;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
            throws IOException {

        UsersEntity user = usersRepository.findByEmail(authentication.getName());

        if (user != null) {
            user.setLastLogin(LocalDateTime.now());
            usersRepository.save(user);
            sessionBean.populateFromEntity(user);
        }

        String redirectUrl = resolveRedirectUrl(request, user);
        response.sendRedirect(redirectUrl);
    }

    private String resolveRedirectUrl(HttpServletRequest request, UsersEntity user) {
        if (user == null) {
            return request.getContextPath() + "/main/login.xhtml?error=true";
        }

        return switch (user.getRole()) {
            case "ADMIN" -> request.getContextPath() + "/pages/admin/dashboard.xhtml";
            case "HIGHERSTUD" -> request.getContextPath() + "/main/for-you.xhtml";
            default -> request.getContextPath() + "/main/for-you.xhtml";
        };
    }
}