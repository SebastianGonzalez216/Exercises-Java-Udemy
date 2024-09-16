
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        String nombreFactura;
        double productoUno, productoDos, total, iva, totalIva;
        Scanner entrada = new Scanner(System.in);

        System.out.println("---- BIENVENIDO ----\r\n");
        System.out.println("Ingresa el nombre de la factura:");
        nombreFactura = entrada.nextLine();
        System.out.println("Ingresa el precio del primer producto:");
        productoUno = entrada.nextDouble();
        System.out.println("Ingresa el precio del segundo producto:");
        productoDos = entrada.nextDouble();

        total = productoUno + productoDos;
        iva = total * 0.19;
        totalIva = total + iva;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + total +
                ", con un impuesto de " + iva + " y el monto después de impuesto es de " + totalIva);

    }
}
