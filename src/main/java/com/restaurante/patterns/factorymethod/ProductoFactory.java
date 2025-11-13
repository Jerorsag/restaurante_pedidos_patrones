package com.restaurante.patterns.factorymethod;

import com.restaurante.entity.product.Producto;

/**
 * Factory Method - ProductoFactory
 *
 * Interfaz que define el método de creación de {@link Producto}. Las
 * implementaciones concretas devuelven distintas subclases (Bebida,
 * Comida, Postre). Usado para centralizar la creación y facilitar la
 * extensión del catálogo sin instanciar concretas por fuera.
 */
public interface ProductoFactory {
    Producto crear(Long id, String nombre, java.math.BigDecimal precio, String descripcion);
}
