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

import com.E_Commerce.Ropa.dto.UsuarioDto;
import com.E_Commerce.Ropa.entities.Usuario;
import com.E_Commerce.Ropa.service.UsuarioService;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario")
    public ResponseEntity<List<Usuario>> get(){
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> save(@RequestBody UsuarioDto usuarioDto){
        return new ResponseEntity<>(usuarioService.save(usuarioDto), HttpStatus.OK);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id){
        UsuarioDto usuarioDto = usuarioService.findById(id);
        return new ResponseEntity<>(usuarioDto, HttpStatus.OK);
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<UsuarioDto> delete(@PathVariable Integer id){
        return new ResponseEntity<>(usuarioService.deleteById(id), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/usuario/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody UsuarioDto usuarioDto){
        return new ResponseEntity<>(usuarioService.update(id, usuarioDto), HttpStatus.OK);
    }
}
