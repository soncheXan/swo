package com.example.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.model.Band;
import com.example.onetomany.service.BandService;

@RestController
@RequestMapping("/api/band")
public class BandController {
    
    @Autowired
    private BandService bandService;

    @PostMapping("/save")   //  http://localhost:8080/api/band/save
    public Band save(@RequestBody Band band){
        return bandService.savBand(band);
    }
}
