package com.E_Commerce.Ropa.service;

import java.util.List;

import com.E_Commerce.Ropa.dto.DireccionDto;
import com.E_Commerce.Ropa.entities.Direccion;

public interface DireccionService {

    List<Direccion> findAll();

    Direccion save(DireccionDto direccionDto);

    DireccionDto findById(Integer id);
    
    DireccionDto deletebyId(Integer id);

    Direccion update(Integer id, DireccionDto direccionDto);
}
