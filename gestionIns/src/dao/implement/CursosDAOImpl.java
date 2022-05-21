package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.CursosDAO;
import com.protalento.bootcamp.registronotas.domain.Cursos;

public class CursosDAOImpl implements CursosDAO{
	
	
	private DBMemoria db;
	
	public CursosDAOImpl(DBMemoria db) {
		this.db = db;
	}
	

	
	public void save(Cursos entity) {
		if(validate(entity.getCodigo(), entity.getDescripcion(),entity.getJornada())) {
			System.out.println("Curso ya existe!");
		}else {
			if(db.getCursos().size()==0) {
				entity.setId(101);
				db.getCursos().add(entity);
					}else {
					int counter=0;
					Cursos ins;
					ins=db.getCursos().get(db.getCursos().size()-1);
					counter=ins.getId();
					entity.setId(counter+1);
					db.getCursos().add(entity);
		          }
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("Curso creado: "+entity.getId()+" | "+entity.getDescripcion()+" - "+entity.getCodigo()+" - "+entity.getJornada());
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		
	}

	
	public List<Cursos> findAll() {
		
		return db.getCursos();
	}

	
	public Cursos findByid(int id) {
		
		Cursos curso = new Cursos();
		
		for(Cursos aux: db.getCursos() ) {
			if(aux.getId()==id)
				curso = aux;				
		}
		
		return curso;
	}

	
	public void delete(int id) {
		   Cursos curso = new Cursos();
	       curso = findByid(id);
		   db.getCursos().remove(curso);
		   System.out.println("----------------------------------------------------------------------------");
		   System.out.println("Curso borrrado con exito:"+curso.getCodigo()+" "+curso.getDescripcion());
		   System.out.println("----------------------------------------------------------------------------");
		
	}

	
	public void update(Cursos entity) {
		for(int i=0; i<db.getCursos().size();i++) {
	    	   if(db.getCursos().get(i).getId()==entity.getId()) {
	    		   db.getCursos().get(i).setCodigo(entity.getCodigo());
	    		   db.getCursos().get(i).setDescripcion(entity.getDescripcion());
	    		   db.getCursos().get(i).setJornada(entity.getJornada());
	    		   System.out.println("----------------------------------------------------------------------------");
	    		   System.out.println("Curso actualizado con exito:"+entity.getDescripcion()+" - "+entity.getCodigo());
	    		   System.out.println("----------------------------------------------------------------------------");
	    	   }
	    		   
	       }
	}
	
	public boolean validate(String id_grupo, String descripcion, String jornada) {
		boolean existe=false;
		for(Cursos aux : db.getCursos()) {
			if(aux.getCodigo().equals(id_grupo) && aux.getDescripcion().equals(descripcion) && aux.getJornada().equals(jornada))
				existe=true;
		}
		
		return existe;
	}

		
	public void toList() {
		   System.out.println("------------------------------------------------------------------------------------");
		   System.out.println("# | Código | Descripción |     Jornada     ");
		   System.out.println("------------------------------------------------------------------------------------");
		for(Cursos aux: db.getCursos()) {
		   System.out.println(aux.getId()+" |   "+aux.getCodigo()+"   |   "+aux.getDescripcion()+" | "+aux.getJornada());
		   System.out.println("------------------------------------------------------------------------------------");
		}
		
	}



	@Override
	public boolean toExist(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
