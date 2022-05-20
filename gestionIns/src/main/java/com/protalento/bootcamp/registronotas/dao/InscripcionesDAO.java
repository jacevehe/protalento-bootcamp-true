package com.protalento.bootcamp.registronotas.dao;


import com.protalento.bootcamp.registronotas.domain.Inscripciones;

public interface InscripcionesDAO extends GenericDAO<Inscripciones> {
	
	public void findByIdAlumno(int id_alumno);
}
