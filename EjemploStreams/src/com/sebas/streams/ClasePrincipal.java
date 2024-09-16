package com.sebas.streams;

import java.util.ArrayList;
import java.util.List;

public class ClasePrincipal {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1,"Pepe","Gerente",25000d);
        Empleado empleado2 = new Empleado(2,"Alejandro","Subjefe",18000d);
        Empleado empleado3 = new Empleado(3,"Laura","Recursos humanos",14000d);
        Empleado empleado4 = new Empleado(4,"Mariana","Secretaria",11000d);
        Empleado empleado5 = new Empleado(5,"Carlos","Conserje",8500d);

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);

        //---------------------------------------


        listaEmpleados.stream()

                .filter(empleado -> empleado.getSalario() <= 15000d)
                .map(empleado -> {
                    empleado.setSalario(empleado.getSalario() + 500);
                    return empleado;
                })
                .forEach(System.out::println);

        //----------------------------------------
        System.out.println(
        listaEmpleados.stream()

                .mapToDouble(Empleado::getSalario)
                .sum()
        );

        //--------------------------------------

        
    }
}
