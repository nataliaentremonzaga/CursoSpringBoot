package com.atsitemas.curso.tiempo.service;

import com.atsitemas.curso.tiempo.dto.PrediccionResponse;
import com.atsitemas.curso.tiempo.dto.UbicacionRequest;

public interface TiempoService {

	PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest);
	
}
