package com.techlab.herencia;

public class Cafe extends Producto implements Descontable {
    private boolean molido;

    public Cafe(String nombre, double precio, boolean molido) {
        super(nombre, precio);
        this.molido = molido;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.95;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * (porcentaje / 100.0));
    }

    @Override
    public String mostrarInformacion() {
        String estado = molido ? "si" : "no";
        return super.mostrarInformacion() + " - Molido: " + estado;
    }
}
