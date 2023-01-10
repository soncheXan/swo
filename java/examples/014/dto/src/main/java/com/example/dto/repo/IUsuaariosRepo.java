package com.example.dto.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.model.Usuario;

@Repository
public interface IUsuaariosRepo extends JpaRepository<Usuario, Long>{
    List<Usuario> findByUsername(String username);
}
