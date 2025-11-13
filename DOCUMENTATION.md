# Documentación del sistema de restaurante

Este documento resume la arquitectura del proyecto, los patrones aplicados,
cómo ejecutar y ejemplos de salida. Está pensado para estudiarlo y entender
cómo las piezas encajan.

## Estructura principal

- `src/main/java/com/restaurante/`
  - `entity/`
    - `product/` → Clases de dominio: `Producto`, `Bebida`, `Comida`, `Postre`.
    - `order/` → `Pedido`, `PedidoItem`.
    - `person/` → `Cliente`, `Empleado`, `Mesero`, `Cocinero`.
    - `table/` → `Mesa`.
  - `patterns/` → Implementaciones de patrones: `factorymethod`, `singleton`,
    `observer`, `strategy`, `decorator`, `command`.
  - `service/` → `PedidoService` que integra varios patrones.
  - `Main.java` → Demo integradora e interactiva (consola).

## Patrones implementados

1. Factory Method (`patterns/factorymethod`)
   - Centraliza la creación de `Producto` mediante `ProductoFactory`.
   - Implementaciones: `BebidaFactory`, `ComidaFactory`, `PostreFactory`.
   - Demo: `FactoryDemo`.

2. Singleton (`patterns/singleton`)
   - `ConexionDB` y `ConfiguracionRestaurante` garantizan instancia única.
   - Demo: `SingletonDemo`.

3. Observer (`patterns/observer`)
   - `PedidoSubject` (subject) y `Observer` (interfaz).
   - Observers: `CocineroObserver`, `MeseroObserver`.
   - `Pedido` funciona como entidad cuyo cambio de estado es publicado.
   - Demo: `ObserverDemo`.

4. Strategy (`patterns/strategy`)
   - `EstrategiaPrecio` con implementaciones `PrecioNormal`,
     `PrecioConDescuento`, `PrecioFestivo`.
   - `CalculadoraPrecio` permite intercambiar estrategias.
   - Demo: `StrategyDemo`.

5. Decorator (`patterns/decorator`)
   - `ProductoBase` y `ProductoDecorador` permiten añadir extras:
     `ExtraQueso`, `ExtraTocineta`, `ExtraSalsa`.
   - Demo: `DecoratorDemo`.

6. Command (`patterns/command`)
   - `Comando` (interfaz), comandos concretos y `PedidoReceiver`.
   - `ControlPedidos` es el invocador que ejecuta comandos.
   - Demo: `CommandDemo`.

## Flujo de ejemplo (PedidoService)

`PedidoService` combina patrones para simular el flujo:
- Se crea un `Pedido` con items.
- Se registran observadores (cocinero y mesero).
- Se ejecutan comandos: tomar pedido → en preparación → listo → servir.
- Se calcula el total del pedido con `CalculadoraPrecio`.

El servicio imprime mensajes paso a paso que permiten seguir el proceso
por consola.

## Cómo ejecutar

Usando Maven (Windows PowerShell):

```powershell
cd "C:/Users/jeron/OneDrive/Desktop/U/Trabajos U/4 Semestre/Ing Software 2/restaurante"
mvn -DskipTests package
java -cp target/restaurante-1.0-SNAPSHOT.jar com.restaurante.Main
```

Notas:
- Asegúrate de usar una versión de Java compatible. Si Maven falla por la
  versión de compilación, ajusta `pom.xml` a una versión soportada
  (por ejemplo 11).

## Salida esperada (resumen)

El proyecto incluye demos que imprimen trazas similares a las siguientes:

- FactoryDemo: Coca-Cola (2.50), Pizza Margarita (8.00), Flan (3.00)
- SingletonDemo: DB=connected, Nombre=Mi Restaurante, Horario=9:00-23:00
- ObserverDemo: cambiando estado a EN_PREPARACION
  - Cocinero Juan recibido notificación: pedido 10 estado=EN_PREPARACION
  - Mesero María notificado: pedido 10 -> EN_PREPARACION
  - ObserverDemo: cambiando estado a LISTO
  - Cocinero Juan recibido notificación: pedido 10 estado=LISTO
  - Mesero María notificado: pedido 10 -> LISTO
- StrategyDemo: normal=100.00
- StrategyDemo: con descuento 15%=85.0000
- StrategyDemo: festivo +20=120.00
- DecoratorDemo: Hamburguesa, extra queso, extra tocineta -> 7.00
- CommandDemo: Pedido 99 tomado / servido / cancelado (se muestran mensajes)
- PedidoService integration: secuencia completa con mensajes paso a paso

## Recomendaciones para estudio

- Revisar cada demo por separado para entender el patrón en aislamiento.
- Leer `PedidoService` para ver cómo se componen los patrones en un flujo
  realista.
- Experimentar cambiando estrategias de precio y añadiendo decoradores
  para ver el efecto en el total.

---

Si quieres, puedo también:
- Generar diagramas UML simplificados (texto o ASCII) para cada patrón.
- Añadir ejemplos de tests unitarios para los puntos clave (Strategy,
  Factory, Decorator).
- Ajustar `pom.xml` para asegurar compatibilidad con tu versión de JDK.

Fin del informe.
