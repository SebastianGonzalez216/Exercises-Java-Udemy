package com.sebas.calcularedad;

import java.time.LocalDate;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("----- BIENVENIDO ------");

        try {
            System.out.println("Ingresa tu fecha de nacimiento (formato estándar yyyy-MM-dd):");
            String fechaNacString = entrada.next();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacString);
            LocalDate fechaActual = LocalDate.now();
            System.out.println("La fecha actual es: " + fechaActual);
            System.out.println("Tu fecha de nacimiento ingresada es: " + fechaNacimiento);

            if (fechaActual.getYear() == fechaNacimiento.getYear()) {
                System.out.println("Eres recién nacido");
            } else if (fechaActual.isBefore(fechaNacimiento)) {
                System.err.println("No es posible calcular tu edad, tu fecha de nacimiento ingresada es mayor a la actual");
            } else {
                System.out.println("Tu edad es: " + (fechaActual.getYear() - fechaNacimiento.getYear()));
            }
        } catch (Exception e) {
            System.err.println("Formato de fecha ingresado no válido: " + e);
        }
    }
}
