package com.restaurante.patterns.factorymethod;

import com.restaurante.entity.product.Producto;
import java.math.BigDecimal;

/** Demo del patrón Factory Method.
 *
 * Crea diferentes productos mediante factories concretas y muestra
 * por consola el resultado. Ejemplo de salida esperada:
 * FactoryDemo: Coca-Cola (2.50), Pizza Margarita (8.00), Flan (3.00)
 */
public class FactoryDemo {
    public static void demo(){
        ProductoFactory fBebida = new BebidaFactory();
        ProductoFactory fComida = new ComidaFactory();
        ProductoFactory fPostre = new PostreFactory();

        Producto coca = fBebida.crear(1L, "Coca-Cola", new BigDecimal("2.50"), "Lata 350ml");
        Producto pizza = fComida.crear(2L, "Pizza Margarita", new BigDecimal("8.00"), "Mediana");
        Producto flan = fPostre.crear(3L, "Flan", new BigDecimal("3.00"), "Casero");

        System.out.println("FactoryDemo: " + coca + ", " + pizza + ", " + flan);
    }
}
