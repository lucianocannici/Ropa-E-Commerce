package com.E_Commerce.Ropa.service;

import java.util.List;

import com.E_Commerce.Ropa.dto.UsuarioDto;

public interface UsuarioService {

    List<UsuarioDto> findAll();
    
    UsuarioDto save(UsuarioDto usuarioDto);

    UsuarioDto findById (Integer id);

    UsuarioDto delete (Integer id);

    UsuarioDto update (Integer id, UsuarioDto usuarioDto);

}
