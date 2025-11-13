package com.restaurante.entity.product;

import java.math.BigDecimal;

/** Postre concreto
 *
 * Representa postres del menú (p. ej. flan, helado).
 */
public class Postre extends Producto {
    public Postre(Long id, String nombre, BigDecimal precio, String descripcion) {
        super(id, nombre, precio, descripcion);
    }
}
