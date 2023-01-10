package com.example.album.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.album.model.Album;
import com.example.album.model.Band;
import com.example.album.repo.IBandRepo;

@Service
public class BandService {
    @Autowired
    private IBandRepo bandRepo;

    public Band saveBand(Band band){
        return bandRepo.save(band);
    }

    public List<Band> bandsList(){
        return bandRepo.findAll();
    }

    public Band searchGroup(String bandName){
        return bandRepo.findByBandName(bandName);
    }
}
