package com.example.golisonas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.golisonas.service.GolisonaService;

@RestController
@RequestMapping("/golisoneria")
public class GolisonaController {

    @Autowired
    private GolisonaService golisonaService;

    @DeleteMapping("/{id}")     //  http://localhost:8080/golisoneria/1
    public void delete(@PathVariable Long id){
        golisonaService.deleteGolisona(id);
    }
}
