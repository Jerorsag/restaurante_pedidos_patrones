package com.restaurante.patterns.command;

public class CancelarPedidoCommand implements Comando {
    private PedidoReceiver receiver;
    public CancelarPedidoCommand(PedidoReceiver r){ this.receiver = r; }
    @Override public void ejecutar(){ receiver.cancelar(); }
}
