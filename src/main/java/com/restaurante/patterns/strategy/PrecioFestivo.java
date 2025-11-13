package com.restaurante.patterns.strategy;

import java.math.BigDecimal;

/** Estrategia que suma un recargo fijo (p. ej. por días festivos) */
public class PrecioFestivo implements EstrategiaPrecio {
    private BigDecimal adicional;
    public PrecioFestivo(BigDecimal adicional){ this.adicional = adicional; }

    @Override
    public BigDecimal calcular(BigDecimal totalBase) {
        return totalBase.add(adicional);
    }
}
