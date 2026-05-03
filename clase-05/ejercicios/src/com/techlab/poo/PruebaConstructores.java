package com.techlab.poo;

public class PruebaConstructores {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", "ana@email.com");
        Cliente cliente2 = new Cliente("Martin", "martin@email.com");
        Cliente cliente3 = new Cliente("Lucia", "lucia@email.com");

        cliente1.mostrarInformacion();
        cliente2.mostrarInformacion();
        cliente3.mostrarInformacion();
    }
}
