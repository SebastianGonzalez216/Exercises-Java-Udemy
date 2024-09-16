package com.sebas.patrones.abstractfactory.fabricas;

import com.sebas.patrones.abstractfactory.clases.GalletaChispas;
import com.sebas.patrones.abstractfactory.interfaces.Galleta;
import com.sebas.patrones.abstractfactory.interfaces.GalletaDulce;

public class FabricaGalletasChispas implements GalletaDulce {
    @Override
    public Galleta crearGalleta() {
        Galleta galletaChispas = new GalletaChispas();
        System.out.println("---> Saliendo galleta de chispas");
        return galletaChispas;
    }
}
