package com.restaurante.entity.product;

import java.math.BigDecimal;

/** Comida concreta
 *
 * Platos principales o entradas. Usada en pedidos para representar
 * artículos que se sirven a los clientes.
 */
public class Comida extends Producto {
    public Comida(Long id, String nombre, BigDecimal precio, String descripcion) {
        super(id, nombre, precio, descripcion);
    }
}
