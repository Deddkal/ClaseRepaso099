package com.mindhub.app_curso.repositories;

import com.mindhub.app_curso.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Optional<Alumno> findByEmail(String email);

}
