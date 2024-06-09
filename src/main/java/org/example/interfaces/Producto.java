package org.example.interfaces;

public interface Producto extends Comparable<Producto> {
    String getNombre();
    double getPrecio();

    @Override
    default int compareTo(Producto otroProducto) {
        return Double.compare(this.getPrecio(), otroProducto.getPrecio());
    }

    @Override
    String toString();


}
