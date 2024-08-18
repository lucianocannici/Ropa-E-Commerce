package com.E_Commerce.Ropa.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PedidoDto {
    private Integer id;
    private Integer idProducto;
    private Integer idCarrito;
    private Integer cantidad;
}
