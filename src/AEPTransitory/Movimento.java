package AEPTransitory;

import aula20170617.custoMedio.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Movimento {
    private Double quantidade;
    private Double valor;
    private Date data;
    private String id;
    private Produto produto;

    public Movimento(Double quantidade, Double valor, Produto produto, Date data){
        this.quantidade = quantidade;
        this.valor = valor;
        data = new Date();
        this.id = UUID.randomUUID().toString();
        this.produto = produto;
        this.data = data;
    }

    public Double getQuantidade(){
        return quantidade;
    }

    public Double getValor(){
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getId(){
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movimento other = (Movimento) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public Produto getProduto() {
        return produto;
    }
}
