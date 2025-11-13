package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Decorador que añade salsa */
public class ExtraSalsa extends ProductoDecorador {
    public ExtraSalsa(ProductoBase producto){ super(producto); }
    @Override public String getDescripcion(){ return producto.getDescripcion() + ", extra salsa"; }
    @Override public BigDecimal getPrecio(){ return producto.getPrecio().add(new BigDecimal("0.50")); }
}
