package com.techlab.poo;

public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidadEnStock);
    }

    public void descontarStock(int cantidad) {
        this.cantidadEnStock -= cantidad;
    }

    public static double calcularDescuentoGeneral(double precio) {
        return precio - (precio * 0.10);
    }
}
