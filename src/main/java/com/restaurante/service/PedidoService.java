package com.restaurante.service;

import com.restaurante.entity.order.Pedido;
import com.restaurante.entity.order.PedidoItem;
import com.restaurante.entity.product.Producto;
import com.restaurante.patterns.command.ControlPedidos;
import com.restaurante.patterns.command.PedidoReceiver;
import com.restaurante.patterns.command.TomarPedidoCommand;
import com.restaurante.patterns.command.ServirPedidoCommand;
import com.restaurante.patterns.command.CancelarPedidoCommand;
import com.restaurante.patterns.observer.PedidoSubject;
import com.restaurante.patterns.observer.CocineroObserver;
import com.restaurante.patterns.observer.MeseroObserver;
import com.restaurante.patterns.strategy.CalculadoraPrecio;
import com.restaurante.patterns.strategy.PrecioNormal;

import java.math.BigDecimal;

/** Servicio simple que integra Command, Observer y Strategy.
 *
 * Proporciona métodos de conveniencia para crear pedidos de prueba
 * y procesarlos mediante la colaboración de varios patrones.
 */
public class PedidoService {
    private ControlPedidos control = new ControlPedidos();

    /**
     * Procesa un pedido completo mostrando mensajes en consola:
     * - Registra observadores
     * - Ejecuta comandos para tomar y servir
     * - Calcula el total mediante Strategy
     * - Cambia el estado del pedido y notifica a observadores
     *
     * @param pedido pedido a procesar
     */
    public void procesarPedido(Pedido pedido){
        // crea subject y observers
        PedidoSubject subject = new PedidoSubject(pedido);
        subject.agregarObserver(new CocineroObserver("Cocinero1"));
        subject.agregarObserver(new MeseroObserver("Mesero1"));

        // usar command para tomar y preparar
        PedidoReceiver receiver = new PedidoReceiver(pedido);
        control.ejecutarComando(new TomarPedidoCommand(receiver));
        subject.setEstado(Pedido.Estado.EN_PREPARACION);

        // calcular precio usando strategy por defecto
        CalculadoraPrecio calc = new CalculadoraPrecio(new PrecioNormal());
        BigDecimal total = calc.calcular(pedido.calcularTotal());
        System.out.println("PedidoService: total calculado=" + total);

        subject.setEstado(Pedido.Estado.LISTO);
        control.ejecutarComando(new ServirPedidoCommand(receiver));
        subject.setEstado(Pedido.Estado.ENTREGADO);
    }

    /** Crea un pedido de ejemplo con un item (Sopa x2) */
    public Pedido crearPedidoDemo(){
        com.restaurante.entity.person.Cliente c = new com.restaurante.entity.person.Cliente(1L, "Cliente Demo", "000");
        com.restaurante.entity.table.Mesa m = new com.restaurante.entity.table.Mesa(1,4);
        Pedido p = new Pedido(123L, c, m);
        Producto prod = new com.restaurante.entity.product.Comida(5L, "Sopa", new BigDecimal("4.50"), "Caliente");
        p.agregarItem(new PedidoItem(prod,2));
        return p;
    }
}
