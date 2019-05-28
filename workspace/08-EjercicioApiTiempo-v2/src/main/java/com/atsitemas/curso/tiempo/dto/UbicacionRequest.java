package com.atsitemas.curso.tiempo.dto;

import java.io.Serializable;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UbicacionRequest implements Serializable{

	private BigDecimal latitud;
	private BigDecimal longitud;
	
}
