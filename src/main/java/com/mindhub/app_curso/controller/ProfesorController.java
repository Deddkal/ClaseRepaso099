package com.mindhub.app_curso.controller;

import com.mindhub.app_curso.dtos.CursoDTO;
import com.mindhub.app_curso.dtos.ProfesorDTO;
import com.mindhub.app_curso.models.Curso;
import com.mindhub.app_curso.repositories.CursoRepository;
import com.mindhub.app_curso.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profe")
public class ProfesorController {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public ProfesorDTO getProfesor(){
        return new ProfesorDTO(profesorRepository.findById(1L).orElse(null));
    }

    @GetMapping("/curso")
    public CursoDTO getCurso(){
        return new CursoDTO(cursoRepository.findById(1L).orElse(null));
    }

}