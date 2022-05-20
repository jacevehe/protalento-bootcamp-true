package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.AlumnoDAO;
import com.protalento.bootcamp.registronotas.domain.Alumno;

public class AlumnoDAOImpl implements AlumnoDAO {
	
	private DBMemoria db;
	
	public AlumnoDAOImpl(DBMemoria db) {
		this.db = db;
	}
	

	
	public void save(Alumno entity) {
		 
		if(toExist(entity.getId())) {
			System.out.println("Alumno ya existe!");
		}else {
			db.getAlumnos().add(entity);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Alumno creado: "+entity.getId()+" | "+entity.getNombres()+" "+entity.getApellidos());
			System.out.println("----------------------------------------------------------------------------");
		}
		
		}
		

	
	public List<Alumno> findAll() {
		return db.getAlumnos();
	}

	public Alumno findByid(int id) {
		Alumno alumno = new Alumno();
		
		for(Alumno aux: db.getAlumnos() ) {
			if(aux.getId()==id)
				alumno = aux;	
		}
		return alumno;
	}

	
	public void delete(int id) {
			   Alumno alumno = new Alumno();
		       alumno = findByid(id);
			   db.getAlumnos().remove(alumno);
			   System.out.println("----------------------------------------------------------------------------");
			   System.out.println("Alumno borrrado con exito:"+alumno.getNombres()+" "+alumno.getApellidos());
			   System.out.println("----------------------------------------------------------------------------");
	}
	

	
	public void update(Alumno entity) {
		   
	       for(int i=0; i<db.getAlumnos().size();i++) {
	    	   if(db.getAlumnos().get(i).getId()==entity.getId()) {
	    		   db.getAlumnos().get(i).setNombres(entity.getNombres());
	    		   db.getAlumnos().get(i).setApellidos(entity.getApellidos());
	    		   db.getAlumnos().get(i).setDireccion(entity.getDireccion());
	    		   db.getAlumnos().get(i).setTelefono(entity.getTelefono());
	    		   System.out.println("----------------------------------------------------------------------------");
	    		   System.out.println("Alumno actualizado con exito:"+entity.getId()+" - "+entity.getNombres()+" "+entity.getApellidos());
	    		   System.out.println("----------------------------------------------------------------------------");
	    	   }
	    		   
	       }
	  

	}
	
	
	public boolean toExist(int id) {
		boolean existe=false;
		Alumno alumno; 
		alumno = this.findByid(id);
		if(alumno.getId()==id)
			existe=true;
		
		return existe;
	}
	
	
	public void toList() {
		   System.out.println("------------------------------------------------------------------------------------------------------------");
		   System.out.println("# DNI      |    Nombres     | Apellidos       |     Dirección    |   Teléfono ");
		   System.out.println("-------------------------------------------------------------------------------------------------------------");
		for(Alumno aux: db.getAlumnos()) {
 		   System.out.println(aux.getId()+" | "+aux.getNombres()+" | "+aux.getApellidos()+" | "+aux.getDireccion()+" | "+aux.getTelefono());
 		   System.out.println("--------------------------------------------------------------------------------");
		}
	}


	

}
