package AEPTransitory;

import aula20170617.custoMedio.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MovimentoRepositoryTransient implements MovimentoRepository{
    private ArrayList<Movimento> movimentos = new ArrayList<>();

    @Override
    public void save(Movimento movimento) {
        this.movimentos.add(movimento);
    }

    @Override
    public List<Movimento> findAll() {
        return Collections.unmodifiableList(this.movimentos);
    }

    @Override
    public List<Movimento> findByProduto(Produto produto) {
        /*
        List<Movimento> movimentosDoProduto = new ArrayList<Movimento>();
        for (Movimento movimento : movimentos) {
            if(movimento.getProduto().equals(produto))
                movimentosDoProduto.add(movimento);
            
        }
         */
        return this.movimentos.stream().filter(m->m.getProduto().equals(produto)).collect(Collectors.toList());
    }

    @Override
    public Movimento findById(String id) {
        for (Movimento movimento : movimentos) {
            if (movimento.getId().equals(id)) return movimento;
        }
        return null;
    }
}
