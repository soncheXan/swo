package com.example.concesionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.concesionario.model.Coche;

@Repository
public interface ICocheRepository extends JpaRepository<Coche, Long>{
}
