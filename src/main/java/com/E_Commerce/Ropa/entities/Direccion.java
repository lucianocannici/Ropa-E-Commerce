package com.E_Commerce.Ropa.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "direccion")
public class Direccion {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// auto-increment
    @Column(unique= true, nullable=false)//siguiente dato es es unico y no puede estar vacio
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
