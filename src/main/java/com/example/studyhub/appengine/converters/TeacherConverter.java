package com.example.studyhub.appengine.converters;

import com.example.studyhub.jpa.entities.TeachersEntity;
import com.example.studyhub.jpa.repositories.TeachersRepository;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@FacesConverter(value = "teacherConverter", managed = true)
public class TeacherConverter implements Converter<TeachersEntity> {

    @Inject
    private TeachersRepository teachersRepository;

    @Override
    public TeachersEntity getAsObject(FacesContext ctx,
                                      UIComponent comp,
                                      String value) {
        if (value == null || value.isEmpty()) return null;
        return teachersRepository.findById(Long.parseLong(value)).orElse(null);
    }

    @Override
    public String getAsString(FacesContext ctx,
                              UIComponent comp,
                              TeachersEntity teacher) {
        if (teacher == null) return "";
        return String.valueOf(teacher.getId());
    }
}