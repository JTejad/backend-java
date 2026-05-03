package com.techlab.metodos;

public class PrecioFinalConDescuento {
    public static void main(String[] args) {
        double precioFinal = calcularPrecioFinal(200, 10, 60);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }

    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5;
        }

        return precio - (precio * (descuento / 100.0));
    }
}
