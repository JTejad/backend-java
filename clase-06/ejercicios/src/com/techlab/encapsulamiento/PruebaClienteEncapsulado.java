package com.techlab.encapsulamiento;

public class PruebaClienteEncapsulado {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "juan@email.com");

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Email: " + cliente.getEmail());

        cliente.setEmail("correo-invalido");
        System.out.println("Email despues de intentar cambiarlo por uno invalido: " + cliente.getEmail());
    }
}
