package com.zoologico.animales;

public abstract class Canino extends Mamifero{
    protected String color;
    protected float tamanoColmillos;

    public Canino() {
    }

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", altura=" + altura +
                ", habitat='" + habitat + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", color='" + color + '\'' + super.toString();
    }
}
