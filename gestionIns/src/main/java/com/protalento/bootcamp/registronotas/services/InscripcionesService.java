package com.protalento.bootcamp.registronotas.services;

import com.protalento.bootcamp.registronotas.domain.Inscripciones;

public interface InscripcionesService extends GenericService<Inscripciones> {

	public void findByIdAlumno(int id_alumno);
}
