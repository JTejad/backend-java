package com.techlab.herencia;

import java.util.ArrayList;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Te("Te Verde", 180.0, "Organico"));
        productos.add(new Cafe("Cafe Premium", 250.0, true));

        for (Producto producto : productos) {
            System.out.println(producto.mostrarInformacion());
            System.out.println("Precio final: $" + producto.calcularPrecioFinal());
            System.out.println();
        }
    }
}
