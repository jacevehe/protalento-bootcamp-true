package com.protalento.bootcamp.registronotas.services.implement;


import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.implement.MateriaDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Materia;
import com.protalento.bootcamp.registronotas.services.MateriaService;

public class MateriaServiceImpl extends AbstractBaseService<Materia> implements MateriaService {

	public MateriaServiceImpl(DBMemoria db) {
		super(new MateriaDAOImpl(db), db);
		
	}
}
