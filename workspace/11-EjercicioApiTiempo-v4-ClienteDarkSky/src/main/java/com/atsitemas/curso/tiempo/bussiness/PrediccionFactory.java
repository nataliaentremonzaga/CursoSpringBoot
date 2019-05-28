package com.atsitemas.curso.tiempo.bussiness;

import org.springframework.stereotype.Component;

import com.atsitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsitemas.curso.tiempo.dto.PrediccionResponse;

@Component
public class PrediccionFactory {

	public PrediccionResponse getInstanceFromPrediccionDarkSkyResponse(
			PrediccionDarkSkyResponse prediccionDarkSkyResponse) {
		return new PrediccionResponse(
				prediccionDarkSkyResponse.getIcon(), 
				prediccionDarkSkyResponse.getSummary(), 
				prediccionDarkSkyResponse.getTemperature());
	}
	
}
