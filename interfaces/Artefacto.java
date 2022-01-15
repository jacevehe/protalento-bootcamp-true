
public class Artefacto {

	public class Artefacto {
		
		protected String nombre;
		protected boolean permiso;
		protected boolean tripulacion;
		protected String estado;
		
		

		public Artefacto(String nombre, String estado) {
			this.nombre = nombre;
			this.estado = estado;
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public boolean isPermiso() {
			return permiso;
		}
		public void setPermiso(boolean permiso) {
			this.permiso = permiso;
		}
		public boolean isTripulacion() {
			return tripulacion;
		}
		public void setTripulacion(boolean tripulacion) {
			this.tripulacion = tripulacion;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
			

	}

}
