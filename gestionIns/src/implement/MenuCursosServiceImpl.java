package com.protalento.bootcamp.registronotas.services.implement;


import com.protalento.bootcamp.registronotas.dao.implement.MenuCursosDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Cursos;
import com.protalento.bootcamp.registronotas.services.MenuCursosService;

public class MenuCursosServiceImpl extends MenuAbstractBaseService<Cursos>  implements MenuCursosService{

	public MenuCursosServiceImpl() {
		super(new MenuCursosDAOImpl());
	}

	
}
