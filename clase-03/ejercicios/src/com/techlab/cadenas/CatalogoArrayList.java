package com.techlab.cadenas;

import java.util.ArrayList;

public class CatalogoArrayList {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Cafe Premium Molido");
        productos.add("Te Verde Organico");
        productos.add("Chocolate Amargo 80%");
        productos.add("Cafe Descafeinado");

        productos.remove("Chocolate Amargo 80%");

        System.out.println("Existe Te Verde Organico: " + productos.contains("Te Verde Organico"));

        System.out.println("Lista final de productos:");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}
