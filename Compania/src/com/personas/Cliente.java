package com.personas;

public class Cliente extends Persona {
    private int clienteId;

    private static int contadorID = 0;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        clienteId = ++contadorID;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId=" + clienteId +
                "} " + super.toString();
    }
}
