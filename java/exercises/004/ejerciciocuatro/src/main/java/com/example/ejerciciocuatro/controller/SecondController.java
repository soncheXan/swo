package com.example.ejerciciocuatro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {
    
    @GetMapping("/form")
    public String metodoDos(){
        return "form";
    }

    @PostMapping("/post-form")
    public String capturarForm( Model model,
                                @RequestParam String username,
                                @RequestParam String email)
    {
        model.addAttribute("nombre", username);
        model.addAttribute("correo", email);
        return "/post-form";
    }
}
