package com.restaurante.patterns.factorymethod;

import com.restaurante.entity.product.Postre;
import com.restaurante.entity.product.Producto;
import java.math.BigDecimal;

public class PostreFactory implements ProductoFactory {
    @Override
    public Producto crear(Long id, String nombre, BigDecimal precio, String descripcion) {
        return new Postre(id, nombre, precio, descripcion);
    }
}
