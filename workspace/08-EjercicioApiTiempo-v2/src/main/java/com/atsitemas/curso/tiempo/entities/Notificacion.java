package com.atsitemas.curso.tiempo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.atsitemas.curso.tiempo.dto.NotificacionRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Notificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mensaje;
	private boolean leido;
	
	public Notificacion(String mensaje, boolean leido) {
		super();
		this.mensaje = mensaje;
		this.leido = leido;
	}
	
	
	
}
