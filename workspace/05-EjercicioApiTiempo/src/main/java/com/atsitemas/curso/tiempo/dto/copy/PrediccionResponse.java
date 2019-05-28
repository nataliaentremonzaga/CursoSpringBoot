package com.atsitemas.curso.tiempo.dto.copy;

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
public class PrediccionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String icono;
	private String descripcion;
	private BigDecimal temperatura;

}
