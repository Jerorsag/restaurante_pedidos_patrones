package com.restaurante.entity.table;

/** Mesa del restaurante
 *
 * Representa una mesa física del restaurante. Se asocia a un pedido
 * para saber dónde debe entregarse la orden.
 */
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }

    @Override
    public String toString() { return "Mesa " + numero + " (cap:" + capacidad + ")"; }
}
