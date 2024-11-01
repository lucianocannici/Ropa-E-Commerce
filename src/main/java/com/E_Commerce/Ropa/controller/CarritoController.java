package com.E_Commerce.Ropa.controller;

import org.springframework.web.bind.annotation.RestController;

import com.E_Commerce.Ropa.dto.CarritoDto;
import com.E_Commerce.Ropa.entities.Carrito;
import com.E_Commerce.Ropa.service.CarritoService;



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



@RestController
@RequestMapping("/api/v1")
public class CarritoController {
    
    private final  CarritoService  carritoService;
    
        public CarritoController( CarritoService  carritoService) {
            this. carritoService =  carritoService;
    }
    
    @GetMapping("/ carrito")
    public ResponseEntity<List< Carrito>> get(){
        return new ResponseEntity<>( carritoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/ carrito")
    public ResponseEntity< Carrito> save(@RequestBody  CarritoDto  carritoDto){
        return new ResponseEntity<>( carritoService.save( carritoDto), HttpStatus.OK);
    }

    @GetMapping("/ carrito/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id){
         CarritoDto  carritoDto =  carritoService.findbyId(id);
        return new ResponseEntity<>( carritoDto, HttpStatus.OK);
    }

    @DeleteMapping("/ carrito/{id}")
    public ResponseEntity< CarritoDto> delete(@PathVariable Integer id){
        return new ResponseEntity<>( carritoService.deletebyId(id), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/ carrito/{id}")
    public ResponseEntity< Carrito> update(@PathVariable Integer id, @RequestBody  CarritoDto  carritoDto){
        return new ResponseEntity<>( carritoService.update(id,  carritoDto), HttpStatus.OK);
    }
}
