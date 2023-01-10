package com.example.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nba.model.Jugador;

@Repository
public interface IJugadorRepository extends JpaRepository<Jugador, Long>{}