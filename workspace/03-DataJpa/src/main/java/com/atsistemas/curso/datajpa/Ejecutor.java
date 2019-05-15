package com.atsistemas.curso.datajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ejecutor implements CommandLineRunner{

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		personaRepository.save(new Persona (1L, "Victor"));
		personaRepository.save(new Persona (2L, "Laura"));
		personaRepository.save(new Persona (3L, "Cristina"));
		
		
		Persona victor= personaRepository.getOne(2L);
		System.out.println(victor);
		
		List<Persona> laura = personaRepository.findByNombre("Laura");
		laura.forEach(p -> System.out.println(p));
		
		List<Persona> cristina = personaRepository.findByNombre("Cristina");
		cristina.forEach(p -> System.out.println(p));
		
		
	}

	
}
