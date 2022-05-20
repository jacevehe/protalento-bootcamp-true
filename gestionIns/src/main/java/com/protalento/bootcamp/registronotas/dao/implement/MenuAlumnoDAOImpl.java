package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;
import java.util.Scanner;

import com.protalento.bootcamp.registronotas.dao.MenuAlumnoDAO;
import com.protalento.bootcamp.registronotas.domain.Alumno;

public class MenuAlumnoDAOImpl implements MenuAlumnoDAO {

	public Alumno save(Scanner teclado) {
		Alumno alumno=new Alumno();
		String nombres;
		String apellidos;
		String direccion;
		String telefono;
		int id;
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Creación de Alumnos                     ");
		System.out.println("----------------------------------------------------");
		System.out.println(" Nombres:                         ");
		nombres = teclado.next();
		System.out.println(" Apellidos:                         ");
		apellidos = teclado.next();
		System.out.println(" No. de identificación              ");
		id = teclado.nextInt();
		System.out.println(" Barrio:                         ");
		direccion = teclado.next();
		System.out.println(" Teléfono:                          ");
		telefono = teclado.next();
		
		alumno.setNombres(nombres.toUpperCase());
		alumno.setApellidos(apellidos.toUpperCase());
		alumno.setId(id);
		alumno.setDireccion(direccion.toUpperCase());
		alumno.setTelefono(telefono);
		
		return alumno;
	}

	
	public int findById(Scanner teclado) {
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Buscar un Alumno                     ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el número de documento del alumno:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	
	public List<Alumno> findAll(Scanner teclado) {
		System.out.println("----------------------------------------------------");
		System.out.println("             Todos los Alumnos                      ");
		System.out.println("----------------------------------------------------");
		return null;
	}

	
	public int delete(Scanner teclado) {
		int idsearch=0;
		System.out.println("Ingrese el número de documento del alumno:");
		idsearch=teclado.nextInt();
		return idsearch;
	}

	
	public Alumno update(Scanner teclado) {
		
		Alumno alumno=new Alumno();
		String nombres;
		String apellidos;
		String direccion;
		String telefono;
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Actualizar Alumno                      ");
		System.out.println("----------------------------------------------------");
		System.out.println(" Nombres:                         ");
		nombres = teclado.next();
		System.out.println(" Apellidos:                         ");
		apellidos = teclado.next();
		System.out.println(" Dirección:                         ");
		direccion = teclado.next();
		System.out.println(" Teléfono:                          ");
		telefono = teclado.next();
		System.out.println("-----------------------------------------------------");
		
		alumno.setNombres(nombres.toUpperCase());
		alumno.setApellidos(apellidos.toUpperCase());
		alumno.setDireccion(direccion.toUpperCase());
		alumno.setTelefono(telefono);
		
		return alumno;
	}

	
	public int submenu(Scanner teclado) {
		System.out.println("----------------------------------------------------");
		System.out.println("             Menú Alumnos                           ");
		System.out.println("----------------------------------------------------");
		System.out.println(" 1. Crear                           ");
		System.out.println(" 2. Buscar                          ");
		System.out.println(" 3. Eliminar                        ");
		System.out.println(" 4. Actualizar                      ");
		System.out.println(" 5. Mostrar todos                   ");
		System.out.println(" 9. Atrás                   ");
		System.out.println("-----------------------------------------------------");
		int opcion = teclado.nextInt();
		return opcion;
	}


	
	public int menuppal(Scanner teclado) {
		System.out.println("-----------------------------------------------------");
		System.out.println("             Gestión de inscripciones                ");
		System.out.println("-----------------------------------------------------");
		System.out.println(" 1. Alumnos                            ");
		System.out.println(" 2. Materias                           ");
		System.out.println(" 3. Cursos                             ");
		System.out.println(" 4. Inscripciones                      ");
		System.out.println(" 0. Salir                              ");
		System.out.println("-----------------------------------------------------");
		int opcion = teclado.nextInt();
		return opcion;
	}
	
}
