package ar.com.educationit.semana9.domain;

public class Curso {
	
	private Long id;
	private String descripcion;
	private String codigo;
	
	
	public Curso(Long id, String descripcion, String codigo) {
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}


	public Curso(String descripcion, String codigo) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	@Override
	public String toString() {
		return "Curso [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
	} 
	
	
	

}
