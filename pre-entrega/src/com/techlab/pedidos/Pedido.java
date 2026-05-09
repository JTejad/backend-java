package com.techlab.pedidos;

import java.util.ArrayList;

public class Pedido {
    private static int contadorPedidos = 1;

    private final int id;
    private final ArrayList<LineaPedido> lineas;

    public Pedido() {
        this.id = contadorPedidos++;
        this.lineas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    public void agregarLinea(LineaPedido linea) {
        lineas.add(linea);
    }

    public double calcularTotal() {
        double total = 0;

        for (LineaPedido linea : lineas) {
            total += linea.calcularSubtotal();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + " | Total: $" + calcularTotal();
    }
}
