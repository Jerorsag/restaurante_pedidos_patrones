package com.restaurante.patterns.observer;

import com.restaurante.entity.order.Pedido;

public class MeseroObserver implements Observer {
    private String nombre;
    public MeseroObserver(String nombre){ this.nombre = nombre; }

    /** Imprime una notificación amigable para el mesero */
    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Mesero " + nombre + " notificado: pedido " + pedido.getId() + " -> " + pedido.getEstado());
    }
}
