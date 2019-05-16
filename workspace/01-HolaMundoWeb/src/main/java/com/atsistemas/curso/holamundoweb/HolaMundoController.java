package com.atsistemas.curso.holamundoweb;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.thymeleaf.spring5.view.ThymeleafView;

@Controller
//El retorno de los metodos es una vista por que no tiene @ResponseBody
public class HolaMundoController {

	@GetMapping("/uno")
	public ModelAndView holaMundo() {
		//return "Hola Mundo!!!";//Este String en todo caso es un model (dato)
		
		//Definimos el modelo
		String saludo = "Hola Mundo!!!";
				
		Map<String, String> model = new HashMap<>();
		
		model.put("saludo", saludo);
		
		return  new ModelAndView("HolaMundo/index", model );
	}
	
	@GetMapping("/dos")
	public String holaMundo2(Model model) {
		
		//Definimos el modelo
		String saludo = "Hola Mundo!!!";
		
		model.addAttribute("saludo", saludo);
		
		return  "HolaMundo/index";
	}
	
	@GetMapping("/tres") //opcion preferida. por estar lo mas desacoplada posible de Spring
	public String holaMundo3(Map<String, String> model) {
				
		//Definimos el modelo
		String saludo = "Hola Mundo!!!";
		
		model.put("saludo", saludo);
		
		return  "HolaMundo/index";
	}
	
	@GetMapping("/cuatro")
	public View holaMundo4(Map<String, String> model) {
		
		//Definimos el modelo
		String saludo = "Hola Mundo!!!";
		
		model.put("saludo", saludo);
		
		return new ThymeleafView("classpath:resources/templates/HolaMundo/index.html");
	}
}
