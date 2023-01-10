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

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("alumnos", alumnoService.listAlumnos());
        return "alumnosView";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Long id){
        alumnoService.deleteAlumno(id);
        return "redirect:/alumno/list";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("alumno", new Alumno());
        return "form";
    }

    @PostMapping("/save")
    public String save(Alumno alumno){

        alumnoService.saveAlumno(alumno);
        return "redirect:/alumno/list";
    }
}
