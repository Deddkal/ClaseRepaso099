package com.mindhub.app_curso.dtos;

import com.mindhub.app_curso.models.Profesor;

import java.util.List;

public class ProfesorDTO {

    private Long id;

    private String email;

    private List<String> nombreCursos;

    public ProfesorDTO(Profesor profesor){
        id = profesor.getId();
        email = profesor.getEmail();
        nombreCursos = profesor
                .getCursos()
                .stream()
                .map( curso -> curso.getNombre() )
                .toList();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getNombreCursos() {
        return nombreCursos;
    }
}
