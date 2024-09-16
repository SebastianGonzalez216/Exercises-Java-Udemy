package com.personas;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    private static int contadorID = 0;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        empleadoId = ++contadorID;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje, Gerente gerente) {
        if (porcentaje > 0 && porcentaje <= 100) {
            int porcentajeTotal = porcentaje + 100;
            remuneracion = (remuneracion * porcentajeTotal) / 100;
            if (gerente.getPresupuesto() >= remuneracion) {
                gerente.setPresupuesto(gerente.getPresupuesto() - remuneracion);
            } else {
                gerente.setPresupuesto(gerente.getPresupuesto() - remuneracion);
                System.err.println("El presupuesto es insuficiente, verifique el presupuesto disponible");
            }
        } else {
            gerente.setPresupuesto(gerente.getPresupuesto() - remuneracion);
            System.err.println("Porcentaje invalido, por favor asigne al objeto un valor entre 1 y 100");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoid=" + empleadoId +
                "} " + super.toString();
    }
}
