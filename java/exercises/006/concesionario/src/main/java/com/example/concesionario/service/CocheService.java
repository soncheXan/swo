package com.example.concesionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.concesionario.model.Coche;
import com.example.concesionario.repository.ICocheRepository;

@Service
public class CocheService {
    @Autowired
    private ICocheRepository cocheRepository;

    public List<Coche> listCoches(){
        return cocheRepository.findAll();
    }

    public void saveCoche(Coche coche){
        cocheRepository.save(coche);
    }
}
