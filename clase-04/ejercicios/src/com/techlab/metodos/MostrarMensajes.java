package com.techlab.metodos;

public class MostrarMensajes {
    public static void main(String[] args) {
        mostrarMensaje("Bienvenido/a a la tienda");
        mostrarMensaje("Gracias por tu compra. Cantidad de pedidos realizados", 3);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMensaje(String mensaje, int cantidad) {
        System.out.println(mensaje + ": " + cantidad);
    }
}
