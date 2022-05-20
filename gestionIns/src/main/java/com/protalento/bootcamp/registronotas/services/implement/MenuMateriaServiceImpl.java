package com.protalento.bootcamp.registronotas.services.implement;


import com.protalento.bootcamp.registronotas.dao.implement.MenuMateriaDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Materia;
import com.protalento.bootcamp.registronotas.services.MenuMateriaService;

public class MenuMateriaServiceImpl extends MenuAbstractBaseService<Materia> implements MenuMateriaService {

	public MenuMateriaServiceImpl() {
		super(new MenuMateriaDAOImpl());
	}
}
