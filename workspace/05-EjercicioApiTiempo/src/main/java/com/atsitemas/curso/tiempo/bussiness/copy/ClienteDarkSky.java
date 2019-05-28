package com.atsitemas.curso.tiempo.bussiness.copy;

import com.atsitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsitemas.curso.tiempo.dto.UbicacionRequest;

public interface ClienteDarkSky {

	PrediccionDarkSkyResponse obtenerPrediccion(UbicacionRequest ubicacionRequest);
	
}
