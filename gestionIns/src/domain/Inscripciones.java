package com.protalento.bootcamp.registronotas.domain;

public class Inscripciones {
	
	private int id;
	private int id_materia; 
	private int id_alumno;
	private int id_curso; 
	
	public Inscripciones(int id_alumno, int id_curso, int id_materia) {
		this.id_alumno = id_alumno;
		this.id_curso = id_curso;
		this.id_materia = id_materia;
	}
	public Inscripciones() {
		
	}
	public int getId_materia() {
		return id_materia;
	}
	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Inscripciones [id=" + id + ", id_materia=" + id_materia + ", id_alumno=" + id_alumno + ", id_curso="
				+ id_curso ;
	}
	
	
	
}
