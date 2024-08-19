package com.E_Commerce.Ropa.service;

import java.util.List;

import com.E_Commerce.Ropa.dto.UsuarioDto;
import com.E_Commerce.Ropa.entities.Usuario;

public interface UsuarioService {

    List<Usuario> findAll();
    
    Usuario save(UsuarioDto usuarioDto);

    UsuarioDto findById (Integer id);

    UsuarioDto deleteById (Integer id);

    Usuario update (Integer id, UsuarioDto usuarioDto);

}
