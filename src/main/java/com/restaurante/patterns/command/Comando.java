package com.restaurante.patterns.command;

/** Interfaz comando
 *
 * Define la operación que se puede ejecutar. Los comandos concretos
 * delegan en un receptor para realizar acciones sobre un pedido.
 */
public interface Comando { void ejecutar(); }
