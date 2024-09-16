package com.zoologico.animales;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre() {
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }


    @Override
    public String comer() {
        return "El tigre come carne de búfalo";
    }

    @Override
    public String dormir() {
        return "El tigre duerme durante 16 horas";
    }

    @Override
    public String correr() {
        return "El tigre corre solo tras su presa";
    }

    @Override
    public String comunicarse() {
        return "El tigre ronronea";
    }

    @Override
    public String toString() {
        return
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", especieTigre='" + especieTigre + '\'' +
                ", velocidad=" + velocidad +
                ", tamanoGarras=" + tamanoGarras +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso;
    }
}
