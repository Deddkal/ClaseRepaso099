package com.mindhub.app_curso.repositories;

import com.mindhub.app_curso.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
