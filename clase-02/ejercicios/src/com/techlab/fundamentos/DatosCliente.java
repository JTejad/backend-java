package com.techlab.fundamentos;

import java.util.Scanner;

public class DatosCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioUnitario = 200;

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreCliente = sc.nextLine();

        System.out.print("Cuantos productos queres comprar? ");
        int cantidadProductos = sc.nextInt();

        double total = precioUnitario * cantidadProductos;

        System.out.println("Bienvenido/a a la tienda, " + nombreCliente + ".");
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}
