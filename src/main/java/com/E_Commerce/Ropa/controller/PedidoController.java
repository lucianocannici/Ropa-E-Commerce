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

import com.E_Commerce.Ropa.dto.PedidoDto;
import com.E_Commerce.Ropa.entities.Pedido;
import com.E_Commerce.Ropa.service.PedidoService;

@RestController
@RequestMapping("api/v1")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
    
    @GetMapping("/pedido")
    public ResponseEntity<List<Pedido>> get(){
        return new ResponseEntity<>(pedidoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> save(@RequestBody PedidoDto pedidoDto){
        return new ResponseEntity<>(pedidoService.save(pedidoDto), HttpStatus.OK);
    }

    @GetMapping("/pedido/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id){
        PedidoDto pedidoDto = pedidoService.findById(id);
        return new ResponseEntity<>(pedidoDto, HttpStatus.OK);
    }

    @DeleteMapping("/pedido/{id}")
    public ResponseEntity<PedidoDto> delete(@PathVariable Integer id){
        return new ResponseEntity<>(pedidoService.deleteById(id), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/pedido/{id}")
    public ResponseEntity<Pedido> update(@PathVariable Integer id, @RequestBody PedidoDto pedidoDto){
        return new ResponseEntity<>(pedidoService.update(id, pedidoDto), HttpStatus.OK);
    }
}
