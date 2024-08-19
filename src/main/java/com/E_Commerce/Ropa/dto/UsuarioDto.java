package com.E_Commerce.Ropa.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class UsuarioDto implements Serializable {
    private Integer id;
    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private String telefono;
}
