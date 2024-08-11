package com.E_Commerce.Ropa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 
import lombok.AllArgsConstructor; //se importaron las librerias de lombok pero igual no funciona, comprobar que funcione
import lombok.Data;
import lombok.NoArgsConstructor; 

@Data
@AllArgsConstructor
@NoArgsConstructor //aca no me toma error pero no me figura que funcione

@Entity //especifica la creacion de una entidad
@Table(name="Producto") //los obj de esta clase se guardan en la tabla Producto, si no existe se crea automaticamente
public class Producto {

    
    @Id //el siguiente campo ("id") es primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el siguiente campo ("id") es auto_incremental
    @Column(unique = true, nullable = false) // esto estaba en la clase de Carlos. En algunos videos lo ponen en cada campo. Aca hace falta?
    
    private Integer id; //no uso int, no uso primitivos
    private Integer idCategoria;
    private String nombre;
    private String talle;
    private String color;
    private String descripcion;
    private Integer stock;
    private double precio;
    private String imagen;

    //relacion muchos a uno, muchos productos pueden estar en una sola categoria
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria Categoria;

    //otra posibilidad es hacer uno a muchos desde la entidad categoria
    /*
     * @OneToMany
     * @JoinColumn(mappedBy="idCurso") o (name="idCurso") 
     * private List<Curso> cursos;
     */
    // lo malo de esto es que te hace mas lento, porque siempre esta creando listas 
    // ademas del otro lado siempre tiene que haber un ManyToOne
    

    /* 
     * Arti dice que 
     * instalen lombok tambien, asi se ahorran tener que meter los getters, setters, etc y que quede mucho codigo
     */

    /* comento todo lo de abajo para poder usar lombok 

    //Constructor vacio
    public Producto() {
    }

    //Constructor sin Id
    public Producto(Integer idCategoria, String nombre, String talle, String color, String descripcion, Integer stock,
            double precio, String imagen) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.talle = talle;
        this.color = color;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.imagen = imagen;
    }

    //Constructor completo
    public Producto(Integer id, Integer idCategoria, String nombre, String talle, String color, String descripcion,
            Integer stock, double precio, String imagen) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.talle = talle;
        this.color = color;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.imagen = imagen;
    }

    //To String
    @Override
    public String toString() {
        return "Producto [id=" + id + ", idCategoria=" + idCategoria + ", nombre=" + nombre + ", talle=" + talle
                + ", color=" + color + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio
                + ", imagen=" + imagen + "]";
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   
    */

 
}






