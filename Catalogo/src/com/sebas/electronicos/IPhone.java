package com.sebas.electronicos;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }

    @Override
    public String toString() {
        return
                super.toString() + " Producto: IPhone ---" +
                " modelo: " + modelo + '\'' +
                ", color: " + color;
    }


}
