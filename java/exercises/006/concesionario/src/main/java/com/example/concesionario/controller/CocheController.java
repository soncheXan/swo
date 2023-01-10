package com.example.concesionario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.concesionario.model.Coche;
import com.example.concesionario.service.CocheService;

@Controller
@RequestMapping("/concesionario")
public class CocheController {
    
    @Autowired
    private CocheService cocheService;
    
    @GetMapping("/search/coches")
    public String listCoches(Model model){
        model.addAttribute("listCoches", cocheService.listCoches());
        return "coches";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("coche", new Coche());
        return "form";
    }

    @PostMapping("/save")
    public String save(Coche coche){
        cocheService.saveCoche(coche);
        return "redirect:/concesionario/search/coches";
    }

}
