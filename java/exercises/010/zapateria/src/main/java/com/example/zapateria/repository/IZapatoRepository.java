package com.example.zapateria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zapateria.model.Zapato;

@Repository
public interface IZapatoRepository extends JpaRepository<Zapato, Long>{
    
}
