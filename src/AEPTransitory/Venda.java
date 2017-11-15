package AEPTransitory;

import aula20170617.custoMedio.Produto;

import java.util.Date;

public class Venda extends Movimento {
    public Venda(Double quantidade, Double valor, Produto produto, Date data) {
        super(quantidade, valor, produto, data);
    }
}
