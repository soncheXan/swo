package com.example.album.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.album.model.Album;
import com.example.album.model.Band;
import com.example.album.repo.IAlbumRepo;

@Service
public class AlbumService {
    @Autowired
    private IAlbumRepo albumRepo;

    public Album saveAlbum(Album album){
        return albumRepo.save(album);
    }

    public void deleteAlbum(Long id){
        return albumRepo.deleteById(id);
    }
}
