package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.AdminUserService;
import com.example.studyhub.jpa.entities.UsersEntity;
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

@Named("adminUserBean")
@ViewScoped
@Getter @Setter
public class AdminUserBean implements Serializable {

    @Inject
    private AdminUserService adminUserService;

    private List<UsersEntity> users;
    private UsersEntity selectedUser;

    // Filtre
    private String searchQuery = "";
    private String filterRole = "";
    private String filterFaculty = "";

    @PostConstruct
    public void init() {
        loadUsers();
    }

    public void loadUsers() {
        users = adminUserService.searchUsers(searchQuery, filterRole, filterFaculty);
    }

    public void selectUser(UsersEntity user) {
        // Reîncarcă din DB pentru date fresh
        this.selectedUser = adminUserService.findById(user.getId());
    }

    public void saveUser() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminUserService.updateUser(selectedUser);
            loadUsers();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Utilizator actualizat cu succes!", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la salvare: " + e.getMessage(), null));
        }
    }

    public void toggleActive(UsersEntity user) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminUserService.toggleActive(user.getId());
            loadUsers();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Status utilizator modificat!", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare: " + e.getMessage(), null));
        }
    }

    public void resetPassword(UsersEntity user) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            String tempPassword = adminUserService.resetPassword(user.getId());
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Parolă resetată! Parola temporară: " + tempPassword, null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la resetare: " + e.getMessage(), null));
        }
    }

    public void deleteUser(UsersEntity user) {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminUserService.deleteUser(user.getId());
            loadUsers();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Utilizator șters!", null));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la ștergere: " + e.getMessage(), null));
        }
    }

    public List<String> getAvailableRoles() {
        return List.of("STUDENT", "HIGHERSTUD", "ADMIN");
    }

    public List<String> getAvailableFaculties() {
        return adminUserService.getDistinctFaculties();
    }

    public void resetFilters() {
        setSearchQuery("");
        setFilterRole("");
        setFilterFaculty("");
        loadUsers();
    }
}