package com.atsistemas.curso.tiempo.web.api;

import java.math.BigDecimal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.curso.tiempo.dto.PrediccionResponse;
import com.atsistemas.curso.tiempo.dto.UbicacionRequest;
import com.atsistemas.curso.tiempo.service.TiempoService;

@RestController
@RequestMapping("/prediccion")
public class TiempoRestController {

//	El controlador no deberia tener ningun tipo de logica (for, forech)
//	Si puede tener un if dependiendo del resultado que queremos devolver.
	
	@Autowired
	private TiempoService tiempoService;
	
	@GetMapping("/{latitud}/{longitud}")
	public ResponseEntity<PrediccionResponse> obtenerPrediccionPorUbicacion(@PathVariable BigDecimal latitud, BigDecimal longitud) {
		
		UbicacionRequest ubicacionRequest = new UbicacionRequest(latitud, longitud);
		
		PrediccionResponse resultado = tiempoService.obtenerPrediccionPorUbicacion(ubicacionRequest);
		
		return new ResponseEntity<PrediccionResponse> (resultado, HttpStatus.OK);
	
	}
	
	@GetMapping("/")
	public ResponseEntity<Collection<PrediccionResponse>> obtenerPrediccionResponse(){
		
		Collection<PrediccionResponse> resultado = tiempoService.obtenerPrediccionResponse();
		
		return new ResponseEntity<Collection<PrediccionResponse>> (resultado, HttpStatus.OK);
		
	}
}
