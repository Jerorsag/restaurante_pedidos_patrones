package com.restaurante.entity.product;

import java.math.BigDecimal;

/** Bebida concreta
 *
 * Representa una bebida del menú (p. ej. refrescos, jugos). Hereda de
 * Producto y no añade comportamiento extra por simplicidad.
 */
public class Bebida extends Producto {
    public Bebida(Long id, String nombre, BigDecimal precio, String descripcion) {
        super(id, nombre, precio, descripcion);
    }
}
