package com.techlab.cadenas;

public class FormateoProducto {
    public static void main(String[] args) {
        String producto = " té CHAi ";
        String productoFormateado = formatearNombreProducto(producto);

        System.out.println("Original: [" + producto + "]");
        System.out.println("Formateado: " + productoFormateado);
        System.out.println("Longitud: " + productoFormateado.length());
        System.out.println("Primera letra: " + productoFormateado.substring(0, 1));
        System.out.println("Contiene 'Chai': " + productoFormateado.contains("Chai"));
    }

    public static String formatearNombreProducto(String nombre) {
        nombre = nombre.trim().toLowerCase();

        String[] palabras = nombre.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                String primeraLetra = palabras[i].substring(0, 1).toUpperCase();
                String resto = palabras[i].substring(1);

                if (resultado.length() > 0) {
                    resultado.append(" ");
                }

                resultado.append(primeraLetra).append(resto);
            }
        }

        return resultado.toString();
    }
}
