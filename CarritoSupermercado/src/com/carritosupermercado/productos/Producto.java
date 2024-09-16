package com.carritosupermercado.productos;

public class Producto {
    protected String nombre;
    protected double precio;



    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  ", Nombre: " + nombre + ", Precio: " + precio;
    }
}
