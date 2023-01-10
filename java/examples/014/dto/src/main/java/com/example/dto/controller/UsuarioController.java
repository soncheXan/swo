package com.example.dto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.dto.UsuarioDTO;
import com.example.dto.model.Usuario;
import com.example.dto.service.UsuarioService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/list")    //http://localhost:8080/api/usuario/list
    public List<Usuario> list(){
        return usuarioService.listaUsuarios();
    }

    @GetMapping("/list-dto")    //http://localhost:8080/api/usuario/list-dto
    public List<UsuarioDTO> listdto(){
        return usuarioService.listaDTO();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }

    @PostMapping("/save")   //http://localhost:8080/api/usuario/save
    public UsuarioDTO save(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping("/{id}")    //http://localhost:8080/api/usuario/id
    public UsuarioDTO show(@PathVariable Long id){
    return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/by-username/{username}")  //http://localhost:8080/api/usuario/by-username/pedrin
    public List<UsuarioDTO> showByUsername(@PathVariable String username){
        return usuarioService.buscarUsuarioNombre(username);
    }
}


