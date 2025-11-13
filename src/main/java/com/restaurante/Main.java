package com.restaurante;

import com.restaurante.patterns.factorymethod.FactoryDemo;
import com.restaurante.patterns.singleton.SingletonDemo;
import com.restaurante.patterns.observer.ObserverDemo;
import com.restaurante.patterns.strategy.StrategyDemo;
import com.restaurante.patterns.decorator.DecoratorDemo;
import com.restaurante.patterns.command.CommandDemo;
import com.restaurante.service.PedidoService;

import com.restaurante.entity.product.Producto;
import com.restaurante.patterns.factorymethod.ProductoFactory;
import com.restaurante.patterns.factorymethod.BebidaFactory;
import com.restaurante.patterns.factorymethod.ComidaFactory;
import com.restaurante.patterns.factorymethod.PostreFactory;
import com.restaurante.entity.order.Pedido;
import com.restaurante.entity.order.PedidoItem;
import com.restaurante.entity.person.Cliente;
import com.restaurante.entity.table.Mesa;

import java.math.BigDecimal;
import java.util.Scanner;

/** Clase principal interactiva: permite seguir paso a paso y crear pedidos desde consola */
public class Main {
    public static void main(String[] args){
        System.out.println("--- INICIANDO DEMOS DEL SISTEMA DE RESTAURANTE ---");
        FactoryDemo.demo();
        SingletonDemo.demo();
        ObserverDemo.demo();
        StrategyDemo.demo();
        DecoratorDemo.demo();
        CommandDemo.demo();

        System.out.println("--- DEMO INTEGRACIÓN: PedidoService (interactivo) ---");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine().trim();
        Cliente cliente = new Cliente(50L, nombre.isEmpty() ? "Anonimo" : nombre, "000");
        System.out.print("Ingrese número de mesa: ");
        int numMesa = Integer.parseInt(sc.nextLine().trim());
        Mesa mesa = new Mesa(numMesa,4);

        Pedido pedido = new Pedido(123L, cliente, mesa);

        // Menú simple usando Factory
        ProductoFactory fB = new BebidaFactory();
        ProductoFactory fC = new ComidaFactory();
        ProductoFactory fP = new PostreFactory();

        Producto coca = fB.crear(1L, "Coca-Cola", new BigDecimal("2.50"), "Lata 350ml");
        Producto pizza = fC.crear(2L, "Pizza Margarita", new BigDecimal("8.00"), "Mediana");
        Producto flan = fP.crear(3L, "Flan", new BigDecimal("3.00"), "Casero");

        System.out.println("Menu disponible:\n1) " + coca + "\n2) " + pizza + "\n3) " + flan);

        while(true){
            System.out.print("Seleccione item (1-3) o 0 para terminar: ");
            String line = sc.nextLine().trim();
            if(line.equals("0")) break;
            int sel = Integer.parseInt(line);
            Producto elegido = null;
            if(sel==1) elegido = coca;
            else if(sel==2) elegido = pizza;
            else if(sel==3) elegido = flan;
            else { System.out.println("Opción inválida"); continue; }

            System.out.print("Cantidad: ");
            int cant = Integer.parseInt(sc.nextLine().trim());
            pedido.agregarItem(new PedidoItem(elegido, cant));
            System.out.println("Item agregado: " + elegido.getNombre() + " x" + cant);
        }

        System.out.println("Enviando a cocina...");
        PedidoService srv = new PedidoService();
        srv.procesarPedido(pedido);

        System.out.println("--- FIN ---");
        sc.close();
    }
}
