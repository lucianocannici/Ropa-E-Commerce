package com.E_Commerce.Ropa.controller;

import org.springframework.web.bind.annotation.RestController;

import com.E_Commerce.Ropa.dto.DireccionDto;
import com.E_Commerce.Ropa.entities.Direccion;
import com.E_Commerce.Ropa.service.DireccionService;



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
public class DirreccionController {
    
    private final DireccionService direccionService;
    
        public DirreccionController(DireccionService direccionService) {
            this.direccionService = direccionService;
    }
    
    @GetMapping("/direccion")
    public ResponseEntity<List<Direccion>> get(){
        return new ResponseEntity<>(direccionService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/direccion")
    public ResponseEntity<Direccion> save(@RequestBody DireccionDto direccionDto){
        return new ResponseEntity<>(direccionService.save(direccionDto), HttpStatus.OK);
    }

    @GetMapping("/direccion/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id){
        DireccionDto direccionDto = direccionService.findById(id);
        return new ResponseEntity<>(direccionDto, HttpStatus.OK);
    }

    @DeleteMapping("/direccion/{id}")
    public ResponseEntity<DireccionDto> delete(@PathVariable Integer id){
        return new ResponseEntity<>(direccionService.deletebyId(id), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/direccion/{id}")
    public ResponseEntity<Direccion> update(@PathVariable Integer id, @RequestBody DireccionDto direccionDto){
        return new ResponseEntity<>(direccionService.update(id, direccionDto), HttpStatus.OK);
    }
}
