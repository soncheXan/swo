package com.example.album.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.album.model.Album;
import com.example.album.model.Band;

@Repository
public interface IAlbumRepo extends JpaRepository<Album, Long>{
}
