package com.example.inmobiliaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inmobiliaria.model.Inmueble;

@Repository
public interface IInmuebleRepository extends JpaRepository<Inmueble,Long>{}
