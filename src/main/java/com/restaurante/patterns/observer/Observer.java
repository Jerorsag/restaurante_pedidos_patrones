package com.restaurante.patterns.observer;

import com.restaurante.entity.order.Pedido;

/** Interfaz Observer para recibir notificaciones de pedidos
 *
 * Define el contrato que las clases observadoras (Cocinero, Mesero)
 * deben implementar para ser notificadas cuando un pedido cambia
 * de estado.
 */
public interface Observer {
    void actualizar(Pedido pedido);
}
