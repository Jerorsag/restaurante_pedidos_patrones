package com.restaurante.patterns.strategy;

import java.math.BigDecimal;

/** CalculadoraPrecio: usa una estrategia para calcular el precio final */
public class CalculadoraPrecio {
    private EstrategiaPrecio estrategia;
    public CalculadoraPrecio(EstrategiaPrecio estrategia){ this.estrategia = estrategia; }
    public void setEstrategia(EstrategiaPrecio e){ this.estrategia = e; }
    public BigDecimal calcular(BigDecimal base){ return estrategia.calcular(base); }
}
