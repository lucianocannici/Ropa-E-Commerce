package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.E_Commerce.Ropa.dto.DireccionDto;
import com.E_Commerce.Ropa.entities.Direccion;
import com.E_Commerce.Ropa.repository.DireccionRepository;
import com.E_Commerce.Ropa.service.DireccionService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DireccionServiceImpl implements DireccionService {

    DireccionRepository direccionRepository;

    public DireccionServiceImpl(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    @Override
    public List<Direccion> findAll() {//Lista todas las direcciones
        List<Direccion> getList= direccionRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return null;
    }

    @Override
    public Direccion save(DireccionDto direccionDto) {//Guarda direccion
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
    public DireccionDto findById(Integer id) {// Para encontrar direccion mediante ID
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
    public DireccionDto deletebyId(Integer id) {// Borrar direccion Mediante ID
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

        direccionRepository.deleteById(id);
        return direccionDto;
    }
  
    @Override
    public Direccion update(Integer id, DireccionDto direccionDto) {// Actualiza datos
         Direccion direccion = direccionRepository.findById(id).orElseThrow(null);
        direccionDto.setId(id);
        direccion = Direccion.builder()                       
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

    
    
}
