package com.techlab.poo;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto cafe = new Producto("Cafe Premium Molido", 250.0, 100);
        Producto te = new Producto("Te Verde Organico", 180.0, 50);

        cafe.mostrarInformacion();
        System.out.println();
        te.mostrarInformacion();
        System.out.println();

        System.out.println("Precio con descuento del cafe: $" + Producto.calcularDescuentoGeneral(cafe.precio));
        System.out.println("Precio con descuento del te: $" + Producto.calcularDescuentoGeneral(te.precio));
    }
}
