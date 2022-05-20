package com.protalento.bootcamp.registronotas.domain;

public class Alumno {

	private String nombres;
	private String apellidos;
	private int id;
	private String direccion;
	private String telefono;
	
	
	
	public Alumno(String nombres, String apellidos, int id, String direccion, String telefono) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.id = id;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "------------------------------------------------------"+"\n"+
				"No. documento: " + id + "\n"+
				"Nombre completo: " + nombres +" "+ apellidos +"\n"+
				"Dirección: "+direccion+"\n"+
				"Telefono:" + telefono+"\n"+
				"------------------------------------------------------";
	}
	
}
