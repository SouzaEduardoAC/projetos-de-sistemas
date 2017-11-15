package AEPTransitory;

import aula20170617.custoMedio.Produto;

import java.util.List;

public interface MovimentoRepository {
    void save(Movimento movimento);

    List<Movimento> findAll();

    List<Movimento> findByProduto(Produto produto);

    Movimento findById(String id);
}
