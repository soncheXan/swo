package com.example.golisonas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.golisonas.model.Golisona;
import com.example.golisonas.service.GolisonaService;

@RestController
@RequestMapping("/golisoneria")
public class GolisonaController {

    @Autowired
    private GolisonaService golisonaService;

    @GetMapping("/color/{color}")
    public List<Golisona> color(@PathVariable String color){
        return golisonaService.searchColor(color);
    }

    @GetMapping("/dulzura/{dulzura}")
    public List<Golisona> dulzura(@PathVariable String dulzura){
        return golisonaService.searchDulzura(dulzura);
    }

    @GetMapping("/peso/{peso}")
    public List<Golisona> peso(@PathVariable Float peso){
        return golisonaService.searchPeso(peso);
    }

    @GetMapping("/picante/{picante}")
    public List<Golisona> picante(@PathVariable Boolean picante){
        return golisonaService.searchPicante(picante);
    }

    @GetMapping("/score/{score}")
    public List<Golisona> score(@PathVariable Float score){
        return golisonaService.searchScore(score);
    }
}
