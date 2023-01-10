package com.example.zapateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zapateria.model.Zapato;
import com.example.zapateria.service.ZapatoService;

@RestController
@RequestMapping("/zapateria")
public class ZapatoController {

    @Autowired 
    private ZapatoService zapatoService;

    @GetMapping("/{id}")
    public Zapato searchId(@PathVariable Long id){
        return zapatoService.searchZapato(id);
    }
}
