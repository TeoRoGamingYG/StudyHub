package com.example.studyhub.appengine.controllers;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Named
@ViewScoped
@Getter
@Setter
public class TestController implements Serializable {

    private String nume = "";
    private String mesaj = "";

    public void saluta() {
        mesaj = "Bună, " + nume + "! PrimeFaces funcționează!";
    }
}
