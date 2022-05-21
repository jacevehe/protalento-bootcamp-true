package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;
import java.util.Scanner;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.MenuInscripcionesDAO;
import com.protalento.bootcamp.registronotas.domain.Inscripciones;
import com.protalento.bootcamp.registronotas.services.AlumnoService;
import com.protalento.bootcamp.registronotas.services.CursosService;
import com.protalento.bootcamp.registronotas.services.MateriaService;
import com.protalento.bootcamp.registronotas.services.implement.AlumnoServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.CursosServiceImp;
import com.protalento.bootcamp.registronotas.services.implement.MateriaServiceImpl;

public class MenuInscripcionesDAOImpl implements MenuInscripcionesDAO {

	private DBMemoria db;
	private CursosService cdi = new CursosServiceImp(db);
	private AlumnoService adi = new AlumnoServiceImpl(db);
	private MateriaService mdi = new MateriaServiceImpl(db);
	
	public MenuInscripcionesDAOImpl(DBMemoria db, CursosService cdi, AlumnoService adi, MateriaService mdi) {
		this.db = db;
		this.cdi=cdi;
		this.adi=adi;
		this.mdi=mdi;
		
	}
	
	public Inscripciones save(Scanner teclado) {
		
		Inscripciones insc=new Inscripciones();
		int id_alumno;
		int id_materia;
		int id_curso = 0;
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Inscribir Materias                     ");
		System.out.println("----------------------------------------------------");
		adi.toList();
		System.out.println(" Ingrese el DNI del alumno:                         ");
		id_alumno = teclado.nextInt();
		mdi.toList();
		System.out.println(" Ingrese el código de la materia:                   ");
		id_materia = teclado.nextInt();
		cdi.toList();
		System.out.println(" Ingrese el código del curso:                   ");
		id_curso = teclado.nextInt();
			
		
		insc.setId_alumno(id_alumno);
		insc.setId_materia(id_materia);
		insc.setId_curso(id_curso);
		
		return insc;
	}

	
	public int findById(Scanner teclado) {
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Buscar una inscripcion                 ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el ID del alumno:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	
	public List<Inscripciones> findAll(Scanner teclado) {
		
		return null;
	}

	
	public int delete(Scanner teclado) {
		int idsearch=0;
		System.out.println("----------------------------------------------------");
		System.out.println("             Eliminar una Incripción                   ");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el ID de la inscripción:");
		idsearch=teclado.nextInt();
		System.out.println("-----------------------------------------------------");
		return idsearch;
	}

	
	public Inscripciones update(Scanner teclado) {
		
		Inscripciones inscripcion=new Inscripciones();
		int id_materia;
		int id_curso;
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Modificar inscripción                  ");
		System.out.println("----------------------------------------------------");
		mdi.toList();
		System.out.println("Ingrese ID de la materia:                         ");
		id_materia = teclado.nextInt();
		cdi.toList();
		System.out.println("Ingrese ID del curso:                         ");
		id_curso = teclado.nextInt();
		
		inscripcion.setId_materia(id_materia);
		inscripcion.setId_curso(id_curso);
	
		return inscripcion;
	}

	
	public int submenu(Scanner teclado) {
		
		System.out.println("----------------------------------------------------");
		System.out.println("             Menú Inscripciones                     ");
		System.out.println("----------------------------------------------------");
		System.out.println(" 1. Inscribir                           ");
		System.out.println(" 2. Consultar inscripción               ");
		System.out.println(" 3. Eliminar                        ");
		System.out.println(" 4. Modificar inscripción                      ");
		System.out.println(" 5. Mostrar las inscripciones                   ");
		System.out.println(" 9. Atrás                   ");
		System.out.println("-----------------------------------------------------");
		int opcion = teclado.nextInt();
		return opcion;
	}

	
	public int menuppal(Scanner tecado) {
		
		return 0;
	}

}
