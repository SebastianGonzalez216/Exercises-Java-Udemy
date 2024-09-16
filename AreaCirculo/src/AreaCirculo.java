import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        double radio, area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("---- BIENVENIDO ----\n");
        System.out.println("Este programa calcula el area de un circulo");
        System.out.println("Ingresa el radio del circulo en metros:");
        radio = entrada.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area + "m²");
    }
}
