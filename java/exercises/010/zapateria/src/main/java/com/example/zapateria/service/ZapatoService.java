package com.example.zapateria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zapateria.model.Zapato;
import com.example.zapateria.repository.IZapatoRepository;

@Service
public class ZapatoService {
    @Autowired
    private IZapatoRepository zapatoRepository;

    public Zapato searchZapato(Long id){
        return zapatoRepository.findById(id).orElse(null);
    }
}
