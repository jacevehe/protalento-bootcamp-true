package com.protalento.bootcamp.registronotas.services;

import java.util.List;
import java.util.Scanner;

public interface MenuGenericService<T> {
	
	public T save(Scanner teclado);
	public int findById(Scanner teclado);
	public List<T> findAll(Scanner teclado);
	public int delete(Scanner teclado);
	public T update(Scanner teclado);
	public int submenu(Scanner teclado);
	public int menuppal(Scanner teclado);

}
