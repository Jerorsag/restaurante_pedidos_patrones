package com.restaurante.entity.order;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.restaurante.entity.person.Cliente;
import com.restaurante.entity.table.Mesa;

/**
 * Pedido (Order) — representa una solicitud realizada por un cliente.
 *
 * Atributos importantes:
 * - id: identificador del pedido
 * - cliente, mesa: referencias básicas al solicitante
 * - items: lista de {@link PedidoItem}
 * - estado: enum que modela el ciclo de vida del pedido
 *
 * Esta clase es el punto central para los patrones Observer (notificar
 * cambios de estado), Command (acciones sobre el pedido) y Strategy
 * (cálculo de precios a través de los items).
 */
public class Pedido {
    public enum Estado { CREADO, EN_PREPARACION, LISTO, ENTREGADO, CANCELADO }

    private Long id;
    private Cliente cliente;
    private Mesa mesa;
    private List<PedidoItem> items = new ArrayList<>();
    private Estado estado = Estado.CREADO;
    private LocalDateTime creadoEn = LocalDateTime.now();

    public Pedido(Long id, Cliente cliente, Mesa mesa) {
        this.id = id; this.cliente = cliente; this.mesa = mesa;
    }

    public void agregarItem(PedidoItem item) { items.add(item); }

    public BigDecimal calcularTotal(){
        return items.stream().map(PedidoItem::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Long getId(){ return id; }
    public Cliente getCliente(){ return cliente; }
    public Mesa getMesa(){ return mesa; }
    public List<PedidoItem> getItems(){ return items; }
    public Estado getEstado(){ return estado; }
    public void setEstado(Estado estado){ this.estado = estado; }
    public LocalDateTime getCreadoEn(){ return creadoEn; }
}
