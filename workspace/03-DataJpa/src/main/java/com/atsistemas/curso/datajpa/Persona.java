package com.atsistemas.curso.datajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAS") //Para poner el nombre a la tabla sino pondra el nombre de la clase
public class Persona {

	@Id
	@Column(name= "Identificador") //Para poner el nombre a una columna sino pondra el nombre id
	private Long id;
	
	private String nombre;

	public Persona(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Persona() {
		super();
	}
	
	/* Getter and Setter*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
