package org.sebastian.java.jdbc.models;

import java.util.Date;

public class Producto {
    private long id;
    private String nombre;
    private int precio;
    private Date fechaRegistro;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(long id, String nombre, int precio, Date fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  id +
                " | " +
                nombre +
                " | " +
                 precio +
                " | " +
                fechaRegistro +
                " | " +
                categoria.getNombre();
    }
}
