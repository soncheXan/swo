package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/home")	// http://localhost:8080/home
public class HomeController {

	@GetMapping("/prueba")
	
	public String home(Model model) {
		List<Persona> personas = new ArrayList<>();
		
		Persona p1 = new Persona("Robert", "robert@es.es");
		Persona p2 = new Persona("Pepe", "pepe@es.es");
		personas.add(p1);
		personas.add(p2);
		
		
		String categoria = "Personas";
		model.addAttribute("personas", personas);
		model.addAttribute("section", categoria);
		return "home";
	}
}
