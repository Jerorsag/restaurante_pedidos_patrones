package com.restaurante.patterns.observer;

import com.restaurante.entity.order.Pedido;

public class CocineroObserver implements Observer {
    private String nombre;
    public CocineroObserver(String nombre){ this.nombre = nombre; }

    /** Al recibir la notificación imprime el estado del pedido */
    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Cocinero " + nombre + " recibido notificación: pedido " + pedido.getId() + " estado=" + pedido.getEstado());
    }
}
