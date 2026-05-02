package com.techlab.cadenas;

public class CatalogoArray {
    public static void main(String[] args) {
        String[] productos = new String[5];

        productos[0] = "Cafe Premium Molido";
        productos[1] = "Te Verde Organico";
        productos[2] = "Chocolate Amargo 80%";
        productos[3] = "Cafe Descafeinado";
        productos[4] = "Te Negro";

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

        System.out.println("No se puede agregar un sexto producto sin crear un nuevo array.");
    }
}
