package com.atsitemas.curso.tiempo.bussiness;

import org.springframework.stereotype.Component;

import com.atsitemas.curso.tiempo.dto.NotificacionRequest;
import com.atsitemas.curso.tiempo.entities.Notificacion;

@Component
public class NotificacionFactory {

	public Notificacion getInstanceFromNotificacionRequest(NotificacionRequest notificacionRequest) {
		return new Notificacion(notificacionRequest.getMensaje(), false);
	}

	public NotificacionRequest getInstanceFromNotificacion(Notificacion n) {
		return new NotificacionRequest(n.getMensaje());
	}

	
}
