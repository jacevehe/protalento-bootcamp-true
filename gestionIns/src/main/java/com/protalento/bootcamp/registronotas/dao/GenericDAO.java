package com.protalento.bootcamp.registronotas.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	public void save(T entity);
	public List<T> findAll();
	public T findByid(int id);
	public void delete(int id);
	public void update(T entity);
	public boolean toExist(int id);
	public void toList();

}
