package com.example.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio2.model.Empleado;
import com.example.ejercicio2.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/lista")
    public List<Empleado> verEmpleados(){
        return empleadoService.showAll();
    }

    @GetMapping("/{id}")
    public Empleado id(@PathVariable Long id){
        return empleadoService.verEmpleadopPorId(id);
    }

    @GetMapping("/por-email/{email}")
    public Empleado email(@PathVariable String email){
        return empleadoService.verEmpleadoPorEmail(email);
    }
}
