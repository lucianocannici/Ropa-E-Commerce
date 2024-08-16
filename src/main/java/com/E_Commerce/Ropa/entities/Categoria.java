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
@NoArgsConstructor //aca no me toma error pero no me figura que funcione, comprobar que funcione

@Entity //especifica la creacion de una entidad
@Table(name="Categoria") //los obj de esta clase se guardan en la tabla Categoria, si no existe se crea automaticamente
public class Categoria {
    @Id //el siguiente campo ("id") es primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el siguiente campo ("id") es auto_incremental
    @Column(unique = true, nullable = false) // esto estaba en la clase de Carlos. En algunos videos lo ponen en cada campo    
    private Integer id; //no uso int, no uso primitivos
    private String nombre;


    /* 
     * Arti dice que 
     * instalen lombok tambien, asi se ahorran tener que meter los getters, setters, etc y que quede mucho codigo
    */

    /* 
    lo comentamos porque lo vamos a poner con longbord

    //Constructor Vacio
    public Categoria() {
    }

    //Constructor sin Id
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    //Constructor Completo
    public Categoria(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //To String
    @Override
    public String toString() {
        return "categoria [id=" + id + ", nombre=" + nombre + "]";
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    */

 
 
}
