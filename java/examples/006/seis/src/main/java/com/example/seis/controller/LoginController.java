package com.example.seis.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String login (@RequestParam(name = "username")String username, 
                        @RequestParam(name="password") String pass, 
                        RedirectAttributes flash, HttpSession session){

        if(username.equalsIgnoreCase("Paco") && pass.equals("1234")){
            // flash.addAttribute("success", "Bienvenido"+name);
            session.setAttribute("usuario", username);
            return "redirect:/private/home";
        }
        else{
            flash.addFlashAttribute("error", "Usuario "+username+" no valido");
            return "redirect:/errores/auth-error";
        }
    }
}
