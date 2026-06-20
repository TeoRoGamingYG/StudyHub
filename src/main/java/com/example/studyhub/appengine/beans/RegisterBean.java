package com.example.studyhub.appengine.beans;

import com.example.studyhub.appengine.services.UserService;
import com.example.studyhub.jpa.entities.UsersEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Named("registerBean")
@RequestScoped
@Getter
@Setter
public class RegisterBean implements Serializable {

    @Inject
    private UserService userService;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
    private String cnp;
    private String registrationNumber;
    private String faculty;
    private String specialization;
    private Integer studyYear;
    private String role = "STUDENT";
    private String groupName;
    private Integer semester;
    private LocalDate dateOfBirth;

    public String register() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (!password.equals(confirmPassword)) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Parolele nu coincid", null));
            return null;
        }

        try {
            UsersEntity user = new UsersEntity();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(password);
            user.setCnp(cnp);
            user.setRegistrationNumber(registrationNumber);
            user.setFaculty(faculty);
            user.setSpecialization(specialization);
            user.setStudyYear(studyYear);
            user.setRole(role);
            user.setGroupName(groupName);
            user.setSemester(semester);
            user.setDateOfBirth(dateOfBirth);

            userService.register(user);

            context.getExternalContext()
                    .getFlash().put("registerSuccess", true);
            return "/main/login.xhtml?faces-redirect=true&justRegistered=true";

        } catch (IllegalArgumentException e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    e.getMessage(), null));
            return null;
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Eroare la înregistrare. Încercați din nou.", null));
            return null;
        }
    }

    public LocalDate getMaxDateOfBirth() {
        return LocalDate.now().minusYears(16);
    }

//    public String getFirstName() { return firstName; }
//    public void setFirstName(String firstName) { this.firstName = firstName; }
//
//    public String getLastName() { return lastName; }
//    public void setLastName(String lastName) { this.lastName = lastName; }
//
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
//
//    public String getPassword() { return password; }
//    public void setPassword(String password) { this.password = password; }
//
//    public String getConfirmPassword() { return confirmPassword; }
//    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }
//
//    public String getCnp() { return cnp; }
//    public void setCnp(String cnp) { this.cnp = cnp; }
//
//    public String getRegistrationNumber() { return registrationNumber; }
//    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
//
//    public String getFaculty() { return faculty; }
//    public void setFaculty(String faculty) { this.faculty = faculty; }
//
//    public String getSpecialization() { return specialization; }
//    public void setSpecialization(String specialization) { this.specialization = specialization; }
//
//    public Integer getStudyYear() { return studyYear; }
//    public void setStudyYear(Integer studyYear) { this.studyYear = studyYear; }
//
//    public String getRole() { return role; }
//    public void setRole(String role) { this.role = role; }
}