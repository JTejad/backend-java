package com.techlab.herencia;

public class PruebaDescuentos {
    public static void main(String[] args) {
        Te te = new Te("Te Chai", 200.0, "Especiado");
        Cafe cafe = new Cafe("Cafe Colombia", 300.0, false);

        System.out.println("Precio con descuento del te: $" + te.aplicarDescuento(15));
        System.out.println("Precio con descuento del cafe: $" + cafe.aplicarDescuento(10));
    }
}
