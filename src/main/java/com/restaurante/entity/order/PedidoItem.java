package com.restaurante.entity.order;

import java.math.BigDecimal;
import com.restaurante.entity.product.Producto;

/** Item dentro de un pedido
 *
 * Contiene un producto y la cantidad solicitada. Provee el método
 * getSubtotal() que se usa para calcular el total del pedido.
 */
public class PedidoItem {
    private Producto producto;
    private int cantidad;

    public PedidoItem(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return producto.getPrecio().multiply(java.math.BigDecimal.valueOf(cantidad));
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
}
