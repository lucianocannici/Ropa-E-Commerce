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

import com.E_Commerce.Ropa.dto.CategoriaDto;
import com.E_Commerce.Ropa.entities.Categoria;
import com.E_Commerce.Ropa.service.CategoriaService;


@RestController
@RequestMapping("/api/v1")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categoria")
    public ResponseEntity<List<Categoria>> get(){
        return new ResponseEntity<>(categoriaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/categoria")
    public ResponseEntity<Categoria> save(@RequestBody CategoriaDto categoriaDto){
        return new ResponseEntity<>(categoriaService.save(categoriaDto), HttpStatus.OK);
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id){
        CategoriaDto categoriaDto = categoriaService.findById(id);
        return new ResponseEntity<>(categoriaDto, HttpStatus.OK);
    }

    @DeleteMapping("/categoria/{id}")
    public ResponseEntity<CategoriaDto> delete(@PathVariable Integer id){
        return new ResponseEntity<>(categoriaService.deleteById(id), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/categoria/{id}")
    public ResponseEntity<Categoria> update(@PathVariable Integer id, @RequestBody CategoriaDto categoriaDto){
        return new ResponseEntity<>(categoriaService.update(id, categoriaDto), HttpStatus.OK);
    }
    
}
