package com.protalento.bootcamp.registronotas.domain;

public class Cursos {
	
	private int id;
	private String descripcion;
	private String codigo;
	private String jornada;
	
	public Cursos(String descripcion, String codigo, String jornada) {
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.jornada = jornada;
	}
	public Cursos() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getJornada() {
		return jornada;
	}
	public void setJornada(String jornada) {
		this.jornada = jornada;
	}
	@Override
	public String toString() {
		return "------------------------------------------------------"+"\n"+
				"No.: " + id + "\n"+
				"Descripción: "+descripcion+"\n"+
				"Grupo: " + codigo+"\n"+
				"Jornada:" + jornada+"\n"+
				"------------------------------------------------------";
	}
	
	
}
