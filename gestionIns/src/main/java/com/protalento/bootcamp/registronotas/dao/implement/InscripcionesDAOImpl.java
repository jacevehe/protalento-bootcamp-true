package com.protalento.bootcamp.registronotas.dao.implement;

import java.util.List;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.InscripcionesDAO;
import com.protalento.bootcamp.registronotas.domain.Alumno;
import com.protalento.bootcamp.registronotas.domain.Cursos;
import com.protalento.bootcamp.registronotas.domain.Inscripciones;
import com.protalento.bootcamp.registronotas.domain.Materia;
import com.protalento.bootcamp.registronotas.services.AlumnoService;
import com.protalento.bootcamp.registronotas.services.CursosService;
import com.protalento.bootcamp.registronotas.services.MateriaService;
import com.protalento.bootcamp.registronotas.services.implement.AlumnoServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.CursosServiceImp;
import com.protalento.bootcamp.registronotas.services.implement.MateriaServiceImpl;


public class InscripcionesDAOImpl implements InscripcionesDAO{

	
	private DBMemoria db;
	private CursosService  cdi = new CursosServiceImp(db);
	private AlumnoService  adi = new AlumnoServiceImpl(db);
	private MateriaService mdi = new MateriaServiceImpl(db);
	
	public InscripcionesDAOImpl(DBMemoria db, CursosService cdi, AlumnoService adi, MateriaService mdi) {
		this.db = db;
		this.cdi=cdi;
		this.adi=adi;
		this.mdi=mdi;
		
	}
	
	
	public void save(Inscripciones entity) {
		Inscripciones ins=new Inscripciones();
		if(validateIns(entity.getId_curso(), entity.getId_alumno(), entity.getId_materia())) {
			System.out.println("Materia ya matriculada!");
		}else {
			if(db.getInscripciones().size()==0) {
				entity.setId(101);
				db.getInscripciones().add(entity);
					}else {
					int counter=0;
					ins=db.getInscripciones().get(db.getInscripciones().size()-1);
					counter=ins.getId();
					entity.setId(counter+1);
					db.getInscripciones().add(entity);
		          }
			Alumno alumno=new Alumno();
			alumno=adi.findByid(entity.getId_alumno());
			
			System.out.println("----------------------------------------------------------------------------------------------------------");
			System.out.println("Materia inscrita al alumno: "+alumno.getNombres()+" "+alumno.getApellidos());
			System.out.println("----------------------------------------------------------------------------------------------------------");
		    System.out.println(alumno.toString());
		}
		
	}

	
	public List<Inscripciones> findAll() {
		
		return db.getInscripciones();
	}

	
	public Inscripciones findByid(int id) {
		
		Inscripciones insc = new Inscripciones();
		
		for(Inscripciones aux: db.getInscripciones() ) {
			if(aux.getId()==id)
				insc = aux;
				
		}
		
		return insc;
	}


	public void delete(int id) {
		
		Inscripciones insc = new Inscripciones();
		
		   if(!toExist(id)) {
	       insc = findByid(id);
		   db.getInscripciones().remove(insc);
		   System.out.println("----------------------------------------------------------------------------");
		   System.out.println("Inscripci�n de Materia borrada con exito:"+insc.getId()+" "+insc.getId_materia());
		   System.out.println("----------------------------------------------------------------------------");
		   }else {
			   System.out.println("No existe");
		   }
	}

	
	public void update(Inscripciones entity) {
		for(int i=0; i<db.getInscripciones().size();i++) {
	    	   if(db.getInscripciones().get(i).getId()==entity.getId()) {
	    		   db.getInscripciones().get(i).setId_curso(entity.getId_curso());
	    		   db.getInscripciones().get(i).setId_materia(entity.getId_materia());
	    		   System.out.println("----------------------------------------------------------------------------");
	    		   System.out.println("Inscripci�n de materia actualizada con exito:"+entity.getId_curso()+" "+entity.getId_materia());
	    		   System.out.println("----------------------------------------------------------------------------");
	    	   }
		
	}
		
	}

	
	public boolean validateIns(int id_curso, int id_alumno, int id_materia) {
		boolean existe=false;
		
		for(Inscripciones aux : db.getInscripciones()) {
			if(aux.getId_alumno()==id_alumno && aux.getId_curso()==id_curso && aux.getId_materia()==id_materia)
				existe=true;
		}
		
	
		
		return existe;
	}

	
	public void toList() {
		Cursos curso;
		Alumno alumno = new Alumno();
		Materia materia;
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("                     Inscripciones registradas                                      ");
		System.out.println("------------------------------------------------------------------------------------");
		for(Inscripciones aux: db.getInscripciones()) {
		   System.out.println("Matr�cula No. "+aux.getId());
		   alumno=adi.findByid(aux.getId_alumno());
		   curso=cdi.findByid(aux.getId_curso());
		   materia=mdi.findByid(aux.getId_materia());
		   System.out.println("Alumno: "+alumno.getId()+" - "+alumno.getNombres()+" "+alumno.getApellidos());
		   System.out.println("Curso: "+curso.getDescripcion()+" - "+curso.getCodigo()+" - "+curso.getJornada());
		   System.out.println("Materia :"+materia.getDescripcion() );
		   System.out.println("------------------------------------------------------------------------------------");
		}
		
	}
	


	
	public boolean toExist(int id) {
		// TODO Auto-generated method stub
		return false;
	}


	
	public void findByIdAlumno(int id_alumno) {
		Cursos curso;
		Alumno alumno = new Alumno();
		Materia materia;
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("                     Inscripciones registradas                                      ");
		System.out.println("------------------------------------------------------------------------------------"); 
		alumno=adi.findByid(id_alumno);
		System.out.println("Alumno: "+alumno.getId()+" - "+alumno.getNombres()+" "+alumno.getApellidos());
		for(Inscripciones aux: db.getInscripciones()) {
			if(aux.getId_alumno()==id_alumno) {
			   System.out.println("Matr�cula No. "+aux.getId());
			   curso=cdi.findByid(aux.getId_curso());
			   materia=mdi.findByid(aux.getId_materia());
			   System.out.println("Curso: "+curso.getDescripcion()+" - "+curso.getCodigo()+" - "+curso.getJornada());
			   System.out.println("Materia :"+materia.getDescripcion() );
			   System.out.println("------------------------------------------------------------------------------------");
			}
			}
	}


}
