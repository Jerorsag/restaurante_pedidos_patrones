package com.restaurante.patterns.command;

import com.restaurante.entity.order.Pedido;

/** Receptor que realiza acciones sobre pedidos
 *
 * Contiene la lógica de negocio mínima para cambiar el estado del
 * pedido. Los comandos concretos invocan estos métodos.
 */
public class PedidoReceiver {
    private Pedido pedido;
    public PedidoReceiver(Pedido pedido){ this.pedido = pedido; }

    public void tomar(){ pedido.setEstado(Pedido.Estado.CREADO); System.out.println("Pedido " + pedido.getId() + " tomado"); }
    public void cancelar(){ pedido.setEstado(Pedido.Estado.CANCELADO); System.out.println("Pedido " + pedido.getId() + " cancelado"); }
    public void servir(){ pedido.setEstado(Pedido.Estado.ENTREGADO); System.out.println("Pedido " + pedido.getId() + " servido"); }
}
