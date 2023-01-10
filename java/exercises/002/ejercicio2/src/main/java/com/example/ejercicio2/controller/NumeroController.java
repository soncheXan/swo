package com.example.ejercicio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ejercicio2.service.Numero;

@Controller
public class NumeroController {
    
    @GetMapping("/")
    public String senRandom(Model model){
        
        Numero numero = new Numero();
        int numeroAleatorio = numero.envioNumero();
        model.addAttribute("numero", numeroAleatorio);

        return "randomView";
    }
}
