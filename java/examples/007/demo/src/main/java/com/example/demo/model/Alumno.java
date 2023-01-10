package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "apellido_uno")
    private String apellidoUno;
    @Column(name = "apellido_dos")
    private String apellidoDos;
    private Float nota;

    public Alumno(){}

    public Alumno(Long id, String nombre, String apellidoUno, String apellidoDos, Float nota) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
    

}
