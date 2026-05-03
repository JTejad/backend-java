package com.techlab.poo;

public class Cliente {
    String nombre;
    String email;

    public Cliente() {
    }

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " - Email: " + email);
    }
}
