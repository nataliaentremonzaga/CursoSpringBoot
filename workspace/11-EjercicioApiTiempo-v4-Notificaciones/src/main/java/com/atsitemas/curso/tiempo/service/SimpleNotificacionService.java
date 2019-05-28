package com.atsitemas.curso.tiempo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsitemas.curso.tiempo.bussiness.NotificacionFactory;
import com.atsitemas.curso.tiempo.dto.NotificacionRequest;
import com.atsitemas.curso.tiempo.entities.Notificacion;
import com.atsitemas.curso.tiempo.repositories.NotificacionRepository;

@Service
public class SimpleNotificacionService implements NotificacionService {

	@Autowired
	private NotificacionRepository notificacionRepository;
	
	@Autowired
	private NotificacionFactory notificacionFactory;
	
	@Override
	public void guardar(NotificacionRequest notificacionRequest) {
		notificacionRepository.save(notificacionFactory.getInstanceFromNotificacionRequest(notificacionRequest));
	}

	@Override
	public List<NotificacionRequest> consultarNotificacionNoLeidas() {
		List<Notificacion> resultado = notificacionRepository.findByLeido(false);
		return resultado
				.parallelStream()
				.map(n -> notificacionFactory.getInstanceFromNotificacion(n))
				.collect(Collectors.toList());
	}

}
