package com.atsitemas.curso.simpsons.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personaje {

	private String nombre; //PK
	private String apellido;
	//Relaciones
	@JsonIgnore
	private String padre;
	private int edad;
	
}
