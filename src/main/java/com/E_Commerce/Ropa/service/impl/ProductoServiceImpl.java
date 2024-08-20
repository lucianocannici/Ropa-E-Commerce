package com.E_Commerce.Ropa.service.impl;
 
import java.util.List;
 
import com.E_Commerce.Ropa.dto.ProductoDto; 
import com.E_Commerce.Ropa.entities.Producto; 
import com.E_Commerce.Ropa.repository.ProductoRepository;
import com.E_Commerce.Ropa.service.ProductoService;

import jakarta.persistence.EntityNotFoundException;

public class ProductoServiceImpl implements ProductoService{
    
    ProductoRepository productoRepository;

    //Constructor
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    //listar todos (GET?)
    @Override
    public List<Producto> findAll() {
        List<Producto> getList= productoRepository.findAll();
        if (getList == null || getList.isEmpty()) {
            throw new EntityNotFoundException("No hay datos para mostrar!");
        }
        return getList;
    }

    //guardar
    @Override
    public Producto save(ProductoDto productoDto) {

        Producto producto =  Producto.builder() // antes con carlos: Pedido pedido1 = new Pedido(constructor), ahora con builder lo puedo escriir mas prolijo, asi:
                                     .id(productoDto.getId()) 
                                     .idCategoria(productoDto.getIdCategoria())
                                     .nombre(productoDto.getNombre())
                                     .talle(productoDto.getTalle())
                                     .color(productoDto.getColor())
                                     .descripcion(productoDto.getDescripcion())
                                     .stock(productoDto.getStock())
                                     .precio(productoDto.getPrecio())
                                     .imagen(productoDto.getImagen())
                                     .build();
        return productoRepository.save(producto);
 
    }

    //buscar por id
    @Override
    public ProductoDto findById(Integer id) {

        Producto producto = productoRepository.findById(id).orElseThrow(null);
        ProductoDto productoDto = ProductoDto.builder()
                                             .id(producto.getId()) 
                                             .idCategoria(producto.getIdCategoria())
                                             .nombre(producto.getNombre())
                                             .talle(producto.getTalle())
                                             .color(producto.getColor())
                                             .descripcion(producto.getDescripcion())
                                             .stock(producto.getStock())
                                             .precio(producto.getPrecio())
                                             .imagen(producto.getImagen())
                                             .build();
        return productoDto;

    }

    //borrar por id
    @Override
    public ProductoDto deleteById(Integer id) {

        Producto producto = productoRepository.findById(id).orElseThrow(null);
        ProductoDto productoDto = ProductoDto.builder()
                                             .id(producto.getId()) 
                                             .idCategoria(producto.getIdCategoria())
                                             .nombre(producto.getNombre())
                                             .talle(producto.getTalle())
                                             .color(producto.getColor())
                                             .descripcion(producto.getDescripcion())
                                             .stock(producto.getStock())
                                             .precio(producto.getPrecio())
                                             .imagen(producto.getImagen())
                                             .build();
        productoRepository.deleteById(id);
        return productoDto;
    }

    //modificar
    @Override
    public Producto update(Integer id, ProductoDto productoDto) {
        Producto producto = productoRepository.findById(id).orElseThrow(null);
        productoDto.setId(id);
        producto =  Producto.builder()
                            .id(productoDto.getId()) 
                            .idCategoria(productoDto.getIdCategoria())
                            .nombre(productoDto.getNombre())
                            .talle(productoDto.getTalle())
                            .color(productoDto.getColor())
                            .descripcion(productoDto.getDescripcion())
                            .stock(productoDto.getStock())
                            .precio(productoDto.getPrecio())
                            .imagen(productoDto.getImagen())
                            .build();
        return productoRepository.save(producto);
    }
 
}
