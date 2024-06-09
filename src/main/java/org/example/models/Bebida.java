package org.example.models;

import org.example.interfaces.Producto;

public class Bebida implements Producto {
    private String nombre;
    private double litros;
    private double precio;

    public Bebida(String nombre, double litros, double precio) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
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
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}
