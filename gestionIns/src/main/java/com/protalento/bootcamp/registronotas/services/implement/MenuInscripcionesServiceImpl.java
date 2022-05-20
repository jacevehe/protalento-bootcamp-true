package com.protalento.bootcamp.registronotas.services.implement;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.implement.MenuInscripcionesDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Inscripciones;
import com.protalento.bootcamp.registronotas.services.AlumnoService;
import com.protalento.bootcamp.registronotas.services.CursosService;
import com.protalento.bootcamp.registronotas.services.MateriaService;
import com.protalento.bootcamp.registronotas.services.MenuInscripcionesService;

public class MenuInscripcionesServiceImpl extends MenuAbstractBaseService<Inscripciones> implements MenuInscripcionesService{
	
	public MenuInscripcionesServiceImpl(DBMemoria db, CursosService service2, AlumnoService service, MateriaService service3) {
		super(new MenuInscripcionesDAOImpl(db,service2,service,service3));
		
	}

	
	public void findByIdAlumno(int id_alumno) {
		
	}
    
	
}
