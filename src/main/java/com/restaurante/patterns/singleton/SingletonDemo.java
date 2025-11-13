package com.restaurante.patterns.singleton;

/** Demo del patrón Singleton: muestra como obtener instancias únicas */
public class SingletonDemo {
    public static void demo(){
        ConexionDB db = ConexionDB.getInstance();
        ConfiguracionRestaurante cfg = ConfiguracionRestaurante.getInstance();
        System.out.println("SingletonDemo: DB=" + db.getEstado() + ", Nombre=" + cfg.getNombre() + ", Horario=" + cfg.getHorario());
    }
}
