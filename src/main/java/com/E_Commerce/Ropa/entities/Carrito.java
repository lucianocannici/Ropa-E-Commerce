package com.E_Commerce.Ropa.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carrito")
public class Carrito {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// auto-increment
    @Column(unique= true, nullable=false)//siguiente dato es unico y no puede estar vacio
    private Integer id;
    @Column(insertable=false, updatable=false)
    private Integer idDireccion;
    @Column(insertable=false, updatable=false)
    private Integer idUsuario;
    @Column(name = "fecha_Hora_PedidoConfirmado")
    private LocalDateTime fecha;
    private double total;

    @ManyToOne
    @JoinColumn(name = "idDireccion")
    Direccion direccion;
    
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    Usuario usuario;


}
