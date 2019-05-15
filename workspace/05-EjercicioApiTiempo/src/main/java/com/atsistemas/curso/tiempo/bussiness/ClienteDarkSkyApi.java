package com.atsistemas.curso.tiempo.bussiness;

import com.atsistemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsistemas.curso.tiempo.dto.PrediccionResponse;
import com.atsistemas.curso.tiempo.dto.UbicacionRequest;

public interface ClienteDarkSkyApi {

	PrediccionDarkSkyResponse obtenerPrediccion(UbicacionRequest ubicacionRequest);
	
}
