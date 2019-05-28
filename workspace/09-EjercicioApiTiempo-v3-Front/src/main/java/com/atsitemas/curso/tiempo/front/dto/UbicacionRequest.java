package com.atsitemas.curso.tiempo.front.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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
public class UbicacionRequest implements Serializable {

	@Min(-90)
	@Max(90)
	private BigDecimal latitud;
	@Min(-180)
	@Max(180)
	private BigDecimal longitud;

}
