package com.atsitemas.curso.tiempo.dto.copy;

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
public class PrediccionDarkSkyResponse {

	private Currently currently;

	public String getIcon() {
		return this.currently.getIcon();
	}

	public String getSummary() {
		return this.currently.getSummary();
	}

	public BigDecimal getTemperature() {
		return this.currently.getTemperature();
	}

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
class Currently {
	private String icon;
	private String summary;
	private BigDecimal temperature;


}
