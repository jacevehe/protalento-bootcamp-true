package ar.com.educationit.semana9.domain;

public class Turno {
	
	private Long id; 
	private Long id_asignatura; 
	private String hora_inicio;
	private String hora_final;
	private String docente;
	
	
	public Turno(Long id_asignatura, String hora_inicio, String hora_final, String docente) {
		this.id_asignatura = id_asignatura;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.docente = docente;
	}


	public Turno(Long id, Long id_asignatura, String hora_inicio, String hora_final, String docente) {
		this.id = id;
		this.id_asignatura = id_asignatura;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.docente = docente;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId_asignatura() {
		return id_asignatura;
	}


	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}


	public String getHora_inicio() {
		return hora_inicio;
	}


	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}


	public String getHora_final() {
		return hora_final;
	}


	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}


	public String getDocente() {
		return docente;
	}


	public void setDocente(String docente) {
		this.docente = docente;
	}


	@Override
	public String toString() {
		return "Turno [id=" + id + ", id_asignatura=" + id_asignatura + ", hora_inicio=" + hora_inicio + ", hora_final="
				+ hora_final + ", docente=" + docente + "]";
	}
	
	
	

}
