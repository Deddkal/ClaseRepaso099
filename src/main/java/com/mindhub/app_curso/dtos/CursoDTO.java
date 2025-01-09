package com.mindhub.app_curso.dtos;

import com.mindhub.app_curso.models.Curso;

import java.util.List;

public class CursoDTO {

    private List<String> nombreAlumno;

    public CursoDTO (Curso curso){
        nombreAlumno = curso
                .getCursoAlumnos()
                .stream()
                .map( cursoAlumno -> cursoAlumno.getAlumno().getEmail())
                .toList();
    }

    public List<String> getNombreAlumno() {
        return nombreAlumno;
    }
}
