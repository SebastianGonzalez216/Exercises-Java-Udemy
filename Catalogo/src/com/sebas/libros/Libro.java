package com.sebas.libros;

import com.sebas.productos.IProducto;
import com.sebas.productos.Producto;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro() {
    }

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio();
    }

    @Override
    public String toString() {
        return
                super.toString() + " Producto: Libro ---" +
                " fecha de publicación: " + fechaPublicacion +
                ", autor: " + autor + '\'' +
                ", titulo: " + titulo + '\'' +
                ", editorial: " + editorial;
    }
}

