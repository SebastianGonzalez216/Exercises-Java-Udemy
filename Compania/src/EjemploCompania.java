import com.personas.*;

public class EjemploCompania {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Esteban", "Duarte", "512344", "Polanco, CDMX", 12000);
        Gerente gerente = new Gerente("Alejandro", "Mendoza", "872122", "Santa Fe, CDMX", 35000, 60000);

        System.out.println(empleado);
        System.out.println(gerente);

        //Aquí se enviá como primer argumento el porcentaje que se desea aumentar, como segundo argumento al gerente
        empleado.aumentarRemuneracion(20, gerente);

        System.out.println(empleado);
        System.out.println(gerente);

    }
}
