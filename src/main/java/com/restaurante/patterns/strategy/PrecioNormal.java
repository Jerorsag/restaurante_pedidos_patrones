package com.restaurante.patterns.strategy;

import java.math.BigDecimal;

/** Estrategia de precio sin modificaciones */
public class PrecioNormal implements EstrategiaPrecio {
    @Override
    public BigDecimal calcular(BigDecimal totalBase) { return totalBase; }
}
