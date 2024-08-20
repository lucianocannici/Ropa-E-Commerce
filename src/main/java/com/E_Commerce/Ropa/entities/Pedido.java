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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder // sirve para poder crear objetos de una manenera mas linda (antes Pedido pedido1 = new Pedido(constructor))
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable= false)
    private Integer id;
    @Column(name="idProducto")
    private Integer idProducto;
    @Column(name="idCarrito")
    private Integer idCarrito;
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="idProducto", insertable=false, updatable=false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name="idCarrito", insertable=false, updatable=false)
    private Carrito carrito; 
}
