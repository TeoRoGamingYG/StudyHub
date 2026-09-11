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
import org.primefaces.PrimeFaces;

import java.io.Serializable;
import java.util.List;

@Named("adminUserBean")
@ViewScoped
@Getter @Setter
public class AdminUserBean implements Serializable {

    @Inject
    private AdminUserService adminUserService;

    @Inject
    private SessionBean sessionBean;

    private List<UsersEntity> users;
    private UsersEntity selectedUser;

    private String searchQuery = "";
    private String filterRole = "";
    private String filterFaculty = "";

    private String tempPassword;
    private String resetPasswordUserName;

    @PostConstruct
    public void init() {
        loadUsers();
    }

    public void loadUsers() {
        users = adminUserService.searchUsers(searchQuery, filterRole, filterFaculty);
    }

    public void selectUser(UsersEntity user) {
        this.selectedUser = adminUserService.findById(user.getId());
    }

    public void saveUser() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminUserService.updateUser(selectedUser);

            if (selectedUser.getId().equals(sessionBean.getUserId())) {
                UsersEntity updated = adminUserService.findById(selectedUser.getId());
                sessionBean.populateFromEntity(updated);
            }

            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Utilizator actualizat cu succes!", null));

            PrimeFaces.current().ajax().update("usersForm", "editUserForm");
            PrimeFaces.current().executeScript("PF('editUserDialog').hide()");

        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la salvare: " + e.getMessage(), null));
        }
    }

    public void toggleActiveConfirmed() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            adminUserService.toggleActive(selectedUser.getId());
            loadUsers();

            boolean newStatus = !Boolean.TRUE.equals(selectedUser.getActive());
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    selectedUser.getFirstName() + " " + selectedUser.getLastName() +
                            (newStatus ? " a fost activat." : " a fost dezactivat."), null));

        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare: " + e.getMessage(), null));
        }
    }

    public void resetPasswordConfirmed() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            tempPassword = adminUserService.resetPassword(selectedUser.getId());
            resetPasswordUserName = selectedUser.getFirstName()
                    + " " + selectedUser.getLastName();

        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la resetare: " + e.getMessage(), null));
        }
    }

    public void deleteUserConfirmed() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (selectedUser.getId().equals(sessionBean.getUserId())) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_WARN,
                    "Nu poți șterge propriul cont!", null));
            return;
        }

        try {
            String name = selectedUser.getFirstName() + " " + selectedUser.getLastName();
            adminUserService.deleteUser(selectedUser.getId());
            loadUsers();
            selectedUser = null;

            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Utilizatorul " + name + " a fost șters.", null));

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