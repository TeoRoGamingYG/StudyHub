package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.TeamApplicationService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Named("teamAppBean")
@ViewScoped
@Getter @Setter
public class TeamApplicationBean implements Serializable {

    @Inject
    private TeamApplicationService teamApplicationService;

    @Inject
    private SessionBean sessionBean;

    private String fullName;
    private String studyYear;
    private String specialization;
    private String message;

    private boolean submitted = false;
    private boolean error = false;

    public void init() {
        this.fullName = sessionBean.getFullName();
        this.studyYear = sessionBean.getStudyYear() != null
                ? "Anul " + sessionBean.getStudyYear() : "";
        this.specialization = sessionBean.getSpecialization();
        this.message = "";
        this.submitted = false;
        this.error = false;
    }

    public void submit() {
        try {
            teamApplicationService.sendApplication(
                    fullName,
                    studyYear,
                    specialization,
                    message,
                    sessionBean.getEmail()
            );
            submitted = true;
            error = false;
        } catch (Exception e) {
            error = true;
        }
    }
}