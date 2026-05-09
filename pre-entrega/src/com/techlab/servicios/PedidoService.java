package com.techlab.servicios;

import java.util.ArrayList;

import com.techlab.excepciones.StockInsuficienteException;
import com.techlab.pedidos.LineaPedido;
import com.techlab.pedidos.Pedido;

public class PedidoService {
    private final ArrayList<Pedido> pedidos;

    public PedidoService() {
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public boolean hayPedidos() {
        return !pedidos.isEmpty();
    }

    public Pedido crearPedido(ArrayList<LineaPedido> lineas) throws StockInsuficienteException {
        for (LineaPedido linea : lineas) {
            if (linea.getCantidad() > linea.getProducto().getStock()) {
                throw new StockInsuficienteException(
                        "No hay stock suficiente para " + linea.getProducto().getNombre() + ".");
            }
        }

        Pedido pedido = new Pedido();

        for (LineaPedido linea : lineas) {
            linea.getProducto().descontarStock(linea.getCantidad());
            pedido.agregarLinea(linea);
        }

        pedidos.add(pedido);
        return pedido;
    }
}
