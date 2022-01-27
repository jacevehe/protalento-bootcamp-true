package ar.com.educationit.semana9.domain;

public class Estudiante {

	private String nombres; 
	private String apellidos; 
	private Long id;
	
	
	public Estudiante(String nombres, String apellidos, Long id) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.id = id;
	}
	
	public Estudiante(String nombres, String apellidos) {
		this.nombres = nombres;
		this.apellidos = apellidos;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombres + ", apellidos=" + apellidos + ", id=" + id + "]";
	}
	
	
	
}
