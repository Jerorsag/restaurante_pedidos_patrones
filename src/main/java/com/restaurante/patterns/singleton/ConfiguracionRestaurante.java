package com.restaurante.patterns.singleton;

/** Configuración global del restaurante (singleton)
 *
 * Provee acceso a valores globales como nombre y horario. Es útil
 * para centralizar configuración que debe ser única en la aplicación.
 */
public final class ConfiguracionRestaurante {
    private static ConfiguracionRestaurante instance;
    private String nombre;
    private String horario;

    private ConfiguracionRestaurante() { nombre = "Mi Restaurante"; horario = "9:00-23:00"; }

    public static synchronized ConfiguracionRestaurante getInstance(){
        if(instance == null) instance = new ConfiguracionRestaurante();
        return instance;
    }

    public String getNombre(){ return nombre; }
    public String getHorario(){ return horario; }
    public void setHorario(String horario){ this.horario = horario; }
}
