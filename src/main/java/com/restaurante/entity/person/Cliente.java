package com.restaurante.entity.person;

/** Cliente del restaurante
 *
 * Contiene información mínima (id, nombre, teléfono). Se usa en los
 * ejemplos y para asociar pedidos a un solicitante.
 */
public class Cliente {
    private Long id;
    private String nombre;
    private String telefono;

    public Cliente(Long id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() { return nombre + " (" + telefono + ")"; }
}
