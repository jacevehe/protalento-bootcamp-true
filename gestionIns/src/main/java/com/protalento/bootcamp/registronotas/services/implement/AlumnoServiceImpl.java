package com.protalento.bootcamp.registronotas.services.implement;


import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.implement.AlumnoDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Alumno;
import com.protalento.bootcamp.registronotas.services.AlumnoService;

public class AlumnoServiceImpl extends AbstractBaseService<Alumno> implements AlumnoService {
	
	

	public AlumnoServiceImpl(DBMemoria db) {
		super(new AlumnoDAOImpl(db), db);
	}



}
