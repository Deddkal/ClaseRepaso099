package com.mindhub.app_curso.dtos;

import com.mindhub.app_curso.models.Curso;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class CursoDTO {
    @NotNull
    private List<String> nombreAlumno;

    public CursoDTO() {
    }

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
