package com.example.cinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/post-form")
    public String postForm( @RequestParam String username,
                            @RequestParam String password,
                            RedirectAttributes flash){
        
        System.out.println(username);
        System.out.println(password);

        if(username.equalsIgnoreCase("Paco") && password.equals("abc123.")){
            flash.addFlashAttribute("usuario", username);
            return "redirect:/home";
        }else{
            return "redirect:/auth-error";
        }
    }
}
