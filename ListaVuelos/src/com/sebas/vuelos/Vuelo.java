package com.sebas.vuelos;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechayhora;
    private int numPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechayhora, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechayhora = fechayhora;
        this.numPasajeros = numPasajeros;
    }

    public Vuelo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(Date fechayhora) {
        this.fechayhora = fechayhora;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "VUELO === [" +
                " Nombre: " + nombre + '\'' +
                ", Origen: " + origen + '\'' +
                ", Destino: " + destino + '\'' +
                ", Fecha y hora de llegada: " + fechayhora +
                ", Número de pasajeros: " + numPasajeros +
                ']';
    }
}
