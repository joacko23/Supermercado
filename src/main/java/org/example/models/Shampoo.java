package org.example.models;

import org.example.interfaces.Producto;

public class Shampoo implements Producto {
    private String nombre;
    private int contenido;
    private double precio;

    public Shampoo(String nombre, int contenido, double precio) {
        this.nombre = nombre;
        this.contenido = contenido;
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
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}
