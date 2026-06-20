package com.example.studyhub.appengine.controllers;

import com.example.studyhub.appengine.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class VerifyController {

    private final UserService userService;

    @GetMapping("/verify")
    public String verify(@RequestParam String token) {
        boolean success = userService.verifyEmail(token);
        if (success) {
            return "redirect:/main/login.xhtml?verified=true";
        }
        return "redirect:/main/login.xhtml?verified=false";
    }
}