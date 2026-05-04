package com.techlab.app;

import java.util.ArrayList;

import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.excepciones.StockInsuficienteException;
import com.techlab.productos.Bebida;
import com.techlab.productos.Comida;
import com.techlab.productos.Producto;

public class PruebaExcepciones {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Bebida("Cafe Frio", 220.0, 5));
        productos.add(new Comida("Brownie", 150.0, 2));

        try {
            Producto producto = buscarProductoPorNombre(productos, "Cafe Frio");
            System.out.println("Producto encontrado: " + producto.getNombre());
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Busqueda finalizada.");
        }

        try {
            Producto producto = buscarProductoPorNombre(productos, "Te Negro");
            System.out.println("Producto encontrado: " + producto.getNombre());
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Producto brownie = buscarProductoPorNombre(productos, "Brownie");
            brownie.vender(3);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error al vender: " + e.getMessage());
        }
    }

    public static Producto buscarProductoPorNombre(ArrayList<Producto> productos, String nombre)
            throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }

        throw new ProductoNoEncontradoException("El producto '" + nombre + "' no existe.");
    }
}
