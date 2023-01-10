package com.example.zapateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.zapateria.service.ZapatoService;

@Controller
@RequestMapping("/zapateria")
public class ZapatoController {

    @Autowired 
    private ZapatoService zapatoService;

    @GetMapping("search/{id}")
    public String searchId(@PathVariable Long id, Model model){
        model.addAttribute( "zapato", zapatoService.searchZapato(id));
        return "zapato";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("zapatos", zapatoService.listZapatos());
        return "zapatos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Long id){
        zapatoService.deleteZapato(id);
        return "redirect:/zapateria/list";
    }
}
