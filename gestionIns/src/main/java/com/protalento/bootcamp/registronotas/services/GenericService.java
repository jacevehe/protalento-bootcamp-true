package com.protalento.bootcamp.registronotas.services;

import java.util.List;

public interface GenericService<T> {
	
	public void save(T entity);
	public List<T>findAll();
	public T findByid(int id);
	public void delete(int id);
	public void update(T entity);
	public boolean toExist(int id);
	public void toList();

}
