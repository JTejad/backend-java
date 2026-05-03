package com.techlab.encapsulamiento;

public class PruebaCarrito {
    public static void main(String[] args) {
        Producto cafe = new Producto("Cafe Premium", 250.0, 2);
        Producto te = new Producto("Te Verde", 180.0, 3);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(cafe);
        carrito.agregarProducto(te);

        System.out.println("Total del carrito: $" + carrito.calcularTotal());
    }
}
