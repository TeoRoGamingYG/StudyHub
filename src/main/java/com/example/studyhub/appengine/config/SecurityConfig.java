package com.example.studyhub.appengine.config;

import com.example.studyhub.appengine.services.StudyHubUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final StudyHubUserDetailsService userDetailsService;
    private final LoginSuccessHandler loginSuccessHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // Resurse publice
                        .requestMatchers(
                                "/main/login.xhtml",
                                "/main/register.xhtml",
                                "/main/forgot-password.xhtml",
                                "/verify",
                                "/jakarta.faces.resource/**",
                                "/resources/**",
                                "/error"
                        ).permitAll()
                        .requestMatchers("/ws-chat/**", "/api/chat/**").permitAll()
                        .requestMatchers("/pages/student/chat.xhtml")
                        .hasAnyAuthority("STUDENT", "HIGHERSTUD", "ADMIN",
                                "ROLE_STUDENT", "ROLE_HIGHERSTUD", "ROLE_ADMIN")
                        .requestMatchers("/pages/student/files.xhtml")
                        .hasAnyAuthority("HIGHERSTUD", "ADMIN", "ROLE_HIGHERSTUD", "ROLE_ADMIN")
                        // Rute admin
                        .requestMatchers("/pages/admin/**").hasAnyAuthority("ADMIN", "ROLE_ADMIN")
                        // Rute student
                        .requestMatchers("/pages/student/**", "/main/for-you.xhtml")
                        .hasAnyAuthority("STUDENT", "HIGHERSTUD", "ADMIN", "ROLE_STUDENT", "ROLE_HIGHERSTUD", "ROLE_ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/main/login.xhtml")
                        .loginProcessingUrl("/login")
                        .usernameParameter("loginForm:username")
                        .passwordParameter("loginForm:password")
                        .successHandler(loginSuccessHandler)
                        .failureUrl("/main/login.xhtml?error=true")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/main/login.xhtml")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                )
                .authenticationProvider(authenticationProvider())
                .csrf(csrf -> csrf.disable())
                .headers(headers -> headers
                        .frameOptions(frame -> frame.sameOrigin())
                );

        return http.build();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

