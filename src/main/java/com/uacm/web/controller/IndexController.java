package com.uacm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	/*
	 * Cada clase controladora puede tener varios métodos
	 * es decir varias URL 
	 * es decir, cada método atiende a un html
	 */
	
	@GetMapping("/index")
	public String index() {
		// El return busca una vista con extensión .html
		return "index";
	}
	
	@RequestMapping(value="/perfil", method = RequestMethod.GET)
	public String perfil(Model model) {
		// Le pedimos datos al modelo y los devuelve
		String cadenaSaludo = "Hola Spring Subtítulo";
		int anioActual = 2022;
		
		// Primer parámetro es el alias, como se va a llamar en la vista
		model.addAttribute("saludo", cadenaSaludo);
		model.addAttribute("anio", anioActual);
		model.addAttribute("titulo", "Perfil");
		
		return "perfil";
	}
}
