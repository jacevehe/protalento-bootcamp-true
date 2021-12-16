package escuela;

import java.util.Scanner;

public class InfoEstudiantes {

	
	int cantidad;
	double notamaxima=10; 
	double notaminima=0; 
	double notaAprobar=7; 
	double EstNotaMax=0;
	double EstNotaMin=0;
	Estudiante[] estudiantes;
	
	InfoEstudiantes(int cantidad){
		this.cantidad=cantidad;
	}	
	
	
	Estudiante[] OrdenarCalificacionesMayor() {
		Estudiante aux = new Estudiante();
		for(int i=0; i<this.estudiantes.length-1; i++){
			for(int j=0; j<this.estudiantes.length-1; j++) {
			if(this.estudiantes[j+1].nota>this.estudiantes[j].nota) {
				aux=this.estudiantes[j+1];
				this.estudiantes[j+1]=this.estudiantes[j];
				this.estudiantes[j]=aux;
				}
			}
		}
		return this.estudiantes;
	}
	
	Estudiante[] OrdenarCalificacionesMenor() {
		Estudiante aux = new Estudiante();
		for(int i=0; i<this.estudiantes.length-1; i++){
			for(int j=0; j<this.estudiantes.length-i-1; j++) {
			if(this.estudiantes[j+1].nota<this.estudiantes[j].nota) {
				aux=this.estudiantes[j+1];
				this.estudiantes[j+1]=this.estudiantes[j];
				this.estudiantes[j]=aux;
				}
			}
		}
		return this.estudiantes;
	}
	
	
	
	void cargarEstudiantes() {
		
		this.estudiantes = new Estudiante[this.cantidad];
		Scanner teclado=new Scanner(System.in);
		String nombre;
		String apellido;  
		int numeroExamen;
		
		for(int i=0; i<this.estudiantes.length;i++) {

			
			System.out.println("Ingrese el nombre del Estudiante No. "+(i+1)+" :");
			nombre=teclado.next();
			System.out.println("Ingrese el apellido del EstudianteNo. "+(i+1)+" :");
			apellido=teclado.next();
			System.out.println("Ingrese el cantidad de examenes del Estudiante No. "+(i+1)+" :");
			numeroExamen=teclado.nextInt();
			double[] notas = new double[numeroExamen];
			double aux=0;
			System.out.println("Por favor ingrese solo numeros enteros ó decimales. Para separarlo utilice (,) No se acepta punto.");
			for(int j=0; j<notas.length; j++) {
				System.out.println("Ingrese calificación del Examen # "+(j+1));
				aux=teclado.nextDouble();
				if(aux>=this.notaminima||aux<=this.notamaxima) {
					notas[j]=aux;
				}else {
					System.out.println("Calificación NO VALIDA!");
				}
			}
			
			Estudiante e=new Estudiante(nombre, apellido, numeroExamen);
			e.setNotas(notas);
			this.estudiantes[i]=e;
		}
		
		CalcularPromedios(this.estudiantes);
		teclado.close();
	}
	
	void mostrarEstudiantes() {
		int index=1;
		
		if(this.estudiantes!=null){
		System.out.println("------------Reporte de Estudiantes Cargados---------------");
		System.out.println("----------------------------------------------------------");
		System.out.println(" # |     Nombre        | Apellido         | Examen No.  |   Nota");
		for(Estudiante st: this.estudiantes) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" "+index+" |     "+st.nombre+"       |    "+st.apellido+"       | "+st.numeroExamen+"    |    "+st.nota);
			index++;
		}
		
		}else {
			System.out.println("---------------------------");
			System.out.println("No hay estudiantes cargados...");
			System.out.println("---------------------------");
		}
	}
	
	
	void mostrarCalificaciones(Estudiante[] students) {
		int index=1;
		
		if(students!=null){
		System.out.println("------------Reporte de Calificaciones---------------");
		System.out.println("----------------------------------------------------------");
		System.out.println(" # |   Nombre Completo  |   Nota");
		for(Estudiante st: students) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" "+index+" | "+st.nombre+"  "+st.apellido+" |    "+st.nota);
			index++;
		}
		
		}else {
			System.out.println("---------------------------");
			System.out.println("No hay estudiantes cargados...");
			System.out.println("---------------------------");
		}
	}
	
	
	void MaximaNota(Estudiante[] students) {
		int index=1;
		System.out.println("ESTUDIANTE(S) CON MAXIMA CALIFICACION");
		System.out.println("----------------------------------------------------------");
		System.out.println("Máxima Nota: "+this.EstNotaMax);
		System.out.println("----------------------------------------------------------");
		System.out.println(" # |   Nombre Completo  |   Nota");
		for(Estudiante st: students) {
			if(st.nota==this.EstNotaMax) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" "+index+" | "+st.nombre+"  "+st.apellido+" |    "+st.nota);
			index++;
			}
		}
	}
	
	void MinimaNota(Estudiante[] students) {
		int index=1;	
		System.out.println("ESTUDIANTE(S) CON MINIMA CALIFICACION");
		System.out.println("----------------------------------------------------------");
		System.out.println("Miníma Nota: "+this.EstNotaMin);
		System.out.println("----------------------------------------------------------");
		System.out.println(" # |   Nombre Completo  |   Nota");
		for(Estudiante st: students) {
			if(st.nota==this.EstNotaMin) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" "+index+" | "+st.nombre+"  "+st.apellido+" |    "+st.nota);
			index++;
			}
		}
	}
	
	
	void promocionados(Estudiante[] students) {
		int index=1;
		System.out.println("----------------------------------------------------------");
		System.out.println("ESTUDIANTES PROMOCIONADOS");
		System.out.println("----------------------------------------------------------");
		System.out.println(" # |   Nombre Completo  |   Nota");
		for(Estudiante st: students) {
			if(st.nota>=this.notaAprobar) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" "+index+" | "+st.nombre+"  "+st.apellido+" |    "+st.nota);
			index++;
			}
		}
	}
	
	void NoPromocionados(Estudiante[] students) {
		int index=1;
		System.out.println("----------------------------------------------------------");
		System.out.println("ESTUDIANTES NO PROMOCIONADOS");
		System.out.println("----------------------------------------------------------");
		System.out.println(" # |   Nombre Completo  |   Nota");
		for(Estudiante st: students) {
			if(st.nota<this.notaAprobar) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" "+index+" | "+st.nombre+"  "+st.apellido+" |    "+st.nota);
			index++;
			}
		}
	}
	
	
void MaxMin() {
		
		this.EstNotaMax = this.EstNotaMin = this.estudiantes[0].nota;
		for(int i=1; i<this.estudiantes.length; i++) {
			
			if(this.estudiantes[i].nota<this.EstNotaMin){
				this.EstNotaMin=this.estudiantes[i].nota;
			}
			
			if(this.estudiantes[i].nota>this.EstNotaMax){
			this.EstNotaMax=this.estudiantes[i].nota;
			}
			
	
		}
		
		
	}


void CalcularPromedios(Estudiante[] alumnos) {
	System.out.println("-------------------------------------------------------------------");
	for(int i=0; i<alumnos.length; i++) {
		double promedio=0; 
		for(int j=0; j<alumnos[i].notas.length; j++) {
			System.out.println("Examen #"+(j+1)+": "+alumnos[i].nombre+" "+alumnos[i].apellido+": "+alumnos[i].notas[j]);
			promedio += alumnos[i].notas[j];
		}
		promedio = promedio/alumnos[i].numeroExamen;
		System.out.println("Promedio: "+Math.round(promedio));
		System.out.println("-------------------------------------------------------------------");
		alumnos[i].nota=Math.round(promedio);
		System.out.println("-------------------------------------------------------------------");
	}
}


	
	
	
	/*
	Scanner  verMenu(Scanner teclado) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("  Escuela XYZ  ");
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("1. Cargar Estudiantes ");
		System.out.println("2. Reporte de Estudiantes ");
		System.out.println("3. Calificaciónes mas altas ");
		System.out.println("4. Calificaciónes mas bajas ");
		System.out.println("5. Estudiantes promocionados ");
		System.out.println("6. Estudiantes NO promocionados ");
		System.out.println("6. SALIR ");
		System.out.println("---------------------------");
		System.out.println("  >>Escoja una opción<<  ");
		System.out.println("---------------------------");
		opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("---------------------------");
			System.out.println("  CARGAR ESTUDIANTES ");
			System.out.println("---------------------------");
			cargarEstudiantes(teclado);
			scanner = verMenu(teclado);
			break;
		case 2:
			mostrarEstudiantes();
			scanner = verMenu(teclado);
			break;
		case 3:
			System.out.println("---------------------------");
			System.out.println("  ESTUDIANTES CON CALIFICACION ALTA ");
			System.out.println("---------------------------");
			calificacionesAltas();
			scanner=verMenu(teclado);
			break;
		}
		
		return scanner;
		
		
	}*/
	
	
}
