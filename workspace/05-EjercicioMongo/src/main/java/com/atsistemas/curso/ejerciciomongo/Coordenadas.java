package com.atsistemas.curso.ejerciciomongo;

import org.springframework.data.annotation.Id;


public class Coordenadas{

	@Id
	private String id;
	private Double latitude;
	private Double longitude;
	
	public Coordenadas() {
		super();
	}
	
	public Coordenadas(String id, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}
