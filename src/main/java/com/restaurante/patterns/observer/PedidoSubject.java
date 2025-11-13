package com.restaurante.patterns.observer;

import com.restaurante.entity.order.Pedido;
import java.util.ArrayList;
import java.util.List;

/** Sujeto observado: notifica cuando cambia estado del pedido
 *
 * Implementa la parte "Subject" del patrón Observer. Guarda la
 * referencia al pedido y una lista de observadores a notificar cuando
 * cambia el estado.
 */
public class PedidoSubject {
    private List<Observer> observers = new ArrayList<>();
    private Pedido pedido;

    public PedidoSubject(Pedido pedido){ this.pedido = pedido; }

    public void agregarObserver(Observer o){ observers.add(o); }
    public void removerObserver(Observer o){ observers.remove(o); }

    public void setEstado(Pedido.Estado estado){
        pedido.setEstado(estado);
        // notificar
        for(Observer o : observers) o.actualizar(pedido);
    }
}
