package com.restaurante.patterns.strategy;

import java.math.BigDecimal;

/** Interfaz para estrategias de precio
 *
 * Define el comportamiento de cálculo de precio que puede variar
 * (normal, con descuento, festivo). Usada por {@link CalculadoraPrecio}.
 */
public interface EstrategiaPrecio {
    BigDecimal calcular(BigDecimal totalBase);
}
