package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Alumno;
import com.example.demo.repository.IAlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    private IAlumnoRepository alumnoRepository;

    public List<Alumno> listAlumnos(){
        return alumnoRepository.findAll();   
    }

    public void deleteAlumno(Long id){
        alumnoRepository.deleteById(id);
    }
    
    public void saveAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }
}
