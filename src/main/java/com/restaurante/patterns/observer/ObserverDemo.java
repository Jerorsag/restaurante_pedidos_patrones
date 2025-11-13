package com.restaurante.patterns.observer;

import com.restaurante.entity.order.Pedido;
import com.restaurante.entity.person.Cliente;
import com.restaurante.entity.table.Mesa;

public class ObserverDemo {
    /** Demo que muestra notificaciones entre Cocina y Mesero */
    public static void demo(){
        Pedido p = new Pedido(10L, new Cliente(1L, "Ana", "555"), new Mesa(5,2));
        PedidoSubject subject = new PedidoSubject(p);
        subject.agregarObserver(new CocineroObserver("Juan"));
        subject.agregarObserver(new MeseroObserver("María"));

        System.out.println("ObserverDemo: cambiando estado a EN_PREPARACION");
        subject.setEstado(Pedido.Estado.EN_PREPARACION);
        System.out.println("ObserverDemo: cambiando estado a LISTO");
        subject.setEstado(Pedido.Estado.LISTO);
    }
}
