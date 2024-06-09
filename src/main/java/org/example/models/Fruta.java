package org.example.models;

import org.example.interfaces.Producto;

public class Fruta implements Producto {
    private String nombre;
    private double precio;
    private String unidadVenta;

    public Fruta(String nombre, double precio, String unidadVenta) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadVenta;
    }
}
