package com.example.multitabla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multitabla.model.Departamento;
import com.example.multitabla.service.DepartamentoService;


@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/list")    // http://localhost:8080/api/departamento/list
    public List<Departamento> list(){   
        return departamentoService.listaDepartamentos();
    }
}
