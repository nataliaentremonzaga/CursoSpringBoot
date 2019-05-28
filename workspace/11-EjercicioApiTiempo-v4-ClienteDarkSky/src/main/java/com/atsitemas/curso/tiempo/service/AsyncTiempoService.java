package com.atsitemas.curso.tiempo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsitemas.curso.tiempo.bussiness.ClienteDarkSky;
import com.atsitemas.curso.tiempo.bussiness.PrediccionFactory;
import com.atsitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atsitemas.curso.tiempo.dto.PrediccionResponse;
import com.atsitemas.curso.tiempo.dto.UbicacionRequest;

@Service
public class AsyncTiempoService implements TiempoService{
	
	@Autowired 
	private ClienteDarkSky clienteDarkApi;
	
	@Autowired
	private PrediccionFactory prediccionFactory;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Override
	public PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest) {
		
		PrediccionDarkSkyResponse prediccionDarkSkyResponse = clienteDarkApi.obtenerPrediccion(ubicacionRequest);
		
		PrediccionResponse prediccionResponse = prediccionFactory.getInstanceFromPrediccionDarkSkyResponse(prediccionDarkSkyResponse);
		
		rabbitTemplate.convertAndSend("ejercicio-prediccion-exchange", "prediccion.nueva", prediccionResponse);
		
		return prediccionResponse;
	}

}
