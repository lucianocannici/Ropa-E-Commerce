package com.E_Commerce.Ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.E_Commerce.Ropa.entities.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
    
}
