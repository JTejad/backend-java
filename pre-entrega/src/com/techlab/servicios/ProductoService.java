package com.techlab.servicios;

import java.util.ArrayList;

import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.productos.Producto;

public class ProductoService {
    private final ArrayList<Producto> productos;

    public ProductoService() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public boolean hayProductos() {
        return !productos.isEmpty();
    }

    public Producto buscarPorId(int id) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }

        throw new ProductoNoEncontradoException("No se encontro un producto con ID " + id + ".");
    }

    public Producto buscarPorNombre(String nombre) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre.trim())) {
                return producto;
            }
        }

        throw new ProductoNoEncontradoException("No se encontro un producto con nombre " + nombre + ".");
    }

    public void eliminarPorId(int id) throws ProductoNoEncontradoException {
        Producto producto = buscarPorId(id);
        productos.remove(producto);
    }
}
