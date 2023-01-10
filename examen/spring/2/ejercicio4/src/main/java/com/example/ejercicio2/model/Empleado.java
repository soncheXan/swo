package com.example.ejercicio2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double sueldo;
    private String email;

    // CONSTRUCTORS
    public Empleado() {
    }
    
    public Empleado(Long id, String nombre, Double sueldo, String email) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }

    //  GETTERS AND SETTERS
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
    public Double getSueldo() {
        return sueldo;
    }
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
