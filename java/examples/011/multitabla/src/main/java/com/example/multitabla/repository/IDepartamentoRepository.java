package com.example.multitabla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.multitabla.model.Departamento;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Long>{
    
}
