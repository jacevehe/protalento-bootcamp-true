package com.protalento.bootcamp.registronotas.services.implement;

import com.protalento.bootcamp.registronotas.dao.implement.MenuAlumnoDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Alumno;
import com.protalento.bootcamp.registronotas.services.MenuAlumnoService;

public class MenuAlumnoServiceImpl extends MenuAbstractBaseService<Alumno> implements MenuAlumnoService {

	public MenuAlumnoServiceImpl() {
		super(new MenuAlumnoDAOImpl());
		
	}

}
