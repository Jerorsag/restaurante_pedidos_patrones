package com.restaurante.patterns.command;

public class TomarPedidoCommand implements Comando {
    private PedidoReceiver receiver;
    public TomarPedidoCommand(PedidoReceiver r){ this.receiver = r; }
    @Override public void ejecutar(){ receiver.tomar(); }
}
