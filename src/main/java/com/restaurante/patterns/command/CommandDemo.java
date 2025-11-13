package com.restaurante.patterns.command;

import com.restaurante.entity.order.Pedido;
import com.restaurante.entity.person.Cliente;
import com.restaurante.entity.table.Mesa;

public class CommandDemo {
    /** Demo del patrón Command: secuencia de comandos sobre un pedido */
    public static void demo(){
        Pedido p = new Pedido(99L, new Cliente(2L, "Pablo","777"), new Mesa(2,4));
        PedidoReceiver receiver = new PedidoReceiver(p);
        ControlPedidos control = new ControlPedidos();

        control.ejecutarComando(new TomarPedidoCommand(receiver));
        control.ejecutarComando(new ServirPedidoCommand(receiver));
        control.ejecutarComando(new CancelarPedidoCommand(receiver));
    }
}
