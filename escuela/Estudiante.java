package escuela;


public class Estudiante {

	String nombre; 
	String apellido; 
	double nota; 
	int numeroExamen;
	double[] notas;
	
	Estudiante(String nombre, String apellido, int numeroExamen){
		this.nombre=nombre; 
		this.apellido=apellido; 
		this.numeroExamen=numeroExamen; 
	}
	
	Estudiante(){
		
	}
	
	void setNotas(double[] notas) {
		this.notas=notas;
	}
	
	
	
	
}
