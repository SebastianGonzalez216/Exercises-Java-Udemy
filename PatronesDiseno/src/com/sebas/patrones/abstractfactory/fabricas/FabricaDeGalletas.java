package com.sebas.patrones.abstractfactory.fabricas;

import com.sebas.patrones.abstractfactory.interfaces.Galleta;
import com.sebas.patrones.abstractfactory.interfaces.GalletaDulce;

public class FabricaDeGalletas {

    public static void crearFabricaDeGalletas(GalletaDulce fabrica){
        Galleta galleta = fabrica.crearGalleta();
        galleta.prepararMasa();
        galleta.formarGalleta();
        galleta.hornearGalleta();
    }
}
