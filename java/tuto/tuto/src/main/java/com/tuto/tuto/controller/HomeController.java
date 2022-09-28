package com.tuto.tuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")	// http://localhost:8080/home
public class HomeController {

	@GetMapping("/tuto")
	
	public String home(Model buenas) {
        String nombre = "Esteban Co", color = "rojo";

        buenas.addAttribute("nombre", nombre);
        buenas.addAttribute("rojo", color);
		return "index";
	}
}
