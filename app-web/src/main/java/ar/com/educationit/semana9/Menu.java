package ar.com.educationit.semana9;



public class Menu {
	
	private int opcion;
	
	
	public void mostrarMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("           Menu Principal                ");
		System.out.println("-----------------------------------------");
		System.out.println(" 1. Inscribir Estudiante                 ");
		System.out.println(" 2. Crear Curso                          ");
		System.out.println(" 3. Crear Asignatura                     ");
		System.out.println(" 4. Crear Asignatura                     ");
		System.out.println(" 5. Consultar incripciones               ");
		System.out.println(" 6. Eliminar inscripción                 ");
		System.out.println(" 0. Salir                                ");
		System.out.println("-----------------------------------------");
		System.out.println("Por favor digite el número de opcion:    ");
		System.out.println("-----------------------------------------");
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	} 
	
	

}
