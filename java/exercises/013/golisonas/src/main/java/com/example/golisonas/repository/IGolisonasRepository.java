package com.example.golisonas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.golisonas.model.Golisona;

@Repository
public interface IGolisonasRepository extends JpaRepository<Golisona, Long>{
    List<Golisona> findByColor(String color);
    List<Golisona> findByDulzura(String dulzura);
    List<Golisona> findByPeso(Float peso);
    List<Golisona> findByPicante(Boolean picante);
    List<Golisona> findByScore(Float score);
}
