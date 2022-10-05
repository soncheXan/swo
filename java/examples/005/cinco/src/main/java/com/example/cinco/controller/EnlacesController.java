package com.example.cinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnlacesController {

    @GetMapping
    public String vistaEnlaces(){
        return "vistaEnlaces";
    }

    @GetMapping("/enlaces")
    public String enlaces(  @RequestParam(name = "nombre", required = false)String nombre,
                            @RequestParam int edad){
        
        System.out.println(nombre);
        System.out.println(edad);
        
        return "enlaces";
    }
}