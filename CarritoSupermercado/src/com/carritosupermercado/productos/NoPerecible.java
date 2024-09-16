package com.carritosupermercado.productos;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible(double precio, String nombre, int calorias, int contenido) {
        super(precio, nombre);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public NoPerecible() {
    }

    public int getCalorias() {
        return calorias;
    }

    public int getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "No perecible: " + ", Contenido: " + contenido + ", Calorias: " + calorias + super.toString();
    }
}
