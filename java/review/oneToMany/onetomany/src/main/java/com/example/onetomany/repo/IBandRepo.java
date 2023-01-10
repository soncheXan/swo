package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.model.Band;

@Repository
public interface IBandRepo extends JpaRepository<Band, Long> {
    
}
