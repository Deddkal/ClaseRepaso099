package com.mindhub.app_curso.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    @OneToMany(mappedBy = "profesor")
    private Set<Curso> cursos = new HashSet<>();

    public Profesor() {
    }

    public Profesor(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonIgnore
    public Set<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso){
        curso.setProfesor(this);
        cursos.add(curso);
    }
}
