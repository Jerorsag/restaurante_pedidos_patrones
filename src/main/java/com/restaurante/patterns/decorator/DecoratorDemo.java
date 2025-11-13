package com.restaurante.patterns.decorator;

import java.math.BigDecimal;

/** Demo del patrón Decorator: añade complementos a un producto */
public class DecoratorDemo {
    public static void demo(){
        ProductoBase hamburguesa = new ComidaBasica("Hamburguesa", new BigDecimal("5.00"));
        hamburguesa = new ExtraQueso(hamburguesa);
        hamburguesa = new ExtraTocineta(hamburguesa);
        System.out.println("DecoratorDemo: " + hamburguesa.getDescripcion() + " -> " + hamburguesa.getPrecio());
    }
}
