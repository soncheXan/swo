package com.example.album.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.album.model.Album;
import com.example.album.service.AlbumService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/save")   //  http://localhost:8080/api/album/save
    public Album save(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @DeleteMappping("delete/{id}")
    public void delete(@RequestBody Long id){
        albumService.deleteAlbum(id);
    }
}
