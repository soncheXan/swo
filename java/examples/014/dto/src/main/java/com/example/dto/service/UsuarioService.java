package com.example.dto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.converter.UsuarioConverter;
import com.example.dto.dto.UsuarioDTO;
import com.example.dto.model.Usuario;
import com.example.dto.repo.IUsuaariosRepo;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioConverter usuarioConverter;
    @Autowired
    private IUsuaariosRepo usuarioRepo;

    public List<Usuario> listaUsuarios(){
        return usuarioRepo.findAll();
    }

    public List<UsuarioDTO> listaDTO(){
        List<Usuario> usuarios = usuarioRepo.findAll();
        List<UsuarioDTO> usuariosDTO = new ArrayList<>();
        for(Usuario usuario: usuarios){
            usuariosDTO.add(usuarioConverter.convertEntityToDTO(usuario));
        }
        return usuariosDTO;
    }

    public void eliminarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }

    public UsuarioDTO guardarUsuario(Usuario usuario){
        Usuario userSaved = usuarioRepo.save(usuario);
        return usuarioConverter.convertEntityToDTO(userSaved);
    }

    public UsuarioDTO buscarUsuario(Long id){
        Usuario userSaved = usuarioRepo.findById(id).orElse(null);

        return usuarioConverter.convertEntityToDTO(userSaved);
    }

    public  List<UsuarioDTO> buscarUsuarioNombre(String name){
        List <Usuario> usersSaved = usuarioRepo.findByUsername(name);

        List<UsuarioDTO> usuariosDTO = new ArrayList<>();

        for(Usuario usuarioEncontrado: usersSaved){
            usuariosDTO.add(usuarioConverter.convertEntityToDTO(usuarioEncontrado));
        }

        return usuariosDTO;
    }

    List<>
}
