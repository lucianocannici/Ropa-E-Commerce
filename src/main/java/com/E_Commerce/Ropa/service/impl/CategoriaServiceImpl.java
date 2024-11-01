package com.E_Commerce.Ropa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.E_Commerce.Ropa.dto.CategoriaDto; 
import com.E_Commerce.Ropa.entities.Categoria; 
import com.E_Commerce.Ropa.repository.CategoriaRepository; 
import com.E_Commerce.Ropa.service.CategoriaService;

import jakarta.persistence.EntityNotFoundException;
 
@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    CategoriaRepository categoriaRepository;

    //Constructor
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    //listar todos (GET?)
    @Override
    public List<Categoria> findAll() {
        List<Categoria> getList= categoriaRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return getList;
    }

    // guardar
    @Override
    public Categoria save(CategoriaDto categoriaDto) {
        
        Categoria categoria =  Categoria.builder() // antes con carlos: Pedido pedido1 = new Pedido(constructor), ahora con builder lo puedo escriir mas prolijo, asi:
                                        .id(categoriaDto.getId())
                                        .nombre(categoriaDto.getNombre()) 
                                        .build();
        return categoriaRepository.save(categoria);
        
    }

    //Buscar by ID
    @Override
    public CategoriaDto findById(Integer id) {

        Categoria categoria = categoriaRepository.findById(id).orElseThrow(null);
        CategoriaDto categoriaDto = CategoriaDto.builder()
                                                .id(categoria.getId())
                                                .nombre(categoria.getNombre())
                                                .build();
        return categoriaDto;
    }


    //Borrar by id
    @Override
    public CategoriaDto deleteById(Integer id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(null);
        CategoriaDto categoriaDto = CategoriaDto.builder()
                                                .id(categoria.getId())
                                                .nombre(categoria.getNombre())
                                                .build();
        categoriaRepository.deleteById(id);
        return categoriaDto;
    }

    //Actualizar
    @Override
    public Categoria update(Integer id, CategoriaDto categoriaDto) {
        
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(null);
        categoriaDto.setId(id);
        categoria = Categoria.builder()
                             .id(categoriaDto.getId()) 
                             .nombre(categoriaDto.getNombre())
                             .build();
        return categoriaRepository.save(categoria);

    }



}
