package com.sebas.libros;

import java.util.Date;

public class Comic extends Libro {
    private String personaje;

    public Comic() {
    }

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio();
    }

    @Override
    public String toString() {
        return
                super.toString() +" Cat: Comic ---" +
                " personaje:" + personaje;
    }
}
