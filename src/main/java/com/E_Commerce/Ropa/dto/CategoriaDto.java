package com.E_Commerce.Ropa.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class CategoriaDto implements Serializable{
    private Integer id; //no uso int, no uso primitivos
    private String nombre;    
}
