package com.example.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service
public class EsParService {
    public Boolean esPar(Long numero){
        if(numero%2 == 0)
            return true;
        else
            return false;
    }
}
