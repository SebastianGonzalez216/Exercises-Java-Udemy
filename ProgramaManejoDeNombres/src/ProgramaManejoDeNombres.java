import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombreMadre, nombrePadre, nombreHermano, madreMod, padreMod, hermanoMod;
        Scanner entrada = new Scanner(System.in);

        System.out.println("---- BIENVENIDO ----\n");
        System.out.println("Ingresa el nombre de tu madre:");
        nombreMadre = entrada.nextLine();
        System.out.println("Ingresa el nombre de tu padre:");
        nombrePadre = entrada.nextLine();
        System.out.println("Ingresa el nombre de tu hermano:");
        nombreHermano = entrada.nextLine();

        madreMod = nombreMadre.toUpperCase().substring(1,2) + "." + nombreMadre.substring(nombreMadre.length()-2,nombreMadre.length());
        padreMod = nombrePadre.toUpperCase().substring(1,2) + "." + nombrePadre.substring(nombrePadre.length()-2,nombrePadre.length());
        hermanoMod = nombreHermano.toUpperCase().substring(1,2) + "." + nombreHermano.substring(nombreHermano.length()-2,nombreHermano.length());

        System.out.println(madreMod.concat("_") + padreMod.concat("_") + hermanoMod);
    }
}
