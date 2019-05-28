package com.atsitemas.curso.tiempo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.atsitemas.curso.tiempo.service.TiempoService;

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = TiempoRestController.class)
@AutoConfigureMockMvc
@WebMvcTest
public class TiempoApiTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private TiempoService tiempoService;
	
	@Before
	public void init() {
		when(tiempoService.obtenerPredicciones()).thenReturn(new ArrayList<>());
	}
	
	@Test
	public void test() throws Exception {
		this.mockMvc.perform(get("/predicion"))
		.andExpect(status().isOk())
		.andExpect(content().string("[]"));
	}
}
