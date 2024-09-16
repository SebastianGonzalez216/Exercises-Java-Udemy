package com.carritosupermercado.productos;


import java.util.ArrayList;

public class BolsaSupermercado <T extends Producto>{

    private ArrayList<T> productos = new ArrayList<T>();

    public BolsaSupermercado() {
    }

    public void addProducto (T producto){

        if(productos.size() < 5) {
            productos.add(producto);
        }
        else{
            System.err.println("La bolsa esta llena");
        }
    }

    public ArrayList<T> getProductos() {
        return productos;
    }

}
