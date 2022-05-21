package com.protalento.bootcamp.registronotas.services.implement;

import java.util.List;
import java.util.Scanner;

import com.protalento.bootcamp.registronotas.dao.GenericMenuDAO;
import com.protalento.bootcamp.registronotas.services.MenuGenericService;

public class MenuAbstractBaseService<T> implements MenuGenericService<T> {

	protected GenericMenuDAO<T> genericDao;
	
	public MenuAbstractBaseService(GenericMenuDAO<T> genericDao) {
		this.genericDao=genericDao;
	}
	
	
	public T save(Scanner teclado) {
		
		return genericDao.save(teclado);
	}

	
	public int findById(Scanner teclado) {
		
		return genericDao.findById(teclado);
	}

	
	public List<T> findAll(Scanner teclado) {
		
		return genericDao.findAll(teclado);
	}

	
	public int delete(Scanner teclado) {
		
		return genericDao.delete(teclado);
	}

	
	public T update(Scanner teclado) {
		
		return genericDao.update(teclado);
	}

	
	public int submenu(Scanner teclado) {
		
		return genericDao.submenu(teclado);
	}


	public int menuppal(Scanner teclado) {
		
		return genericDao.menuppal(teclado);
	}

}
