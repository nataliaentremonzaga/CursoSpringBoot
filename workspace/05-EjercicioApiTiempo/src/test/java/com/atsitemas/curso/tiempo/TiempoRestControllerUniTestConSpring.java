package com.atsitemas.curso.tiempo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.atsitemas.curso.tiempo.dto.PrediccionResponse;
import com.atsitemas.curso.tiempo.service.TiempoService;
import com.atsitemas.curso.tiempo.web.api.TiempoRestController;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TiempoRestController.class)
public class TiempoRestControllerUniTestConSpring {

	@Autowired
	private TiempoRestController sut;
	@MockBean
	private TiempoService tiempoService;
	
	//Configurar el Mock
	@Before
	public void init() {
		when(tiempoService.obtenerPredicciones()).thenReturn(new ArrayList<>());
	}
	
	@Test
	public void comprobarQueSeRetornaUnaCollecion() {
		int expected= 0;
		
		ResponseEntity<Collection<PrediccionResponse>> prediccionRE= sut.obtenerPredicciones();
		
		assertNotNull(prediccionRE.getBody());
		assertEquals(expected,prediccionRE.getBody().size());
	}

}
