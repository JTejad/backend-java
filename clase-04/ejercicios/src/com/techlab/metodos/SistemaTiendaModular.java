package com.techlab.metodos;

public class SistemaTiendaModular {
    public static void main(String[] args) {
        String producto = "Cafe Premium";
        double precio = 200;
        double descuento = 10;
        int cantidad = 55;
        int[] inventario = {100, 80, 60};

        double precioFinal = calcularPrecioFinal(precio, descuento, cantidad);
        imprimirRecibo(producto, precio, precioFinal, cantidad);
        actualizarInventario(inventario, 0, cantidad);

        System.out.println("Inventario actualizado:");
        mostrarInventario(inventario);
    }

    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5;
        }

        return precio - (precio * (descuento / 100.0));
    }

    public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal, int cantidad) {
        System.out.println("Recibo de compra");
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Precio final por unidad: $" + precioFinal);
    }

    public static void actualizarInventario(int[] inventario, int indiceProducto, int unidadesVendidas) {
        inventario[indiceProducto] -= unidadesVendidas;
    }

    public static void mostrarInventario(int[] inventario) {
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Producto " + i + ": " + inventario[i]);
        }
    }
}
