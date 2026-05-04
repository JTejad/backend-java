package com.techlab.productos;

import com.techlab.excepciones.StockInsuficienteException;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void vender(int cantidad) throws StockInsuficienteException {
        if (cantidad > cantidadEnStock) {
            throw new StockInsuficienteException("No hay stock suficiente para vender " + cantidad + " unidades de " + nombre + ".");
        }

        cantidadEnStock -= cantidad;
    }
}
