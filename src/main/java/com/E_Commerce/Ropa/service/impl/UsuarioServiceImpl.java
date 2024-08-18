package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import com.E_Commerce.Ropa.dto.UsuarioDto;
import com.E_Commerce.Ropa.repository.UsuarioRepository;
import com.E_Commerce.Ropa.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
    
    UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public UsuarioDto save(UsuarioDto usuarioDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public UsuarioDto findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public UsuarioDto delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public UsuarioDto update(Integer id, UsuarioDto usuarioDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
