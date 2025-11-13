package com.restaurante.entity.product;

import java.math.BigDecimal;

/**
 * Producto: clase base para todos los productos disponibles en el restaurante.
 *
 * Contiene los atributos comunes (id, nombre, precio, descripción) y
 * métodos de acceso. Esta clase es utilizada por los patrones (Factory,
 * Decorator) y por los pedidos para calcular totales.
 */
public abstract class Producto {
    protected Long id;
    protected String nombre;
    protected BigDecimal precio;
    protected String descripcion;

    public Producto(Long id, String nombre, BigDecimal precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public BigDecimal getPrecio() { return precio; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return nombre + " (" + precio + ")";
    }
}
