package com.example.golisonas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.golisonas.model.Golisona;

@Repository
public interface IGolisonasRepository extends JpaRepository<Golisona, Long>{
    
}
