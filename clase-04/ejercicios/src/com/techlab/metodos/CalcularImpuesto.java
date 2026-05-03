package com.techlab.metodos;

public class CalcularImpuesto {
    public static void main(String[] args) {
        System.out.println("Precio final 1: $" + calcularImpuesto(1000, 21));
        System.out.println("Precio final 2: $" + calcularImpuesto(2500, 10.5));
    }

    public static double calcularImpuesto(double precio, double porcentajeImpuesto) {
        double impuesto = precio * (porcentajeImpuesto / 100.0);
        return precio + impuesto;
    }
}
