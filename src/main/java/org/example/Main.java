package org.example;

import org.example.interfaces.Producto;
import org.example.models.Bebida;
import org.example.models.Fruta;
import org.example.models.Shampoo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Bebida("Coca-Cola Zero", 1.5, 20),
                new Bebida("Coca-Cola", 1.5, 18),
                new Shampoo("Shampoo Sedal", 500, 19),
                new Fruta("Frutillas", 64, "kilo")
        );

        productos.forEach(System.out::println);

        Producto productoMasCaro = productos.stream().max(Producto::compareTo).get();
        Producto productoMasBarato = productos.stream().min(Producto::compareTo).get();

        System.out.println("=============================");
        System.out.println("Producto más caro: " + productoMasCaro.getNombre());
        System.out.println("Producto más barato: " + productoMasBarato.getNombre());
    }
}