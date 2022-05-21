package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.MateriaDAO;
import com.protalento.bootcamp.registronotas.domain.Materia;

public class MateriaDAOImpl implements MateriaDAO{
	
	private DBMemoria db;
	
	public MateriaDAOImpl(DBMemoria db) {
		this.db = db;
	}
	
	
	public void save(Materia entity) {
		if(validate(entity.getDescripcion())) {
			System.out.println("Materia ya existe!");
		}else {
			
			if(db.getMaterias().size()==0) {
				entity.setId(101);
				db.getMaterias().add(entity);
					}else {
					int counter=0;
					Materia materia;
					materia=db.getMaterias().get(db.getMaterias().size()-1);
					counter=materia.getId();
					entity.setId(counter+1);
					db.getMaterias().add(entity);
		          }
	
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("Materia creada: "+entity.getId()+" | "+entity.getDescripcion()+" - "+entity.getContenido());
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		
	}

	
	public List<Materia> findAll() {
		
		return db.getMaterias();
	}

	
	public Materia findByid(int id) {
		
		Materia materia = new Materia();
		
		for(Materia aux: db.getMaterias() ) {
			if(aux.getId()==id)
				materia = aux;
				
		}
		
		return materia;
	}

	
	public void delete(int id) {
		Materia materia = new Materia();
		
		   if(!toExist(id)) {
	       materia = findByid(id);
		   db.getMaterias().remove(materia);
		   System.out.println("----------------------------------------------------------------------------");
		   System.out.println("Materia borrrada con exito:"+materia.getId()+" "+materia.getDescripcion());
		   System.out.println("----------------------------------------------------------------------------");
		   }else {
			   System.out.println("No existe");
		   }
	}

	
	public void update(Materia entity) {
		for(int i=0; i<db.getMaterias().size();i++) {
	    	   if(db.getMaterias().get(i).getId()==entity.getId()) {
	    		   db.getMaterias().get(i).setDescripcion(entity.getDescripcion());
	    		   db.getMaterias().get(i).setContenido(entity.getContenido());
	    		   System.out.println("----------------------------------------------------------------------------");
	    		   System.out.println("Materia actualizada con exito:"+entity.getDescripcion()+" "+entity.getContenido());
	    		   System.out.println("----------------------------------------------------------------------------");
	    	   }
		
	}

}	
	public boolean validate(String descripcion) {
		boolean existe=false;
		for(Materia aux : db.getMaterias()) {
			if(aux.getDescripcion().equals(descripcion))
				existe=true;
		}
		
		return existe;
	}

	
	public void toList() {
		   System.out.println("------------------------------------------------------------------------------------");
		   System.out.println("# | Descripción |     Contenido     ");
		   System.out.println("------------------------------------------------------------------------------------");
		for(Materia aux: db.getMaterias()) {
		   System.out.println(aux.getId()+"|"+aux.getDescripcion()+" | "+aux.getContenido());
		   System.out.println("------------------------------------------------------------------------------------");
		}
		
	}


	@Override
	public boolean toExist(int id) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
}

