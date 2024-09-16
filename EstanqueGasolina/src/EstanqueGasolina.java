import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        double gasolinaActual;
        Scanner entrada = new Scanner(System.in);

        System.out.println("---- BIENVENIDO -----\n");
        System.out.println("-- Este programa te indica el estado de tu tanque de gasolina --");
        System.out.println("Ingresa el valor actual de tu tanque de gasolina (Máximo 70, Mínimo 0):");
        gasolinaActual = entrada.nextDouble();

        if(gasolinaActual == 70 ){
            System.out.println("Tanque lleno");
        }
        else if(gasolinaActual >= 60 && gasolinaActual < 70){
            System.out.println("Tanque casi lleno");
        }
        else if(gasolinaActual >= 40 && gasolinaActual < 60){
            System.out.println("Tanque a 3/4");
        }
        else if(gasolinaActual >= 35 && gasolinaActual < 40){
            System.out.println("Medio tanque");
        }
        else if(gasolinaActual >= 20 && gasolinaActual < 35){
            System.out.println("Suficiente");
        }
        else if(gasolinaActual >= 1 && gasolinaActual < 20){
            System.out.println("Insuficiente");
        }
        else if(gasolinaActual == 0){
            System.out.println("Tanque vacío");
        }
        else{
            System.out.println("Valor ingresado no valido");
        }
    }
}
