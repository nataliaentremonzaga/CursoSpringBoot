package com.atsitemas.curso.tiempo.bussiness.copy;

import org.springframework.stereotype.Component;

import com.atsitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsitemas.curso.tiempo.dto.PrediccionResponse;
import com.atsitemas.curso.tiempo.entities.Prediccion;

@Component
public class PrediccionFactory {

	private long contador = 0;
	
	public Prediccion getInstanceFromPrediccionResponse(PrediccionResponse prediccionResponse) {
		return new Prediccion(
				obtenerId(),
				prediccionResponse.getIcono(), 
				prediccionResponse.getDescripcion(), 
				prediccionResponse.getTemperatura());
	}
	
	public PrediccionResponse getInstanceFromPrediccion(Prediccion prediccion) {
		return new PrediccionResponse(
				prediccion.getIcono(), 
				prediccion.getDescripcion(), 
				prediccion.getTemperatura());
	}

	private Long obtenerId() {
		return ++contador;
	}

	public PrediccionResponse getInstanceFromPrediccionDarkSkyResponse(
			PrediccionDarkSkyResponse prediccionDarkSkyResponse) {
		return new PrediccionResponse(
				prediccionDarkSkyResponse.getIcon(), 
				prediccionDarkSkyResponse.getSummary(), 
				prediccionDarkSkyResponse.getTemperature());
	}
	
}
