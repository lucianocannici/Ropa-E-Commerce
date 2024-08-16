package com.E_Commerce.Ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_Commerce.Ropa.entities.Carrito;
@Repository
public interface CarritoRepository extends JpaRepository <Carrito, Integer>{
    
}
