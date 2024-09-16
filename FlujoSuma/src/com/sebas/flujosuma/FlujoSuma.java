package com.sebas.flujosuma;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class FlujoSuma {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        for(int i=0; i<=100;i++){
            listaNumeros.add(i);
        }

        Double sumatoria = listaNumeros.stream()
                .filter(num -> num % 10  != 0)
                .mapToDouble(num -> num/2d)
                .reduce(0.0,Double::sum);

        System.out.println(sumatoria);
    }


}
