package com.atsitemas.curso.tiempo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atsitemas.curso.tiempo.web.api.TiempoRestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private TiempoRestController sut;
	
	@Test
	public void contextLoads() {
	}

}
