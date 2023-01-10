package com.example.golisonas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.golisonas.repository.IGolisonasRepository;

@Service
public class GolisonaService {
    
    @Autowired
    private IGolisonasRepository golisonasRepository;
    
    public void deleteGolisona(Long id){
        golisonasRepository.deleteById(id);
    }
}
