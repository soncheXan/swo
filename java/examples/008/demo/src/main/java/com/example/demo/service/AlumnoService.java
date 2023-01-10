package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Alumno;
import com.example.demo.repository.IAlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    private IAlumnoRepository alumnoRepository;

    public Alumno buscarAlumno(Long id){
        return alumnoRepository.findById(id).orElse(null);
    }

    public void guardarAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }
}
