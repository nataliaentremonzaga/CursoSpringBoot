package com.atsistemas.curso.tiempo.service;

import java.util.Collection;

import com.atsistemas.curso.tiempo.dto.PrediccionResponse;
import com.atsistemas.curso.tiempo.dto.UbicacionRequest;

public interface TiempoService {

	PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest);
	
	Collection<PrediccionResponse> obtenerPrediccionResponse();
	
}
