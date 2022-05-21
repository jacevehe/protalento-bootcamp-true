package com.protalento.bootcamp.registronotas.services.implement;

import java.util.List;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.GenericDAO;
import com.protalento.bootcamp.registronotas.services.GenericService;

public class AbstractBaseService<T> implements GenericService<T>{
	
	protected GenericDAO<T> genericDao;
	protected DBMemoria db;
	
	public AbstractBaseService(GenericDAO<T> genericDao, DBMemoria db) {
		this.genericDao=genericDao;
		this.db=db;
	}
	
	
	public void save(T entity) {
		genericDao.save(entity);
		
	}

	
	public List<T> findAll() {
		return genericDao.findAll();
	}

	public T findByid(int id) {
		return genericDao.findByid(id);
	}

	public void delete(int id) {
		genericDao.delete(id);
		
	}

	public void update(T entity) {
		genericDao.update(entity);
	}


	
	public boolean toExist(int id) {
		
		return genericDao.toExist(id);
	}


	
	public void toList() {
		genericDao.toList();
	}
	
	
}
