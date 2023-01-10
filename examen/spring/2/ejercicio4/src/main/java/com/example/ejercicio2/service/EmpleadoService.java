package com.example.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio2.model.Empleado;
import com.example.ejercicio2.repository.IEmpleadoRepository;



@Service
public class EmpleadoService {
    
    @Autowired
    private IEmpleadoRepository empleadoRepository;

    public List<Empleado> showAll(){
        return empleadoRepository.findAll();
    }

    public Empleado verEmpleadopPorId(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleado verEmpleadoPorEmail(String email){
        return empleadoRepository.findByEmail(email);
    }
}
