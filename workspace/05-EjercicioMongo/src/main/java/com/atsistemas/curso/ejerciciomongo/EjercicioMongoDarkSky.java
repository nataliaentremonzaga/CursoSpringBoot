package com.atsistemas.curso.ejerciciomongo;

import org.springframework.data.annotation.Id;


public class EjercicioMongoDarkSky{

	@Id
	private Long id;
	private String summary;
	private String icon;
	private Long temperature;
	
	public EjercicioMongoDarkSky(Long id, String summary, String icon, Long temperature) {
		super();
		this.id = id;
		this.summary = summary;
		this.icon = icon;
		this.temperature = temperature;
	}

	public EjercicioMongoDarkSky() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getTemperature() {
		return temperature;
	}

	public void setTemperature(Long temperature) {
		this.temperature = temperature;
	}
	
	
}
