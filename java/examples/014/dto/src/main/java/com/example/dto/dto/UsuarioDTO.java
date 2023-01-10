package com.example.dto.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioDTO {
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private Integer telefono;
    @JsonIgnore
    private String email;
    private String direccion;

    
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public UsuarioDTO(Long id, String username, String password, Integer telefono, String email, String direccion) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public Integer getTelefono() {
        return telefono;
    }


    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDireccion() {
        return direccion;
    }


    public UsuarioDTO() {
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}