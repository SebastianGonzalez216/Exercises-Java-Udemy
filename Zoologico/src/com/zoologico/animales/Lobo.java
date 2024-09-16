package com.zoologico.animales;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }


    public String getEspecieLobo() {
        return especieLobo;
    }


    @Override
    public String comer() {
        return "El lobo come carne de venado";
    }

    @Override
    public String dormir() {
        return "El lobo duerme durante el día";
    }

    @Override
    public String correr() {
        return "El lobo corre junto a su manada";
    }

    @Override
    public String comunicarse() {
        return "El lobo aulla";
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
                ", color='" + color + '\'' +
                ", especieLobo='" + especieLobo + '\'' +
                ", numCamada=" + numCamada;
    }
}
