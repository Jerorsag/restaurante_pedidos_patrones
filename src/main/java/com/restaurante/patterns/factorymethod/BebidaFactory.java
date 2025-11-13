package com.restaurante.patterns.factorymethod;

import com.restaurante.entity.product.Bebida;
import com.restaurante.entity.product.Producto;
import java.math.BigDecimal;

public class BebidaFactory implements ProductoFactory {
    @Override
    public Producto crear(Long id, String nombre, BigDecimal precio, String descripcion) {
        return new Bebida(id, nombre, precio, descripcion);
    }
}
