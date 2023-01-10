package com.example.ejercicio3.service;

import java.util.List;

import com.example.ejercicio3.models.Alumno;

public class Promedio {
    
    public float calcularPromedio(List<Alumno> alumnos){
        float nota1 = alumnos.get(0).getNota();
        float nota2 = alumnos.get(1).getNota();
        float nota3 = alumnos.get(2).getNota();
        float promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;
    }
}
