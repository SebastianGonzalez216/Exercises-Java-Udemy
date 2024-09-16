package com.sebas.patrones.singleton;

public class ConexionBD {
    private static ConexionBD conexion;

    private ConexionBD() {
        System.out.println("Conectando con la base de datos...");
        final int idConexion = 1;
    }

    public static ConexionBD getInstance() {
        if (conexion == null) {
            conexion = new ConexionBD();
        }
        return conexion;
    }


}
