package ar.com.educationit.domain;

public class Socio {
	
	private Long id;
	private String nombres; 
	private String apellidos; 
	private String email; 
	private String direccion; 
	private Long paisesId;
	
	
	public Socio(String nombres, String apellidos, String email, String direccion, Long paisesId) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}
	public Socio(Long id, String nombres, String apellidos, String email, String direccion, Long paisesId) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getPaisesId() {
		return paisesId;
	}
	public void setPaisesId(Long paisesId) {
		this.paisesId = paisesId;
	}
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email
				+ ", direccion=" + direccion + ", paisesId=" + paisesId + "]";
	}
	
	
	

}
