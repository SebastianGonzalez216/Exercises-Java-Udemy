package com.zoologico.animales;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro() {
    }

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro come croquetas";
    }

    @Override
    public String dormir() {
        return "El perro duerme al lado de la chimenea";
    }

    @Override
    public String correr() {
        return "El perro corre por el jardín y persigue su cola";
    }

    @Override
    public String comunicarse() {
        return "El perro ladra";
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
                ", fuerzaMordida=" + fuerzaMordida;
    }
}
