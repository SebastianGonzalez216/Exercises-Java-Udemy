package com.zoologico.animales;

public class Leon extends Felino{
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon() {
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }


    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }


    @Override
    public String comer() {
        return "El león come carne de cebra";
    }

    @Override
    public String dormir() {
        return "El león duerme durante 20 horas";
    }

    @Override
    public String correr() {
        return "El león corre a 70 kmph";
    }

    @Override
    public String comunicarse() {
        return "El león ruge";
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
                ", tamanoGarras=" + tamanoGarras +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                ", numManada=" + numManada;
    }
}
