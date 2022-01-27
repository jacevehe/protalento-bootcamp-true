package ar.com.educationit.semana9.dao.implement;

import ar.com.educationit.semana9.dao.DAOCrud;

public class EstudianteDAOImplement implements DAOCrud{
	
	public void create() {
		System.out.println("INSER INTO ESTUDIANTE (id,nombres, apellidos) values (1,'Jhon', 'Acevedo')");
	}
	
	public void read() {
		System.out.println("Read");
	}
	
	public void update() {
		System.out.println("Update");
	}
	
	public void delete() {
		System.out.println("Delete");
	}
}
