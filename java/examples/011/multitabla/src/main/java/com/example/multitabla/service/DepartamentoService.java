package com.example.multitabla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.multitabla.model.Departamento;
import com.example.multitabla.repository.IDepartamentoRepository;


@Service
public class DepartamentoService {
    @Autowired
    private IDepartamentoRepository departamentoRepository;

    public List<Departamento> listaDepartamentos(){
        return departamentoRepository.findAll();
    }
}
