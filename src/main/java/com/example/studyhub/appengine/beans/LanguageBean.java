package com.example.studyhub.appengine.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Locale;

@Named("languageBean")
@SessionScoped
public class LanguageBean implements Serializable {

    private String language = "ro";

    public String changeLanguage(String lang) {
        this.language = lang;

        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(new Locale(lang));

        return null;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Locale getCurrentLocale() {
        return new Locale(language);
    }
}