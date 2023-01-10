package com.example.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.dto.dto.UsuarioDTO;
import com.example.dto.model.Usuario;

@Component
public class UsuarioConverter {

    public UsuarioDTO convertEntityToDTO(Usuario usuario){

        ModelMapper modelMapper = new ModelMapper();

        UsuarioDTO usuarioDTO = modelMapper.map(usuario, UsuarioDTO.class);

        // UsuarioDTO usuarioDTO = new UsuarioDTO();

        // usuarioDTO.setId(usuario.getId());
        // usuarioDTO.setUsername(usuario.getUsername());
        // usuarioDTO.setPhone(usuario.getTelefono());
        return usuarioDTO;
    }
}
