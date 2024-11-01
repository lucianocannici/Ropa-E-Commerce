package com.E_Commerce.Ropa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_Commerce.Ropa.dto.ProductoDto;
import com.E_Commerce.Ropa.entities.Producto;
import com.E_Commerce.Ropa.service.ProductoService;


@RestController
@RequestMapping("/api/v1")
public class ProductoController {

    private final ProductoService productoService;
    
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    
    @GetMapping("/producto")
    public ResponseEntity<List<Producto>> get(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }
    
    @PostMapping("/producto")
    public ResponseEntity<Producto> save(@RequestBody ProductoDto productoDto){
        return new ResponseEntity<>(productoService.save(productoDto), HttpStatus.OK);
    }

    @GetMapping("/producto/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id){
        ProductoDto productoDto = productoService.findById(id);
        return new ResponseEntity<>(productoDto, HttpStatus.OK);
    }

    @DeleteMapping("/producto/{id}")
    public ResponseEntity<ProductoDto> delete(@PathVariable Integer id){
        return new ResponseEntity<>(productoService.deleteById(id), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/producto/{id}")
    public ResponseEntity<Producto> update(@PathVariable Integer id, @RequestBody ProductoDto productoDto){
        return new ResponseEntity<>(productoService.update(id, productoDto), HttpStatus.OK);
    }
    
}
