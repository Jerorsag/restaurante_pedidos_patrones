package com.restaurante.entity.person;

/** Cocinero simple
 *
 * Representa al empleado que prepara los platos. Se usa en los
 * observadores para recibir notificaciones de nuevos pedidos.
 */
public class Cocinero extends Empleado {
    public Cocinero(Long id, String nombre){ super(id, nombre); }
}
