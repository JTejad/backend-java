package com.techlab.encapsulamiento;

public class PruebaSetterStock {
    public static void main(String[] args) {
        Producto producto = new Producto("Cafe Premium", 250.0, 10);

        System.out.println("Stock inicial: " + producto.getCantidadEnStock());
        producto.setCantidadEnStock(-10);
        System.out.println("Stock despues de intentar asignar -10: " + producto.getCantidadEnStock());
    }
}
