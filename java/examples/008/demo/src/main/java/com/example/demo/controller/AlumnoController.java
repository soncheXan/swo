package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.Alumno;
import com.example.demo.service.AlumnoService;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/search/{id}")
    public String findStudent(@PathVariable Long id, Model model){
        model.addAttribute("alumno", alumnoService.buscarAlumno(id));
        return "form";
    }

    @PostMapping("/save")
    public String save(Alumno alumno){
        alumnoService.guardarAlumno(alumno);
        return "redirect:/alumno/home";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
}
