package com.sebas.patrones.abstractfactory.fabricas;

import com.sebas.patrones.abstractfactory.clases.GalletaChispas;
import com.sebas.patrones.abstractfactory.clases.GalletaRellena;
import com.sebas.patrones.abstractfactory.interfaces.Galleta;
import com.sebas.patrones.abstractfactory.interfaces.GalletaDulce;

public class FabricaGalletasRellenas implements GalletaDulce {
    @Override
    public Galleta crearGalleta() {
        Galleta galletaRellena = new GalletaRellena();
        System.out.println("---> Saliendo galleta rellena");
        return galletaRellena;
    }
}
