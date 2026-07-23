package com.example.studyhub.appengine.config;

import com.example.studyhub.appengine.beans.SessionBean;
import com.example.studyhub.appengine.services.UserService;
import com.example.studyhub.jpa.entities.UsersEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private final UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        String email = authentication.getName();
        UsersEntity user = userService.findByEmail(email);

        if (user != null) {
            // Populează SessionBean
            SessionBean sessionBean = getSessionBean(request);
            if (sessionBean != null) {
                sessionBean.populateFromEntity(user);
            }

            // Actualizează last login
            userService.updateLastLogin(email);

            // Redirecționează în funcție de rol
            String redirectUrl;
            switch (user.getRole()) {
                case "ADMIN":
                    redirectUrl = request.getContextPath() + "/pages/admin/dashboard.xhtml";
                    break;
                case "HIGHERSTUD":
                case "STUDENT":
                default:
                    redirectUrl = request.getContextPath() + "/main/for-you.xhtml";
                    break;
            }
            response.sendRedirect(redirectUrl);
        } else {
            response.sendRedirect(request.getContextPath() + "/main/login.xhtml?error=true");
        }
    }

    private SessionBean getSessionBean(HttpServletRequest request) {
        try {
            jakarta.servlet.http.HttpSession session = request.getSession(false);
            if (session == null) session = request.getSession(true);
            
            SessionBean sb = (SessionBean) session.getAttribute("studyhub_session_bean");
            if (sb == null) {
                sb = new SessionBean();
                session.setAttribute("studyhub_session_bean", sb);
            }
            return sb;
        } catch (Exception e) {
            return null;
        }
    }
}