package com.example.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empresa.model.Departamento;
import com.example.empresa.repo.IDepartamentoRepo;

@Service
public class DepartamentoService {
    
    @Autowired
    private IDepartamentoRepo departamentoRepo;

    public Departamento guardarDepartamento(Departamento departamento){
        return departamentoRepo.save(departamento);
    }

    public List<Departamento> listarDepartamentos(){
        return departamentoRepo.findAll();
    }
}
