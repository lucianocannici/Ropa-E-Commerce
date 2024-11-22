package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.E_Commerce.Ropa.dto.PedidoDto;
import com.E_Commerce.Ropa.entities.Pedido;
import com.E_Commerce.Ropa.repository.PedidoRepository;
import com.E_Commerce.Ropa.service.PedidoService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PedidoServiceImpl implements PedidoService{
    
    PedidoRepository pedidoRepository;
    

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> findAll() {
        List <Pedido> getList = pedidoRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return getList;
    }

    @Override
    public Pedido save(PedidoDto pedidoDto) {
        
        Pedido pedido = Pedido.builder()                                // antes con carlos: Pedido pedido1 = new Pedido(constructor), ahora con builder lo puedo escriir mas prolijo, asi:
                              .id(pedidoDto.getId())
                              .idProducto(pedidoDto.getIdProducto())
                              .idCarrito(pedidoDto.getIdCarrito())
                              .cantidad(pedidoDto.getCantidad())
                              .build();
        return pedidoRepository.save(pedido);
        


    }

    @Override
    public PedidoDto findById(Integer id) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(null);
        PedidoDto pedidoDto = PedidoDto.builder()
                                       .id(pedido.getId())
                                       .idProducto(pedido.getIdProducto())
                                       .idCarrito(pedido.getIdCarrito())
                                       .cantidad(pedido.getCantidad())
                                       .build();
        return pedidoDto;
    }

    @Override
    public PedidoDto deleteById(Integer id) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(null);
        PedidoDto pedidoDto = PedidoDto.builder()
                                       .id(pedido.getId())
                                       .idProducto(pedido.getIdProducto())
                                       .idCarrito(pedido.getIdCarrito())
                                       .cantidad(pedido.getCantidad())
                                       .build();
        pedidoRepository.deleteById(id);
        
        return pedidoDto;
    }

    @Override
    public Pedido update(Integer id, PedidoDto pedidoDto) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(null);
        pedidoDto.setId(id);
        pedido = Pedido.builder()                       
                       .idProducto(pedidoDto.getIdProducto())
                       .idCarrito(pedidoDto.getIdCarrito())
                       .cantidad(pedidoDto.getCantidad())
                       .build();
        return pedidoRepository.save(pedido);

    }
    
}
