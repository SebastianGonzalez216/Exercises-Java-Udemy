package com.carritosupermercado.productos;

public class Limpieza extends Producto{
    private String componentes;
    private double litros;



    public Limpieza(double precio, String nombre, String componentes, double litros) {
        super(precio, nombre);
        this.componentes = componentes;
        this.litros = litros;
    }

    public Limpieza() {
    }

    public double getLitros() {
        return litros;
    }

    public String getComponentes() {
        return componentes;
    }

    @Override
    public String toString() {
        return "Componentes: " + componentes + ", Litros: " + litros + super.toString();
    }
}
