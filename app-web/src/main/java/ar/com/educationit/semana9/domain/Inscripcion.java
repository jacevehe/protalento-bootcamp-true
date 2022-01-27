package ar.com.educationit.semana9.domain;

public class Inscripcion {
	
	private Long id; 
	private Long id_estudiante; 
	private Turno turno;
	
	
	public Inscripcion(Long id, Long id_estudiante, Turno turno) {
		this.id = id;
		this.id_estudiante = id_estudiante;
		this.turno = turno;
	}


	public Inscripcion(Long id_estudiante, Turno turno) {
		this.id_estudiante = id_estudiante;
		this.turno = turno;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId_estudiante() {
		return id_estudiante;
	}


	public void setId_estudiante(Long id_estudiante) {
		this.id_estudiante = id_estudiante;
	}


	public Turno getTurno() {
		return turno;
	}


	public void setTurno(Turno turno) {
		this.turno = turno;
	}


	@Override
	public String toString() {
		return "Inscripcion [id=" + id + ", id_estudiante=" + id_estudiante + ", turno=" + turno + "]";
	}
	
	
	

}
