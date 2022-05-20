package com.protalento.bootcamp.registronotas.dao.implement;


import java.util.List;
import java.util.Scanner;

import com.protalento.bootcamp.registronotas.dao.MenuMateriaDAO;
import com.protalento.bootcamp.registronotas.domain.Materia;


public class MenuMateriaDAOImpl implements MenuMateriaDAO{

	public Materia save(Scanner teclado) {
		Materia materia=new Materia();
		String descripcion;
		String contenido;
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Creación de Materias                     ");
		System.out.println("----------------------------------------------------");
		System.out.println(" Descripción:                         ");
		descripcion = teclado.next();
		System.out.println(" Contenido de la materia:                         ");
		contenido = teclado.next();
		
		materia.setDescripcion(descripcion.toUpperCase());
		materia.setContenido(contenido.toUpperCase());
	
		return materia;

	}

	
	public int findById(Scanner teclado) {
		
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Buscar una Materia                        ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el ID de la materia:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	
	public List<Materia> findAll(Scanner teclado) {
		
		return null;
	}

	
	public int delete(Scanner teclado) {
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Eliminar una Materia                   ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el ID de la materia:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	
	public Materia update(Scanner teclado) {
		
		Materia materia=new Materia();
		String descripcion;
		String contenido;
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Actualización de Materias              ");
		System.out.println("----------------------------------------------------");
		System.out.println(" Descripción:                         ");
		descripcion = teclado.next();
		System.out.println(" Contenido de la materia:                         ");
		contenido = teclado.next();
		
		materia.setDescripcion(descripcion.toUpperCase());
		materia.setContenido(contenido.toUpperCase());
	
		return materia;
	}

	
	public int submenu(Scanner teclado) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Menú Materias                            ");
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

	
	public int menuppal(Scanner tecado) {
		
		return 0;
	}

	


}
