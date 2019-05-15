package com.atsistemas.curso.tiempo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class UbicacionRequest implements Serializable {


	private static final long serialVersionUID = 1L;
	private BigDecimal latitud;
	private BigDecimal longitud;
	
	public UbicacionRequest(BigDecimal latitud, BigDecimal longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public UbicacionRequest() {
		super();
	}

	/*hashCode*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		return result;
	}

	/*Equals*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UbicacionRequest other = (UbicacionRequest) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}

	/*To String*/
	@Override
	public String toString() {
		return "PrediccionRequest [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	/*Getter and Setter*/

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}
	
	
	
}
