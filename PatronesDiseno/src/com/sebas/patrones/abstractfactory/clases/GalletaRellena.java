package com.sebas.patrones.abstractfactory.clases;

import com.sebas.patrones.abstractfactory.interfaces.Galleta;

public class GalletaRellena implements Galleta {

    String tipoGalleta = "rellena";

    public GalletaRellena() {
    }

    @Override
    public void prepararMasa() {
        System.out.println("Preparando masa para galleta de " + tipoGalleta+"...");
    }

    @Override
    public void formarGalleta() {
        System.out.println("Formando galleta de " + tipoGalleta+"...");
    }

    @Override
    public void hornearGalleta() {
        System.out.println("Horneando galleta de " + tipoGalleta+"...");
    }
}
