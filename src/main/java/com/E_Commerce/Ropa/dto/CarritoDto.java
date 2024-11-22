package com.E_Commerce.Ropa.dto;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class CarritoDto implements Serializable {
    
    private Integer id;
    private Integer idDireccion;
    private Integer idUsuario;
    private LocalDateTime fecha;
    private double total;
}
