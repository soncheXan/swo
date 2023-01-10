package com.example.golisonas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.golisonas.model.Golisona;
import com.example.golisonas.repository.IGolisonasRepository;

@Service
public class GolisonaService {
    
    @Autowired
    private IGolisonasRepository golisonasRepository;
    
    public List<Golisona> searchColor(String color){
        return golisonasRepository.findByColor(color);
    }

    public List<Golisona> searchDulzura(String dulzura){
        return golisonasRepository.findByDulzura(dulzura);
    }

    public List<Golisona> searchPeso(Float peso){
        return golisonasRepository.findByPeso(peso);
    }

    public List<Golisona> searchPicante(Boolean picante){
        return golisonasRepository.findByPicante(picante);
    }

    public List<Golisona> searchScore(Float score){
        return golisonasRepository.findByScore(score);
    }
}
