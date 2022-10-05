package com.example.ejercicio3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejercicio3.models.Alumno;
import com.example.ejercicio3.service.Promedio;

@Controller
@RequestMapping({"/alumno", "/alumnado", "/"})
public class AlumnoController {
    
    @GetMapping
    public String addAlumnos(Model model){
        

        List<Alumno> alumnos = new ArrayList<>();
        Promedio promedio = new Promedio();

        alumnos.add(new Alumno(1, "Pepe", "Pérez", 5.6f));
        alumnos.add(new Alumno(2, "Manolo", "Romero", 9.2f));
        alumnos.add(new Alumno(3, "José", "García", 4.7f));

        model.addAttribute("alumnos", alumnos);
        model.addAttribute("promedio", promedio.calcularPromedio(alumnos));

        return "alumnosView";
    }

}
