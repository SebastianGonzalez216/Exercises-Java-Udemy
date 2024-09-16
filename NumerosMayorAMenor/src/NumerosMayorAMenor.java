import java.util.Scanner;

public class NumerosMayorAMenor {
    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("---- BIENVENIDO ----\n");
        System.out.println("-- Los números ingresados serán ordenados de mayor a menor --");
        System.out.println("Ingresa el primer numero:");
        primerNumero = entrada.nextInt();
        System.out.println("Ingresa el segundo numero:");
        segundoNumero = entrada.nextInt();

        String respuesta = primerNumero > segundoNumero ? "El primer numero es mayor:\n" + primerNumero + ", " + segundoNumero: "El segundo numero es mayor:\n" + segundoNumero + ", " + primerNumero;
        System.out.println(respuesta);
    }
}
