package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.TeamApplicationService;
import com.example.studyhub.jpa.entities.ContributorRequestEntity;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Named("contributorBean")
@ViewScoped
@Getter @Setter
public class ContributorBean implements Serializable {

    @Inject
    private TeamApplicationService teamApplicationService;

    private List<ContributorRequestEntity> requests;
    private ContributorRequestEntity selectedRequest;
    private String filterStatus = "PENDING";
    private String rejectionReason = "";

    @PostConstruct
    public void init() {
        loadRequests();
    }

    public void loadRequests() {
        if ("ALL".equals(filterStatus)) {
            requests = teamApplicationService.getAllRequests();
        } else {
            requests = teamApplicationService.getPendingRequests();
        }
    }

    public void selectRequest(ContributorRequestEntity request) {
        this.selectedRequest = request;
        this.rejectionReason = "";
    }

    public void approve() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            teamApplicationService.approveRequest(selectedRequest.getId());
            loadRequests();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Cerere aprobată! Utilizatorul are acum rol HIGHERSTUD.", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare: " + e.getMessage(), null));
        }
    }

    public void reject() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            teamApplicationService.rejectRequest(selectedRequest.getId(), rejectionReason);
            loadRequests();
            rejectionReason = "";
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Cerere respinsă și email trimis utilizatorului.", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare: " + e.getMessage(), null));
        }
    }

    public long getPendingCount() {
        return teamApplicationService.getPendingCount();
    }

    public String getStatusLabel(String status) {
        return switch (status) {
            case "PENDING" -> "În așteptare";
            case "APPROVED" -> "Aprobat";
            case "REJECTED" -> "Respins";
            default -> status;
        };
    }

    public String getStatusClass(String status) {
        return switch (status) {
            case "PENDING" -> "status-pending";
            case "APPROVED" -> "promoted";
            case "REJECTED" -> "failed";
            default -> "";
        };
    }
}