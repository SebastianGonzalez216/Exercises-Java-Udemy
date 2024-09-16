package com.sebas.productos;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto() {
    }

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto ---> " +
                " precio: $" + precio;
    }
}
