package com.atsitemas.curso.tiempo.service;

import java.util.List;

import com.atsitemas.curso.tiempo.dto.NotificacionRequest;

public interface NotificacionService {

	void guardar(NotificacionRequest notificiacionRequest);
	
	List<NotificacionRequest> consultarNotificacionNoLeidas();
	
}
