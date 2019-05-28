package com.atsitemas.curso.tiempo.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atsitemas.curso.tiempo.entities.Prediccion;
import com.atsitemas.curso.tiempo.service.PrediccionService;

@Component
public class PrediccionRabbitListener {
	
	@Autowired
	private PrediccionService prediccionService;	

	@RabbitListener(queues = {"ejercicio-prediccion-queue"})
	public void procesarConsultaPrediccion(Prediccion prediccion) {
		prediccionService.salvarPrediccion(prediccion);		
	}
	
}
