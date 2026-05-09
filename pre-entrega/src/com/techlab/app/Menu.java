package com.techlab.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.excepciones.StockInsuficienteException;
import com.techlab.pedidos.LineaPedido;
import com.techlab.pedidos.Pedido;
import com.techlab.productos.Producto;
import com.techlab.servicios.PedidoService;
import com.techlab.servicios.ProductoService;

public class Menu {
    private final Scanner sc;
    private final ProductoService productoService;
    private final PedidoService pedidoService;

    public Menu() {
        this.sc = new Scanner(System.in);
        this.productoService = new ProductoService();
        this.pedidoService = new PedidoService();
        cargarDatosIniciales();
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Elegi una opcion: ");

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    buscarOActualizarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    crearPedido();
                    break;
                case 6:
                    listarPedidos();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

            System.out.println();
        }
    }

    private void mostrarMenu() {
        System.out.println("====================================");
        System.out.println("===== SISTEMA DE GESTION TECHLAB ===");
        System.out.println("====================================");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar/Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Crear un pedido");
        System.out.println("6. Listar pedidos");
        System.out.println("7. Salir");
    }

    private void agregarProducto() {
        System.out.println("=== Agregar producto ===");

        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            double precio = leerDouble("Precio: ");
            int stock = leerEntero("Stock: ");

            Producto producto = new Producto(nombre, precio, stock);
            productoService.agregarProducto(producto);

            System.out.println("Producto agregado correctamente con ID " + producto.getId() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear producto: " + e.getMessage());
        }
    }

    private void listarProductos() {
        System.out.println("=== Lista de productos ===");

        if (!productoService.hayProductos()) {
            System.out.println("No hay productos cargados.");
            return;
        }

        for (Producto producto : productoService.getProductos()) {
            System.out.println(producto);
        }
    }

    private void buscarOActualizarProducto() {
        System.out.println("=== Buscar/Actualizar producto ===");

        try {
            System.out.println("1. Buscar por ID");
            System.out.println("2. Buscar por nombre");
            int criterio = leerEntero("Elegi una opcion: ");

            Producto producto;

            if (criterio == 1) {
                int id = leerEntero("Ingresa el ID del producto: ");
                producto = productoService.buscarPorId(id);
            } else if (criterio == 2) {
                System.out.print("Ingresa el nombre del producto: ");
                String nombre = sc.nextLine();
                producto = productoService.buscarPorNombre(nombre);
            } else {
                System.out.println("Opcion invalida.");
                return;
            }

            System.out.println("Producto encontrado:");
            System.out.println(producto);

            System.out.print("Queres actualizar este producto? (s/n): ");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                actualizarProducto(producto);
            }
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private void actualizarProducto(Producto producto) {
        try {
            System.out.println("1. Actualizar precio");
            System.out.println("2. Actualizar stock");
            int opcion = leerEntero("Elegi una opcion: ");

            switch (opcion) {
                case 1:
                    double nuevoPrecio = leerDouble("Nuevo precio: ");
                    producto.setPrecio(nuevoPrecio);
                    System.out.println("Precio actualizado.");
                    break;
                case 2:
                    int nuevoStock = leerEntero("Nuevo stock: ");
                    producto.setStock(nuevoStock);
                    System.out.println("Stock actualizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    private void eliminarProducto() {
        System.out.println("=== Eliminar producto ===");
        int id = leerEntero("Ingresa el ID del producto a eliminar: ");

        try {
            Producto producto = productoService.buscarPorId(id);
            System.out.println("Se va a eliminar: " + producto);
            System.out.print("Confirmar eliminacion? (s/n): ");
            String confirmacion = sc.nextLine();

            if (confirmacion.equalsIgnoreCase("s")) {
                productoService.eliminarPorId(id);
                System.out.println("Producto eliminado.");
            } else {
                System.out.println("Eliminacion cancelada.");
            }
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private void crearPedido() {
        System.out.println("=== Crear pedido ===");

        if (!productoService.hayProductos()) {
            System.out.println("No hay productos cargados para pedir.");
            return;
        }

        int cantidadLineas = leerEntero("Cuantos productos queres agregar al pedido?: ");
        if (cantidadLineas <= 0) {
            System.out.println("La cantidad de productos del pedido debe ser mayor a cero.");
            return;
        }

        ArrayList<LineaPedido> lineas = new ArrayList<>();

        for (int i = 1; i <= cantidadLineas; i++) {
            System.out.println("Linea " + i + ":");
            int idProducto = leerEntero("ID del producto: ");
            int cantidad = leerEntero("Cantidad: ");

            try {
                Producto producto = productoService.buscarPorId(idProducto);
                lineas.add(new LineaPedido(producto, cantidad));
            } catch (ProductoNoEncontradoException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        try {
            Pedido pedido = pedidoService.crearPedido(lineas);
            System.out.println("Pedido creado correctamente. ID: " + pedido.getId());
            System.out.println("Total: $" + pedido.calcularTotal());
        } catch (StockInsuficienteException e) {
            System.out.println("No se pudo crear el pedido: " + e.getMessage());
        }
    }

    private void listarPedidos() {
        System.out.println("=== Lista de pedidos ===");

        if (!pedidoService.hayPedidos()) {
            System.out.println("No hay pedidos realizados.");
            return;
        }

        for (Pedido pedido : pedidoService.getPedidos()) {
            System.out.println(pedido);
            for (LineaPedido linea : pedido.getLineas()) {
                System.out.println("  - " + linea);
            }
        }
    }

    private int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero entero valido.");
            }
        }
    }

    private double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero decimal valido.");
            }
        }
    }

    private void cargarDatosIniciales() {
        productoService.agregarProducto(new Producto("Cafe Premium", 250.0, 10));
        productoService.agregarProducto(new Producto("Te Verde", 180.0, 8));
        productoService.agregarProducto(new Producto("Chocolate Amargo", 300.0, 5));
    }
}
