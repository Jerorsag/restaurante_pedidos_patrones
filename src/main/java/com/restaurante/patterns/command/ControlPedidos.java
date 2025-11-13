package com.restaurante.patterns.command;

import java.util.Stack;

/** Invocador que gestiona comandos (historial simple)
 *
 * Permite ejecutar comandos y mantener un historial simple. Aquí
 * no implementamos deshacer, pero la estructura es compatible con
 * esa extensión futura.
 */
public class ControlPedidos {
    private Stack<Comando> historial = new Stack<>();
    public void ejecutarComando(Comando c){ c.ejecutar(); historial.push(c); }
}
