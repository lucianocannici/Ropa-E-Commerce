package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.E_Commerce.Ropa.dto.UsuarioDto;
import com.E_Commerce.Ropa.entities.Usuario;
import com.E_Commerce.Ropa.repository.UsuarioRepository;
import com.E_Commerce.Ropa.service.UsuarioService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> getList = usuarioRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return getList;
    }

    @Override
    public Usuario save(UsuarioDto usuarioDto) {
        Usuario usuario = Usuario.builder()
                .id(usuarioDto.getId())
                .nombre(usuarioDto.getNombre())
                .apellido(usuarioDto.getApellido())
                .mail(usuarioDto.getMail())
                .password(usuarioDto.getPassword())
                .telefono(usuarioDto.getTelefono())
                .build();
        return usuarioRepository.save(usuario);

    }

    @Override
    public UsuarioDto findById(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(null);
        UsuarioDto usuarioDto = UsuarioDto.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .mail(usuario.getMail())
                .password(usuario.getPassword())
                .telefono(usuario.getTelefono())
                .build();
        return usuarioDto;
    }

    @Override
    public UsuarioDto deleteById(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(null);
        UsuarioDto usuarioDto = UsuarioDto.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .mail(usuario.getMail())
                .password(usuario.getPassword())
                .telefono(usuario.getTelefono())
                .build();
        usuarioRepository.deleteById(id);
        return usuarioDto;
    }

    @Override
    public Usuario update(Integer id, UsuarioDto usuarioDto) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(null);
        usuarioDto.setId(id);
        usuario = Usuario.builder()
                         .id(usuarioDto.getId())
                         .nombre(usuarioDto.getNombre())
                         .apellido(usuarioDto.getApellido())
                         .mail(usuarioDto.getMail())
                         .password(usuarioDto.getPassword())
                         .telefono(usuarioDto.getTelefono())
                         .build();
        return usuarioRepository.save(usuario);
    }

}
