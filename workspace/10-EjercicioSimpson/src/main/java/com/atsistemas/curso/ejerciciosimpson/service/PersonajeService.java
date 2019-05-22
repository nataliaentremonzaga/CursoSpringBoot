package com.atsistemas.curso.ejerciciosimpson.service;

import java.util.Collection;

import com.atsistemas.curso.ejerciciosimpson.dto.PersonajeDto;

public interface PersonajeService {

	//retornamos void porque no se autogenera nada en la base de datos.
	void alta(PersonajeDto personaje);
		
	//Retornamos int para tener conciencia de a cuantos registros a afectado la operacion.
	int borrar(String nombre);
	
	//Actualizacion del objeto completo
	int actualizar(PersonajeDto personaje);
	
	//Consulta por la PK
	PersonajeDto consultaPorNombre(String nombre);
	
	//Consulta de todos sin orden
	Collection<PersonajeDto> consultaTodos();
	
	Collection<PersonajeDto> consultaPorApellido(String apellido);
	
	PersonajeDto consultaPadrePorNombre(String nombre);
	
}
