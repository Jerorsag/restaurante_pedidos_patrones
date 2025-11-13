package com.restaurante.patterns.factorymethod;

import com.restaurante.entity.product.Comida;
import com.restaurante.entity.product.Producto;
import java.math.BigDecimal;

public class ComidaFactory implements ProductoFactory {
    @Override
    public Producto crear(Long id, String nombre, BigDecimal precio, String descripcion) {
        return new Comida(id, nombre, precio, descripcion);
    }
}
