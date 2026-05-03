package com.techlab.herencia;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarInformacion() {
        return "Producto: " + nombre + " - Precio base: $" + precio;
    }

    public abstract double calcularPrecioFinal();
}
