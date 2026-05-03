package com.techlab.encapsulamiento;

public class Producto {
    private static int contadorProductos = 0;

    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
        contadorProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        }
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }
}
