package com.restaurante.entity.person;

/** Empleado base (puede ser mesero o cocinero)
 *
 * Provee atributos comunes y sirve como superclase para roles.
 */
public abstract class Empleado {
    protected Long id;
    protected String nombre;

    public Empleado(Long id, String nombre){ this.id = id; this.nombre = nombre; }
    public Long getId(){ return id; }
    public String getNombre(){ return nombre; }
}
