package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Decorador que añade tocineta */
public class ExtraTocineta extends ProductoDecorador {
    public ExtraTocineta(ProductoBase producto){ super(producto); }
    @Override public String getDescripcion(){ return producto.getDescripcion() + ", extra tocineta"; }
    @Override public BigDecimal getPrecio(){ return producto.getPrecio().add(new BigDecimal("1.20")); }
}
