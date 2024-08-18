package com.E_Commerce.Ropa.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioDto {
    private Integer id;
    private Integer idDireccion;
    private Integer idUsuario;
    private LocalDateTime fecha;
    private double total;
}
