package com.mindhub.app_curso.models;

import jakarta.persistence.*;

@Entity
public class CursoAlumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Alumno alumno;

    public CursoAlumno() {
    }

    public CursoAlumno(Curso curso, Alumno alumno) {
        this.curso = curso;
        this.alumno = alumno;
    }

    public Long getId() {
        return id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
