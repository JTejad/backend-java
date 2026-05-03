package com.techlab.herencia;

public class Te extends Producto implements Descontable {
    private String tipo;

    public Te(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.90;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * (porcentaje / 100.0));
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Tipo: " + tipo;
    }
}
