package com.restaurante.patterns.strategy;

import java.math.BigDecimal;

/** Estrategia que aplica un descuento porcentual */
public class PrecioConDescuento implements EstrategiaPrecio {
    private BigDecimal porcentaje; // e.g. 0.10 -> 10%
    public PrecioConDescuento(BigDecimal porcentaje){ this.porcentaje = porcentaje; }

    @Override
    public BigDecimal calcular(BigDecimal totalBase) {
        return totalBase.subtract(totalBase.multiply(porcentaje));
    }
}
