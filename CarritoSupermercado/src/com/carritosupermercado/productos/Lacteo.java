package com.carritosupermercado.productos;

public class Lacteo extends Producto {
    private int cantidad;
    private int proteinas;

    public Lacteo(double precio, String nombre, int proteinas, int cantidad) {
        super(precio, nombre);
        this.proteinas = proteinas;
        this.cantidad = cantidad;
    }

    public Lacteo() {
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Proteinas: " + proteinas +  ", Cantidad: " + cantidad  + super.toString();
    }
}
