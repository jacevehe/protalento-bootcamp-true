package com.protalento.bootcamp.registronotas.services;

import com.protalento.bootcamp.registronotas.domain.Inscripciones;

public interface MenuInscripcionesService extends MenuGenericService<Inscripciones> {
	
	
	public void findByIdAlumno(int id_alumno);
}
