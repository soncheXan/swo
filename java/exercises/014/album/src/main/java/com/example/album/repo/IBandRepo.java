package com.example.album.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.album.model.Band;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Repository
public interface IBandRepo extends  JpaRepository<Band, Long> {
    Band findByBandName(String bandName);
}
