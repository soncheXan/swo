package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.model.Album;

@Repository
public interface IAlbumRepo extends JpaRepository<Album, Long> {
    
}
