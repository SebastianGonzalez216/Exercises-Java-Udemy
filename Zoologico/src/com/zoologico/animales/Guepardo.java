package com.zoologico.animales;

public class Guepardo extends Felino{

    public Guepardo() {
    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo come carne de gacela";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en lo alto de una duna";
    }

    @Override
    public String correr() {
        return "El guepardo corre más rapído que sus adversarios";
    }

    @Override
    public String comunicarse() {
        return "El guepardo gruñe";
    }

    @Override
    public String toString() {
        return
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", altura=" + altura +
                ", habitat='" + habitat + '\'' +
                ", velocidad=" + velocidad +
                ", tamanoGarras=" + tamanoGarras;
    }
}
