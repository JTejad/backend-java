package com.techlab.poo;

public class PruebaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Juan";
        cliente.email = "juan@email.com";

        cliente.mostrarInformacion();
    }
}
