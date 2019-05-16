package com.atsistemas.curso.tiempo.bussiness;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsistemas.curso.tiempo.dto.PrediccionResponse;
import com.atsistemas.curso.tiempo.dto.UbicacionRequest;

@Component
public class RestTemplateClienteDarkSkyApi implements ClienteDarkSkyApi {

	@Autowired
	private DarkSkyProperties darkSkyProperties;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public PrediccionDarkSkyResponse obtenerPrediccion(UbicacionRequest ubicacionRequest) {

		String url= 
				darkSkyProperties.getUrl() + "/" + 
				darkSkyProperties.getApiKey() + "/"+  
				ubicacionRequest.getLatitud() + "," + 
				ubicacionRequest.getLongitud();
		
		try {
			ResponseEntity<PrediccionDarkSkyResponse> respuesta =restTemplate.getForEntity(new URI(url), PrediccionDarkSkyResponse.class);
			return respuesta.getBody();
		} catch (Exception e) {
			throw new DarkSkyException(e);
		} 
	}
}
