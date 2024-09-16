import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {

        int cantidad, numeroMenor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("---- BIENVENIDO ----\n");
        System.out.println("Este programa permite ingresar una cantidad de números determinada por el usuario\n y detecta cual es el menor, también determina si el numero es menor que 10 o igual o mayor que 10");
        System.out.println("¿Cuantos números deseas ingresar?:");
        cantidad = entrada.nextInt();
        int[] vectorNumeros = new int[cantidad];

        for(int i = 0; i < vectorNumeros.length; i++){
            System.out.println("Ingresa el valor del número " + (i+1) );
            vectorNumeros[i] = entrada.nextInt();
        }

        numeroMenor = vectorNumeros[0];

        for(int i = 0; i < vectorNumeros.length; i++){
            if(vectorNumeros[i] < numeroMenor) {
                numeroMenor = vectorNumeros[i];
            }
        }

        System.out.print("El numero menor de la lista dada es " + numeroMenor);
        if(numeroMenor < 10){
            System.out.print(" y es menor que 10");
        }
        else{
            System.out.print(" y es igual o mayor que 10");
        }
    }
}
