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
@RequestMapping({"/alumnos", "/alumnado", "/"})
public class AlumnoController {
    
    @GetMapping({"/alumnos", "/alumnado", "/"})
    public String addAlumnos(Model model){
        

        List<Alumno> alumnos = new ArrayList<>();
        Promedio promedio = new Promedio();

        alumnos.add(new Alumno(1, "Pepe", "Pérez", "Garcia", 5.6f));
        alumnos.add(new Alumno(2, "Manolo", "Romero", "Carballeira", 9.2f));
        alumnos.add(new Alumno(3, "José", "García", "Díaz", 4.7f));

        model.addAttribute("alumnos", alumnos);
        model.addAttribute("promedio", promedio.calcularPromedio(alumnos));

        return "alumnosView";
    }

}
