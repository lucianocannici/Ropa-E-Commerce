package com.E_Commerce.Ropa.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class ProductoDto implements Serializable{
    private Integer id; //no uso int, no uso primitivos
    private Integer idCategoria;
    private String nombre;
    private String talle;
    private String color;
    private String descripcion;
    private Integer stock;
    private double precio;
    private String imagen;
}
