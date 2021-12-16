package escuela;

import java.util.Scanner;

public class ProgramaEstudiante {

	
	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int cantidad;

	System.out.println("Ingrese la cantidad de estudiantes a procesar:");
	cantidad = teclado.nextInt();
	InfoEstudiantes info = new InfoEstudiantes(cantidad);
	
	System.out.println("---------------------------");
	System.out.println("Estudiantes a procesar: "+cantidad);
	System.out.println("---------------------------");
	
	System.out.println("---------------------------");
	System.out.println("  Escuela XYZ  ");
	System.out.println("---------------------------");
	System.out.println("---------------------------");
	System.out.println("1. Cargar Estudiantes ");
	info.cargarEstudiantes();
	System.out.println("---------------------------");
	System.out.println("  Escuela XYZ  ");
	System.out.println("---------------------------");
	System.out.println("--------------------------------------------");
	System.out.println("2. Lista de Estudiantes cargados");
	info.mostrarEstudiantes();
	System.out.println("                               ");
	System.out.println("                               ");
	System.out.println("---------------------------------------------");
	System.out.println("3. Estudiantes con calificaciones más altas");
	System.out.println("---------------------------------------------");
	System.out.println("                               ");
	System.out.println("                               ");
	info.MaxMin();
	info.MaximaNota(info.estudiantes);
	System.out.println("                               ");
	System.out.println("                               ");
	System.out.println("---------------------------------------------");
	System.out.println("4. Estudiantes con calificaciones más bajas");
	System.out.println("---------------------------------------------");
	System.out.println("                               ");
	System.out.println("                               ");
	info.MinimaNota(info.estudiantes);
	System.out.println("                               ");
	System.out.println("                               ");
	System.out.println("---------------------------------------------");
	System.out.println("5. Estudiantes Promocionados");
	System.out.println("---------------------------------------------");
	System.out.println("                               ");
	System.out.println("                               ");
	info.promocionados(info.estudiantes);
	System.out.println("                               ");
	System.out.println("                               ");
	System.out.println("---------------------------------------------");
	System.out.println("5. Estudiantes NO  Promocionados");
	System.out.println("---------------------------------------------");
	System.out.println("                               ");
	System.out.println("                               ");
	info.NoPromocionados(info.estudiantes);
	teclado.close();
	
	}
	
	
}
