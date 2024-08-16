package com.E_Commerce.Ropa.entities;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable= false)
    private int id;
    @Column(name="idProducto")
    private int idProducto;
    @Column(name="idCarrito")
    private int idCarrito;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name="idProducto", insertable=false, updatable=false)
    private Proucto producto;

    @ManyToOne
    @JoinColumn(name="idCarrito", insertable=false, updatable=false)
    private Carrito carrito; 
}
