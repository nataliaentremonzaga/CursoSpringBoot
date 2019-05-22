package com.atsistemas.curso.ejerciciosimpson.we.api;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.curso.ejerciciosimpson.dto.PersonajeDto;
import com.atsistemas.curso.ejerciciosimpson.dto.RecursosAfectadosOperationResponse;
import com.atsistemas.curso.ejerciciosimpson.service.PersonajeService;

@RestController
@RequestMapping("/hateoas/personaje")
public class PersonajeHateoasRestController {

	@Autowired
	private PersonajeService personajeService;

	@PutMapping
	public ResponseEntity<RecursosAfectadosOperationResponse> alta(@RequestBody PersonajeDto personajeDto) {

		// TODO seria mejor crear una capa de adaptacion al servicio
		int numeroRecursosAfectados = personajeService.actualizar(personajeDto);

		if (numeroRecursosAfectados > 0) {
			return new ResponseEntity<RecursosAfectadosOperationResponse>(
					new RecursosAfectadosOperationResponse(numeroRecursosAfectados), HttpStatus.OK);
		}

		personajeService.alta(personajeDto);

		return new ResponseEntity<RecursosAfectadosOperationResponse>(HttpStatus.CREATED);
	}

	@DeleteMapping("/{nombre}")
	public ResponseEntity<RecursosAfectadosOperationResponse> borrar(@PathVariable String nombre) {
		int numeroRecursosAfectados = personajeService.borrar(nombre);
		return new ResponseEntity<RecursosAfectadosOperationResponse>(
				new RecursosAfectadosOperationResponse(numeroRecursosAfectados), HttpStatus.OK);
	}

	@GetMapping(path = "/{nombre}", produces= "application/hal+json")
	public ResponseEntity<Resource<PersonajeDto>> consultaPorNombre(@PathVariable String nombre) {
		PersonajeDto personaje = personajeService.consultaPorNombre(nombre);
		
		Resource<PersonajeDto> personajeHateoas = new Resource<>(
				personaje, 
				linkTo(methodOn(PersonajeRestController.class).consultaPorNombre(nombre)).withSelfRel(),
				linkTo(methodOn(PersonajeRestController.class).consultaPorNombre(personaje.getPadre())).withRel("padre"),
				linkTo(methodOn(PersonajeRestController.class).consultaPorNombre(nombre)).withRel("padre"));
		
		
		return new ResponseEntity<Resource<PersonajeDto>>(personajeHateoas, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<Collection<PersonajeDto>> consultaTodos() {
		Collection<PersonajeDto> personaje = personajeService.consultaTodos();
		return new ResponseEntity<Collection<PersonajeDto>>(personaje, HttpStatus.OK);
	}

	@GetMapping(params = "apellido")
	public ResponseEntity<Collection<PersonajeDto>> consultaPorApellido(@RequestParam String apellido) {
		Collection<PersonajeDto> personaje = personajeService.consultaPorApellido(apellido);
		return new ResponseEntity<Collection<PersonajeDto>>(personaje, HttpStatus.OK);
	}

	@GetMapping("/{nombre}/padre")
	public ResponseEntity<PersonajeDto> consultaPadrePorNombre(@PathVariable String nombre) {
		PersonajeDto personaje = personajeService.consultaPadrePorNombre(nombre);
		return new ResponseEntity<PersonajeDto>(personaje, HttpStatus.OK);
	}

}
