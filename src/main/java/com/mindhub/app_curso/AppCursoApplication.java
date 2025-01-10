package com.mindhub.app_curso;

import com.mindhub.app_curso.models.Alumno;
import com.mindhub.app_curso.models.Curso;
import com.mindhub.app_curso.models.CursoAlumno;
import com.mindhub.app_curso.models.Profesor;
import com.mindhub.app_curso.repositories.AlumnoRepository;
import com.mindhub.app_curso.repositories.CursoAlumnoRepository;
import com.mindhub.app_curso.repositories.CursoRepository;
import com.mindhub.app_curso.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class AppCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCursoApplication.class, args);
	}

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public CommandLineRunner initData(ProfesorRepository profesorRepository,
									  CursoRepository cursoRepository,
									  AlumnoRepository alumnoRepository,
									  CursoAlumnoRepository cursoAlumnoRepository){
		return args -> {
			Profesor profesor = new Profesor("mail@mail.com", "123456");
			profesorRepository.save(profesor);
			Curso curso = new Curso("HTML");
			profesor.addCurso(curso);
			cursoRepository.save(curso);

			Curso curso1 = new Curso("CSS");
			cursoRepository.save(curso1);

			Alumno alumno = new Alumno("alumno1", passwordEncoder.encode("123456"));
			Alumno alumno1 = new Alumno("alumno2", passwordEncoder.encode("123456"));
			Alumno alumno2 = new Alumno("alumno3", passwordEncoder.encode("123456"));
			alumnoRepository.save(alumno);
			alumnoRepository.save(alumno1);
			alumnoRepository.save(alumno2);
			CursoAlumno cursoAlumno = new CursoAlumno(curso, alumno);
			CursoAlumno cursoAlumno1 = new CursoAlumno(curso, alumno1);
			CursoAlumno cursoAlumno2 = new CursoAlumno(curso, alumno2);
			cursoAlumnoRepository.saveAll(List.of(cursoAlumno, cursoAlumno2, cursoAlumno1));

		};
	}
}
