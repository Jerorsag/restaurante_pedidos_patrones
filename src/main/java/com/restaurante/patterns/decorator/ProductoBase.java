package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Interfaz para productos decorables (simplificada)
 *
 * Permite aplicar decoradores que añaden descripciones y precio.
 */
public interface ProductoBase {
    String getDescripcion();
    BigDecimal getPrecio();
}
