package com.techlab.encapsulamiento;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidadEnStock();
        }

        return total;
    }
}
