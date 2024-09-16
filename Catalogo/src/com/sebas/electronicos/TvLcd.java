package com.sebas.electronicos;

public class TvLcd extends Electronico{
private int pulgada;


    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }

    @Override
    public String toString() {
        return
                super.toString() + " Producto: TvLcd ---" +
                " pulgadas:" + pulgada;
    }
}
