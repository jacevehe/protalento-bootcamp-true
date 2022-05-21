package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;
import java.util.Scanner;

import com.protalento.bootcamp.registronotas.dao.MenuCursosDAO;
import com.protalento.bootcamp.registronotas.domain.Cursos;

public class MenuCursosDAOImpl implements MenuCursosDAO {

	@Override
	public Cursos save(Scanner teclado) {
		Cursos curso=new Cursos();
		String descripcion;
		String codigo;
		String jornada="";
		int opcion = 0;
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Creación de Cursos                     ");
		System.out.println("----------------------------------------------------");
		System.out.println(" Descripción:                         ");
		descripcion = teclado.next();
		System.out.println(" Grupo (A, B, C, D...):                         ");
		codigo = teclado.next();
		do {
			System.out.println(" Turno o Jornada:                         ");
			System.out.println(" Escoja la jornada, ingresado el número de la opción:                     ");
			System.out.println(" 1. MAÑANA");
			System.out.println(" 2. TARDE");
			System.out.println(" 3. NOCHE");
			opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			jornada="MAÑANA";
		break;
		case 2:
			jornada="TARDE";
		break;
		case 3:
			jornada="NOCHE";
		break;
		default:
		     if(!(opcion==1|| opcion==2|| opcion==3))
		    	 System.out.println("Debe seleccionar una opción valida");
		     opcion=0;
		break;
			
		}
		}while(opcion==0);
		
		curso.setDescripcion(descripcion.toUpperCase());
		curso.setCodigo(codigo.toUpperCase());
		curso.setJornada(jornada);
		
		return curso;
	}

	@Override
	public int findById(Scanner teclado) {
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Buscar un Curso                        ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el ID del curso:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	@Override
	public List<Cursos> findAll(Scanner teclado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Scanner teclado) {
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Eliminar un Curso                      ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el ID del curso:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	@Override
	public Cursos update(Scanner teclado) {
		Cursos curso=new Cursos();
		String descripcion;
		String codigo;
		String jornada="";
		int opcion=0;
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Actualizar Cursos                     ");
		System.out.println("----------------------------------------------------");
		System.out.println(" Descripción:                         ");
		descripcion = teclado.next();
		System.out.println(" Grupo (A, B, C, D...):                              ");
		codigo = teclado.next();
		System.out.println(" Escoja la jornada, ingresado el número de la opción:                     ");
		System.out.println(" 1. MAÑANA");
		System.out.println(" 2. TARDE");
		System.out.println(" 3. NOCHE");
		opcion = teclado.nextInt();
		do {
		switch(opcion) {
		case 1:
			jornada="MAÑANA";
		break;
		case 2:
			jornada="TARDE";
		break;
		case 3:
			jornada="NOCHE";
		break;
		default:
		     if(!(opcion==1|| opcion==2|| opcion==3))
		    	 System.out.println("Debe seleccionar una opción valida");
		break;
			
		}
		}while(opcion==0);
		
		curso.setDescripcion(descripcion.toUpperCase());
		curso.setCodigo(codigo.toUpperCase());
		curso.setJornada(jornada);
		
		return curso;
	}

	@Override
	public int submenu(Scanner teclado) {
		System.out.println("----------------------------------------------------");
		System.out.println("             Menú Cursos                            ");
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

	@Override
	public int menuppal(Scanner tecado) {
		// TODO Auto-generated method stub
		return 0;
	}

}
