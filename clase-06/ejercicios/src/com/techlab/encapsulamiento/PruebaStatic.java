package com.techlab.encapsulamiento;

public class PruebaStatic {
    public static void main(String[] args) {
        new Producto("Cafe Premium", 250.0, 10);
        new Producto("Te Verde", 180.0, 20);
        new Producto("Chocolate Amargo", 300.0, 15);

        System.out.println("Cantidad de productos creados: " + Producto.getContadorProductos());
    }
}
