package com.example.nba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.model.Jugador;
import com.example.nba.service.JugadorService;


@RestController
@RequestMapping("/")
public class JugadorController {
    
    @Autowired
    private JugadorService jugadorService;

    @GetMapping("/lista-jugadores")
    public List<Jugador> list() {
        return jugadorService.listJugadores();
    }
}
