package com.E_Commerce.Ropa.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.E_Commerce.Ropa.dto.CarritoDto;
import com.E_Commerce.Ropa.entities.Carrito;


@Service
public interface CarritoService {

    List<Carrito> findAll(); 
    
    Carrito save(CarritoDto carritoDto);

    CarritoDto findbyId(Integer id);

    CarritoDto deletebyId(Integer id);

    Carrito update(Integer id, CarritoDto carritoDto);
}
