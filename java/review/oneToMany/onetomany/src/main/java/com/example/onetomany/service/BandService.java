package com.example.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.model.Band;
import com.example.onetomany.repo.IBandRepo;

@Service
public class BandService {
    
    @Autowired
    private IBandRepo bandRepo;

    public Band savBand(Band band){
        return bandRepo.save(band);
    }
}
