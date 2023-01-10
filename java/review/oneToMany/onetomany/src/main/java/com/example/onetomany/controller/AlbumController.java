package com.example.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.model.Album;
import com.example.onetomany.service.AlbumService;

@RestController
@RequestMapping("/api/album")
public class AlbumController {
    
    @Autowired
    private AlbumService albumService;

    @PostMapping("/save")   //  http://localhost:8080/api/album/save
    public Album save(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }
}
