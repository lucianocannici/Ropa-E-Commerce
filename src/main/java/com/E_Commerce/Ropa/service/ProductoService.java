package com.E_Commerce.Ropa.service;

import java.util.List; 
 
import org.springframework.stereotype.Service;
 
import com.E_Commerce.Ropa.dto.ProductoDto; 
import com.E_Commerce.Ropa.entities.Producto;

@Service
public interface ProductoService {
 
    List<Producto> findAll();
 
    Producto save(ProductoDto productoDto);
 
    ProductoDto findById(Integer id);
    
    ProductoDto deleteById(Integer id);
 
    Producto update (Integer id, ProductoDto productoDto);
 
}
