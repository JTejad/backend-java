package com.techlab.cadenas;

import java.util.ArrayList;

public class ListaProductosProlijos {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add(" cafe premium MOLIDO ");
        productos.add(" té verde ORGANICO ");
        productos.add(" chocolate amargo 80% ");

        System.out.println("Lista original:");
        for (String producto : productos) {
            System.out.println("[" + producto + "]");
        }

        ArrayList<String> productosFormateados = formatearProductos(productos);

        System.out.println("Lista prolija:");
        for (String producto : productosFormateados) {
            System.out.println(producto);
        }
    }

    public static ArrayList<String> formatearProductos(ArrayList<String> productos) {
        ArrayList<String> resultado = new ArrayList<>();

        for (String producto : productos) {
            resultado.add(formatearNombreProducto(producto));
        }

        return resultado;
    }

    public static String formatearNombreProducto(String nombre) {
        nombre = nombre.trim().toLowerCase();
        String[] palabras = nombre.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                if (resultado.length() > 0) {
                    resultado.append(" ");
                }

                resultado.append(palabra.substring(0, 1).toUpperCase());
                resultado.append(palabra.substring(1));
            }
        }

        return resultado.toString();
    }
}
