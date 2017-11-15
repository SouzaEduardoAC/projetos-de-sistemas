package AEPTransitory;

import aula20170617.custoMedio.Produto;

import java.util.Date;

public class Compra extends Movimento {
    public Compra(Double quantidade, Double valor, Produto produto, Date data) {
        super(quantidade, valor, produto, data);
    }
}
