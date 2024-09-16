package com.carritosupermercado.productos;

public class Fruta extends Producto {
    private double peso;
    private String color;

    public Fruta(double precio, String nombre, String color, double peso) {
        super(precio, nombre);
        this.color = color;
        this.peso = peso;
    }

    public Fruta() {
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Peso: " + peso + ", Color: " + color  + super.toString();
    }
}
