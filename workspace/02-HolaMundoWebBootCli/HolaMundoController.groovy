package com.atsistemas.curso.holamundoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HolaMundoController {

	@GetMapping("/")
	def String holaMundo() {
		 "Hola Mundo"
	}
}