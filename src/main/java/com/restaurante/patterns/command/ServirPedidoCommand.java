package com.restaurante.patterns.command;

public class ServirPedidoCommand implements Comando {
    private PedidoReceiver receiver;
    public ServirPedidoCommand(PedidoReceiver r){ this.receiver = r; }
    @Override public void ejecutar(){ receiver.servir(); }
}
