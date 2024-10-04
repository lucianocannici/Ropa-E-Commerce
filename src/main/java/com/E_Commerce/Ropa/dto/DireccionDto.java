package com.E_Commerce.Ropa.dto;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder

public class DireccionDto implements Serializable {
    private Integer id;
    private String pais;
    private String provincia;
    private String localidad;
    private String calle;
    private String altura;
    private String piso;
    private String departamento;
    private String descripcion; 
}
