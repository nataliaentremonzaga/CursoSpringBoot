package com.atsitemas.curso.tiempo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

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
public class Prediccion implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String icono;
	private String descripcion;
	private BigDecimal temperatura;

}
