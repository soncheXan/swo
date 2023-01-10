package com.example.ejerciciocuatro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController{

    @GetMapping
    public String metodoUno(){
        return "enlaces";
    }

    @GetMapping("/enlaces")
    public String capturaId(Model model, @RequestParam int id){
        model.addAttribute("valor", id);
        return "vista";
    }
}