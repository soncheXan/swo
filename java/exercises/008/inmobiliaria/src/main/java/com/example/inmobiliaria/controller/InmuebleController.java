package com.example.inmobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.inmobiliaria.model.Inmueble;
import com.example.inmobiliaria.service.InmuebleService;

@Controller
@RequestMapping("/inmobiliaria")
public class InmuebleController {
    
    @Autowired
    private InmuebleService inmuebleService;

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }
    
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("inmueble", new Inmueble());
        return "form";
    }

    @PostMapping("/save")
    public String save(Inmueble inmueble){
        inmuebleService.saveInmueble(inmueble);
        return "redirect:/inmobiliaria/form";
    }
}
