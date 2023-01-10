package com.example.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.model.Album;
import com.example.onetomany.repo.IAlbumRepo;

@Service
public class AlbumService {

    @Autowired
    private IAlbumRepo albumRepo;

    public Album saveAlbum(Album album){
        return albumRepo.save(album);
    }
}
