package com.atsistemas.curso.tiempo.bussiness;

import org.springframework.stereotype.Component;

import com.atsistemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsistemas.curso.tiempo.dto.PrediccionResponse;
import com.atsistemas.curso.tiempo.entities.Prediccion;

@Component
public class PrediccionFactory {

	private long contador= 0;
	
	
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
		// TODO Auto-generated method stub
		return ++contador;
	}

	public PrediccionResponse getInstanceFromPrediccionDarkSkyResponse(PrediccionDarkSkyResponse prediccionDarkSkyResponse) {
		// TODO Auto-generated method stub
		return new PrediccionResponse(
				prediccionDarkSkyResponse.getIcon(), 
				prediccionDarkSkyResponse.getSummary(), 
				prediccionDarkSkyResponse.getTemperature());
	}
	
	
}