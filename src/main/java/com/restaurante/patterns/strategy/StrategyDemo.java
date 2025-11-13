package com.restaurante.patterns.strategy;

import java.math.BigDecimal;

/** Demo del patrón Strategy: muestra distintos cálculos de precio */
public class StrategyDemo {
    public static void demo(){
        CalculadoraPrecio calc = new CalculadoraPrecio(new PrecioNormal());
        BigDecimal base = new BigDecimal("100.00");
        System.out.println("StrategyDemo: normal=" + calc.calcular(base));

        calc.setEstrategia(new PrecioConDescuento(new BigDecimal("0.15")));
        System.out.println("StrategyDemo: con descuento 15%=" + calc.calcular(base));

        calc.setEstrategia(new PrecioFestivo(new BigDecimal("20.00")));
        System.out.println("StrategyDemo: festivo +20=" + calc.calcular(base));
    }
}
