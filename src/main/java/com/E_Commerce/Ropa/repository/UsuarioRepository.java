package com.E_Commerce.Ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.E_Commerce.Ropa.entities.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
    
}
