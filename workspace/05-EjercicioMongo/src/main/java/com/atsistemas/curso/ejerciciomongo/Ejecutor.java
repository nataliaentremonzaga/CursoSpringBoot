package com.atsistemas.curso.ejerciciomongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ejecutor implements CommandLineRunner{

	@Autowired
	private CoordenadasRepository coordenadasRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		coordenadasRepository.save(new Coordenadas ("7546f54c1c0561c1be0212d91d7f0ba4", 40.3965242, -3.6834461));

		
	}

	
}
