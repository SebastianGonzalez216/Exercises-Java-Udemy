package com.sebas.electronicos;

import com.sebas.productos.Producto;

public abstract class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(String fabricante) {
    }

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return
                super.toString() + " Cat: Electronico ---" +
                " fabricante:" + fabricante;
    }
}
