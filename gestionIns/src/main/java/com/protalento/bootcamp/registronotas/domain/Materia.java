package com.protalento.bootcamp.registronotas.domain;

public class Materia {

	private String descripcion; 
	private int id; 
	private String contenido;
	
	public Materia(String descripcion, int id, String contenido) {
		this.descripcion = descripcion;
		this.id = id;
		this.contenido = contenido;
	}
	
	public Materia() {
		
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	@Override
	public String toString() {
		return "Materia [descripcion=" + descripcion + ", id=" + id + ", contenido=" + contenido + "]";
	}
	
	
}
