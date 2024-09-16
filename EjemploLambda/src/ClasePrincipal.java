import com.sebastian.lambda.ICalculadora;
import com.sebastian.lambda.Tipo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ClasePrincipal {
    public static void main(String[] args) {

    Consumer<String> saludador = nombre -> System.out.println("Bienvenido " + nombre);
    saludador.accept("Sebastián");

        BiConsumer<String, Tipo> saludadorGenero = (nombre,genero) -> {
            if(genero.equals(Tipo.MASCULINO)) {
                System.out.println("Bienvenido " + nombre);
            }
            else{
                System.out.println("Bienvenida " + nombre);
            }
        };

        saludadorGenero.accept("Sebas", Tipo.MASCULINO);
        saludadorGenero.accept("Adriana", Tipo.FEMENINO);

        ICalculadora sumador = (num1, num2) -> System.out.println("Total de la suma es " + (num1 + num2));
        sumador.Calcular(5, 10);

        ICalculadora restador = (num1, num2) -> System.out.println("Total de la resta es " + (num1 - num2));
        restador.Calcular(10,5);

        //===========================================================================

        Consumer<Double> calcularRaizCuadrada = numero -> {
            double sqrt = Math.sqrt(numero);
            System.out.println("La raiz cuadrada del numero ingresado es " + sqrt);
        };

        calcularRaizCuadrada.accept(25d);

        BiConsumer<Double, Double> calculadora = (num1, num2) -> {
          double r = num1*num2;
            System.out.println(r);
        };

        calculadora.accept(2d,12d);

        //=========================================================

        Consumer<String> consumidor = System.out::println;

        //========================================================

        Function<Double, Double> funcion = a -> {
        return a*1.2;
        };
        System.out.println("El valor multiplicado por 1.2 es " + funcion.apply(5d));

        BiFunction<Integer, Integer, Integer> funcionSuma = (a,b) -> {
            return a+b;
        };

        System.out.println("La suma de los numeros es " + funcionSuma.apply(5,3));

        //consumer practica

        Consumer<String> alteradorFrase = frase -> {
            String fraseMod = frase.replace(" ", "_").concat(" <- CADENA MOD").toUpperCase();
            System.out.println(fraseMod);
        };

        alteradorFrase.accept("bienvenidos a la playita la tortuga");




    }
}
