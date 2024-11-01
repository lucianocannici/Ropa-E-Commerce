package com.E_Commerce.Ropa.service;

import java.util.List;

import com.E_Commerce.Ropa.dto.PedidoDto;
import com.E_Commerce.Ropa.entities.Pedido;

public interface PedidoService {

    List<Pedido> findAll();

    Pedido save(PedidoDto pedidoDto);

    PedidoDto findById(Integer id);

    PedidoDto deleteById(Integer id);

    Pedido update(Integer id, PedidoDto pedidoDto);
    
}
