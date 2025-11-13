package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Implementación base de un producto comestible para decorar */
public class ComidaBasica implements ProductoBase {
    private String nombre;
    private BigDecimal precio;

    public ComidaBasica(String nombre, BigDecimal precio){ this.nombre = nombre; this.precio = precio; }

    @Override public String getDescripcion(){ return nombre; }
    @Override public BigDecimal getPrecio(){ return precio; }
}
