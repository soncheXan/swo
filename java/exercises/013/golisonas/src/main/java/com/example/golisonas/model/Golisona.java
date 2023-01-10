package com.example.golisonas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "golisona")
public class Golisona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dulzura;
    private String color;
    private Float peso;
    private Boolean picante;
    private Float score;

    public Golisona(){};

    public Golisona(Long id, String dulzura, String color, Boolean picante, Float peso, Float score) {
        this.id = id;
        this.dulzura = dulzura;
        this.color = color;
        this.picante = picante;
        this.peso = peso;
        this.score = score;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDulzura() {
        return dulzura;
    }
    public void setDulzura(String dulzura) {
        this.dulzura = dulzura;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean getPicante() {
        return picante;
    }
    public void setPicante(Boolean picante) {
        this.picante = picante;
    }
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public Float getScore() {
        return score;
    }
    public void setScore(Float score) {
        this.score = score;
    }  
}
