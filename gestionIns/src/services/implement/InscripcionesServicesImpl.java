package com.protalento.bootcamp.registronotas.services.implement;

import com.protalento.bootcamp.registronotas.app.DBMemoria;
import com.protalento.bootcamp.registronotas.dao.implement.InscripcionesDAOImpl;
import com.protalento.bootcamp.registronotas.domain.Inscripciones;
import com.protalento.bootcamp.registronotas.services.AlumnoService;
import com.protalento.bootcamp.registronotas.services.CursosService;
import com.protalento.bootcamp.registronotas.services.InscripcionesService;
import com.protalento.bootcamp.registronotas.services.MateriaService;


public class InscripcionesServicesImpl extends AbstractBaseService<Inscripciones> implements InscripcionesService{
    private DBMemoria db;
	private CursosService cs=new CursosServiceImp(db);
	private AlumnoService as=new AlumnoServiceImpl(db);
	private MateriaService ms=new MateriaServiceImpl(db);
	
	public InscripcionesServicesImpl(DBMemoria db,CursosService cs,AlumnoService as, MateriaService ms) {
		super(new InscripcionesDAOImpl(db,cs,as,ms), db);
		this.cs=cs;
		this.as=as;
		this.ms=ms;
		this.db=db;
		
	}

	
	public void findByIdAlumno(int id_alumno) {
          
		InscripcionesDAOImpl ins= new InscripcionesDAOImpl(db,cs,as,ms);
		ins.findByIdAlumno(id_alumno);
	}
}
