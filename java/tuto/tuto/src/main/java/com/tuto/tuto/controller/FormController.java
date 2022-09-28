package com.tuto.tuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @GetMapping("/get-form")
    public String getForm(  Model buenas, 
                            // @RequestParam(name= "username")String usuario,
                             @RequestParam(name= "id")Integer numero
                            ){
        // buenas.addAttribute("usuario", usuario);
        buenas.addAttribute("id", numero);
        return "home";
    }
}
