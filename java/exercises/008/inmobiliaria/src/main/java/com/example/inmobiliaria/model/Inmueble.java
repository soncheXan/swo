package com.example.inmobiliaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inmuebles")
public class Inmueble {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "metros_cuadrados")
    private Float metrosCuadrados;
    private Float precio;

    public Inmueble(){}

    public Inmueble(Long id, Float metrosCuadrados, Float precio) {
        this.id = id;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }   
}
