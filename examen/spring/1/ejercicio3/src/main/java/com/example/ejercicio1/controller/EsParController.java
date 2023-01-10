package com.example.ejercicio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejercicio1.service.EsParService;

@Controller
@RequestMapping({"", "/", "/es-par"})
public class EsParController {
    
    @Autowired
    private EsParService esparservice;

    @GetMapping("/{numero}")
    public String esPar(@PathVariable Long numero, Model model){
        model.addAttribute("espar", esparservice.esPar(numero));
        model.addAttribute("numero", numero);
        return "espar";
    }
}
