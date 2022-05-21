package com.protalento.bootcamp.registronotas.services.implement;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.implement.CursosDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Cursos;
import com.protalento.bootcamp.registronotas.services.CursosService;

public class CursosServiceImp extends AbstractBaseService<Cursos> implements CursosService{

	public CursosServiceImp(DBMemoria db) {
		super(new CursosDAOImpl(db), db);
		
	}

}
