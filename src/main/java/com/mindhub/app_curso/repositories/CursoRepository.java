package com.mindhub.app_curso.repositories;

import com.mindhub.app_curso.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
