import java.util.Scanner;

public class ArregloDiezNumeros {
    public static void main(String[] args) {

        int[] listaNumeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("---- BIENVENIDO ----\n");
        System.out.println("Este programa solicita 10 números y los reordena");

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Ingresa el número correspondiente al espacio " + (i + 1) + ":");
            listaNumeros[i] = entrada.nextInt();
        }

        System.out.println("El arreglo ordenado es:");

        int j = 0;
        for(int i = listaNumeros.length-1; i >= listaNumeros.length/2; i--){
            System.out.print("[" + listaNumeros[i] + "]");

            if(j < listaNumeros.length/2){
                System.out.print("[" + listaNumeros[j] + "]");
                j++;
            }
        }
    }
}
