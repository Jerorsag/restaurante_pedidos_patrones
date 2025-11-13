package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Decorador que añade queso al producto */
public class ExtraQueso extends ProductoDecorador {
    public ExtraQueso(ProductoBase producto){ super(producto); }
    @Override public String getDescripcion(){ return producto.getDescripcion() + ", extra queso"; }
    @Override public BigDecimal getPrecio(){ return producto.getPrecio().add(new BigDecimal("0.80")); }
}
