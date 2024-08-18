package com.E_Commerce.Ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.E_Commerce.Ropa.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
