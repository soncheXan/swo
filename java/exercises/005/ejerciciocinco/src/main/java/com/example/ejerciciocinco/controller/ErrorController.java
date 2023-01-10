package com.example.ejerciciocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/auth-error")
    public String unauthorized(){
        return "errores/unauthorized";
    }
}
