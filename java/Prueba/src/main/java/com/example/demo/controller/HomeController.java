package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")	// http://localhost:8080/home
public class HomeController {

	@GetMapping("/prueba")
	
	public String home() {
		return "home";
	}
}
