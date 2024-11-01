package com.E_Commerce.Ropa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.E_Commerce.Ropa.dto.CategoriaDto; 
import com.E_Commerce.Ropa.entities.Categoria; 
 

public interface CategoriaService  {
 
    List<Categoria> findAll();
 
    Categoria save(CategoriaDto categoriaDto);
 
    CategoriaDto findById(Integer id);
    
    CategoriaDto deleteById(Integer id);
 
    Categoria update (Integer id, CategoriaDto categoriaDto);

}
 