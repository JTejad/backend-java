package com.techlab.fundamentos;

public class CostoPedido {
    public static void main(String[] args) {
        int precioUnitario = 200;
        int cantidad = 10;
        int costoTotal = precioUnitario * cantidad;

        System.out.println("El costo total del pedido es: $" + costoTotal);
    }
}
