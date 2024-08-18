package com.E_Commerce.Ropa.service;

import java.util.List;

import com.E_Commerce.Ropa.dto.PedidoDto;

public interface PedidoService {

    List<PedidoDto> findAll();

    PedidoDto save(PedidoDto pedidoDto);

    PedidoDto findById(Integer id);

    PedidoDto delete(Integer id);

    PedidoDto update (Integer id, PedidoDto pedidoDto);
    
}
