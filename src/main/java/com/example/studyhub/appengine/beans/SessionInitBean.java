package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.UserService;
import com.example.studyhub.jpa.entities.UsersEntity;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Named("sessionInitBean")
@RequestScoped
public class SessionInitBean {

    @Inject
    private SessionBean sessionBean;

    @Inject
    private UserService userService;

    @PostConstruct
    public void init() {
        // Dacă sessionBean nu e populat, îl populăm din Security context
        if (sessionBean.getUserId() == null) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth != null && auth.isAuthenticated() &&
                    !"anonymousUser".equals(auth.getPrincipal())) {

                String email = auth.getName();
                UsersEntity user = userService.findByEmail(email);
                if (user != null) {
                    sessionBean.populateFromEntity(user);
                }
            }
        }
    }
}