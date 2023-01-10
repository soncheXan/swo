package com.example.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empresa.model.Departamento;
import com.example.empresa.service.DepartamentoService;

@RestController
@RequestMapping("/api/departamento/")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping("/save")   //  http://localhost:8080/api/departamento/save
    public Departamento save(@RequestBody Departamento departamento){
        return departamentoService.guardarDepartamento(departamento);
    }

    @GetMapping("/list")    //  http://localhost:8080/api/departamento/list
    public List<Departamento> list(){
        return departamentoService.listarDepartamentos();
    }
}
