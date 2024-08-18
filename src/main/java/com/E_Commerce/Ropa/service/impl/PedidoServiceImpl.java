package com.E_Commerce.Ropa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.E_Commerce.Ropa.dto.PedidoDto;
import com.E_Commerce.Ropa.entities.Pedido;
import com.E_Commerce.Ropa.repository.PedidoRepository;
import com.E_Commerce.Ropa.service.PedidoService;
@Service
public class PedidoServiceImpl implements PedidoService{
    
    PedidoRepository pedidoRepository;
    

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<PedidoDto> findAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public PedidoDto save(PedidoDto pedidoDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public PedidoDto findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public PedidoDto delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public PedidoDto update(Integer id, PedidoDto pedidoDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
