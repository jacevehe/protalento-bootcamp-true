package com.protalento.bootcamp.registronotas.app;

import java.util.ArrayList;
import java.util.List;
import com.protalento.bootcamp.registronotas.domain.Alumno;
import com.protalento.bootcamp.registronotas.domain.Cursos;
import com.protalento.bootcamp.registronotas.domain.Inscripciones;
import com.protalento.bootcamp.registronotas.domain.Materia;

public class DBMemoria {
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	private List<Cursos> cursos = new ArrayList<Cursos>();
	private List<Materia> materias = new ArrayList<Materia>();
	private List<Inscripciones> inscripciones = new ArrayList<Inscripciones>();
	
	
	public DBMemoria(List<Alumno> alumnos, List<Cursos> cursos, List<Materia> materias,
			List<Inscripciones> inscripciones) {
		this.alumnos = alumnos;
		this.cursos = cursos;
		this.materias = materias;
		this.inscripciones = inscripciones;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public List<Cursos> getCursos() {
		return cursos;
	}
	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	public List<Inscripciones> getInscripciones() {
		return inscripciones;
	}
	public void setInscripciones(List<Inscripciones> inscripciones) {
		this.inscripciones = inscripciones;
	}
	
	

}
