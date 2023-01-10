package com.example.nba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.model.Jugador;
import com.example.nba.repository.IJugadorRepository;



@Service
public class JugadorService {
    
    @Autowired
    private IJugadorRepository jugadorRepository;

    public List<Jugador> listJugadores(){
        return jugadorRepository.findAll();
    }
}
