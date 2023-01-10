package com.example.ejercicio2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio2.model.Empleado;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>{
    Empleado findByEmail(String email);
}
