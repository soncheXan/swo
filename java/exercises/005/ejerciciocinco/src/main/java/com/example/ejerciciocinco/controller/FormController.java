package com.example.ejerciciocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController{

    @GetMapping("/form")
    public String form(){
        return "formLog";
    }

    @PostMapping("post-form")
    public String formPost( @RequestParam(name = "username") String user,
                            @RequestParam(name = "password") String pass,
                            RedirectAttributes flash){

        flash.addFlashAttribute("user", user);
        if(user.equalsIgnoreCase("Pepe") && pass.equals("12345")){
            return "redirect:/home";
        }else
            return "redirect:/auth-error";
    }
}