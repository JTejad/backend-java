package com.techlab.fundamentos;

public class ProductosPendientes {
    public static void main(String[] args) {
        int productosPendientes = 5;
        int contador = 1;

        System.out.println("Recorrido con while:");
        while (contador <= productosPendientes) {
            System.out.println("Revisando producto numero: " + contador);
            contador++;
        }

        System.out.println("Recorrido con for:");
        for (int i = 1; i <= productosPendientes; i++) {
            System.out.println("Revisando producto numero: " + i);
        }
    }
}
