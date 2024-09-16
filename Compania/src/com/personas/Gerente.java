package com.personas;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "presupuesto=" + presupuesto +
                "} " + super.toString();
    }
}
