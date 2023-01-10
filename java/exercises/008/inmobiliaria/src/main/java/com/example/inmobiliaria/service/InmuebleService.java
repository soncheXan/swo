package com.example.inmobiliaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inmobiliaria.model.Inmueble;
import com.example.inmobiliaria.repository.IInmuebleRepository;

@Service
public class InmuebleService {
    
    @Autowired
    private IInmuebleRepository inmuebleRepository;

    public void saveInmueble(Inmueble inmueble){
        inmuebleRepository.save(inmueble);
    }
}
