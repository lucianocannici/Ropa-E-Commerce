package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import com.E_Commerce.Ropa.dto.DireccionDto;
import com.E_Commerce.Ropa.entities.Direccion;
import com.E_Commerce.Ropa.repository.DireccionRepository;
import com.E_Commerce.Ropa.service.DireccionService;

import jakarta.persistence.EntityNotFoundException;

public class DireccionServiceImpl implements DireccionService {

    DireccionRepository direccionRepository;

    public DireccionServiceImpl(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    @Override
    public DireccionDto deletebyId(Integer Id) {
        
        return null;
    }

    @Override
    public List<Direccion> findAll() {
        List<Direccion> getList= direccionRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return null;
    }

    @Override
    public DireccionDto findById(Integer id) {
        Direccion direccion = direccionRepository.findById(id).orElseThrow(null);
        DireccionDto direccionDto = DireccionDto.builder()
                                    .id(direccion.getId())
                                    .pais(direccion.getPais())
                                    .provincia(direccion.getProvincia())
                                    .localidad(direccion.getLocalidad())
                                    .calle(direccion.getCalle())
                                    .altura(direccion.getAltura())
                                    .piso(direccion.getPiso())
                                    .departamento(direccion.getDepartamento())
                                    .descripcion(direccion.getDescripcion())
                                    .build();
        return direccionDto;
    }

    @Override
    public Direccion save(DireccionDto direccionDto) {
        Direccion direccion = Direccion.builder()
                               .id(direccionDto.getId())
                               .pais(direccionDto.getPais())
                               .provincia(direccionDto.getProvincia())
                               .localidad(direccionDto.getLocalidad())
                               .calle(direccionDto.getCalle())
                               .altura(direccionDto.getAltura())
                               .piso(direccionDto.getPiso())
                               .departamento(direccionDto.getDepartamento())
                               .descripcion(direccionDto.getDescripcion())
                               .build();
                            
        return direccionRepository.save(direccion);
    }

    @Override
    public DireccionDto update(Integer Id, DireccionDto direccionDto) {
        
        return null;
    }

    
    
}
