package com.mindhub.app_curso.repositories;

import com.mindhub.app_curso.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
