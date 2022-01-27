package ar.com.educationit.semana9.domain;

public class Asignatura {

	
		private Long id; 
		private String descripcion;
		private Long id_turno;
		
		
		public Asignatura(Long id, String descripcion) {
			this.id = id;
			this.descripcion = descripcion;
		}
		
		public Asignatura(String descripcion) {
			this.descripcion = descripcion;
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

		public Long getId_turno() {
			return id_turno;
		}

		public void setId_turno(Long id_turno) {
			this.id_turno = id_turno;
		}

		@Override
		public String toString() {
			return "Asignatura [id=" + id + ", descripcion=" + descripcion + ", id_turno=" + id_turno + "]";
		}
		
		
}
