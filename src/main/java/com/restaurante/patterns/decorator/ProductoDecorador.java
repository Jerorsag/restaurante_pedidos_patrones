package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Clase base para decoradores que envuelven un ProductoBase */
public abstract class ProductoDecorador implements ProductoBase {
    protected ProductoBase producto;
    public ProductoDecorador(ProductoBase producto){ this.producto = producto; }
}
