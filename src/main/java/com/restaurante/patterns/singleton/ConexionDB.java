package com.restaurante.patterns.singleton;

/** Simulación de conexión única al sistema
 *
 * Implementa el patrón Singleton con doble comprobación
 * (double-checked locking). Aquí solo simulamos el estado de
 * la conexión para los demos.
 */
public final class ConexionDB {
    private static volatile ConexionDB instancia;
    private String estado = "disconnected";

    private ConexionDB(){ estado = "connected"; }

    public static ConexionDB getInstance(){
        if(instancia == null){
            synchronized (ConexionDB.class){
                if(instancia == null) instancia = new ConexionDB();
            }
        }
        return instancia;
    }

    public String getEstado(){ return estado; }
}
