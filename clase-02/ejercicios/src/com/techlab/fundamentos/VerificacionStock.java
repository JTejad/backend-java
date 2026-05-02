package com.techlab.fundamentos;

public class VerificacionStock {
    public static void main(String[] args) {
        int stockCafePremium = 150;
        int demanda = 120;

        if (stockCafePremium >= demanda) {
            System.out.println("Podemos cubrir el pedido de " + demanda + " unidades.");
        } else {
            System.out.println("No hay stock suficiente para cubrir el pedido.");
        }

        int cantidadSolicitada = 120;

        if (cantidadSolicitada > 100) {
            System.out.println("Aplica un descuento especial por compra mayor a 100 unidades.");
        } else {
            System.out.println("No aplica descuento especial.");
        }
    }
}
