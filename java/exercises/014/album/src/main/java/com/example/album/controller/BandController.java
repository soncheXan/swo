package com.example.album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.album.model.Album;
import com.example.album.model.Band;
import com.example.album.service.BandService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/band")
public class BandController {

    @Autowired
    private BandService bandService;

    @PostMapping("/save")       //  http://localhost:8080/api/band/save
    public Band save(@RequestBody Band band){
        return bandService.saveBand(band);
    }

    @GetMapping("/list")        //  http://localhost:8080/api/band/list
    public List<Band> list(){
        return bandService.bandsList();
    }

    @GetMapping("/search/{bandName}")   //  http://localhost:8080/api/band/search/{bandName}
  public Band showBand(@PathVariable String bandName){
    return bandService.searchGroup(bandName);
  }
}
