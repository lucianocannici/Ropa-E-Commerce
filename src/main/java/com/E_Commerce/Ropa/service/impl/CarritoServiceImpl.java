package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import com.E_Commerce.Ropa.dto.CarritoDto;
import com.E_Commerce.Ropa.entities.Carrito;
import com.E_Commerce.Ropa.repository.CarritoRepository;
import com.E_Commerce.Ropa.service.CarritoService;

import jakarta.persistence.EntityNotFoundException;

public class CarritoServiceImpl implements CarritoService{

     CarritoRepository carritoRepository;

    public CarritoServiceImpl(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    @Override
    public List<Carrito> findAll() { //lista carritos
        List<Carrito> getList= carritoRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return null;
    }

    @Override
    public Carrito save(CarritoDto carritoDto) {// Guarda carrito
        Carrito carrito = Carrito.builder()
                            .id(carritoDto.getId())
                            .idDireccion(carritoDto.getIdDireccion())
                            .idUsuario(carritoDto.getIdUsuario())
                            .build();  

                            
        return carritoRepository.save(carrito);
    }


    @Override
    public CarritoDto findbyId(Integer id) { //Encuentra un carrito mediante id

        Carrito carrito = carritoRepository.findById(id).orElseThrow(null);
        CarritoDto carritoDto = CarritoDto.builder()
                                    .id(carrito.getId())
                                    .idDireccion(carrito.getIdDireccion())
                                    .idUsuario(carrito.getIdUsuario())
                                    .build();  

        return carritoDto;
    }


    @Override
    public CarritoDto deletebyId(Integer id) {// Borra carrito mediante Id
        Carrito carrito = carritoRepository.findById(id).orElseThrow(null);
        CarritoDto carritoDto = CarritoDto.builder()
                                    .id(carrito.getId())
                                    .idDireccion(carrito.getIdDireccion())
                                    .idUsuario(carrito.getIdUsuario())
                                    .build();  

        carritoRepository.deleteById(id);
        return carritoDto;
    }

        @Override
    public Carrito update(Integer id, CarritoDto carritoDto) { //Actualiza datos
         Carrito carrrito = carritoRepository.findById(id).orElseThrow(null);
        carritoDto.setId(id);
        carrrito = Carrito.builder()                       
                    .id(carritoDto.getId())
                    .idDireccion(carritoDto.getIdDireccion())
                    .idUsuario(carritoDto.getIdUsuario())
                    .build();  

        return carritoRepository.save(carrrito);
        
    } 
    
    
}
