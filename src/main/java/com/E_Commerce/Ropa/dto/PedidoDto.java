package com.E_Commerce.Ropa.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class PedidoDto implements Serializable{
    private Integer id;
    private Integer idProducto;
    private Integer idCarrito;
    private Integer cantidad;
}
