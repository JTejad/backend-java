package com.techlab.metodos;

public class ReponerStock {
    public static void main(String[] args) {
        int[] stock = {10, 20, 30};

        System.out.println("Stock antes de reponer:");
        mostrarStock(stock);

        reponerStock(stock, 1, 15);

        System.out.println("Stock despues de reponer:");
        mostrarStock(stock);
    }

    public static void reponerStock(int[] stock, int indice, int unidades) {
        stock[indice] += unidades;
    }

    public static void mostrarStock(int[] stock) {
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Producto " + i + ": " + stock[i]);
        }
    }
}
