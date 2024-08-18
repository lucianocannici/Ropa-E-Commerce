package com.E_Commerce.Ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_Commerce.Ropa.entities.Pedido;
@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
    
}
