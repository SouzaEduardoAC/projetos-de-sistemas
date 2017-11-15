package AEPTransitory;

import aula20170617.custoMedio.Produto;
import aula20170617.custoMedio.ProdutoRepository;
import aula20170617.custoMedio.ProdutoRepositoryTransient;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.*;

public class TesteComMovimento {

    @Test
    public void testarCriarMovimentoDeCompra() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataCompra = sdf.parse("15/02/2017");

        Produto omo = new Produto("Omo");
        Movimento compra1 = new Compra(2.00, 2.00, omo, dataCompra);
        Movimento compra2 = new Compra(3.00,3.00, omo, dataCompra);

        try {
            UUID.fromString(compra1.getId());
            UUID.fromString(compra1.getId());
        } catch (IllegalArgumentException e) {
            fail("O id do produto deveria ser um UUID v�lido!");
        }

        assertEquals("A quantidade deve ser igual", 2.00, compra1.getQuantidade(), 0.00);
        assertEquals("O preço deve ser igual", 2.00, compra1.getValor(), 0.00);
        assertEquals("O produto deve ser igual", omo, compra1.getProduto());
        assertEquals("A data deve ser igual", dataCompra, compra1.getData());

        assertEquals("A quantidade deve ser igual", 3.00, compra2.getQuantidade(), 0.00);
        assertEquals("O preço deve ser igual", 3.00, compra2.getValor(), 0.00);
        assertEquals("O produto deve ser igual", omo, compra2.getProduto());
        assertEquals("A data deve ser igual", dataCompra, compra2.getData());
    }

    @Test
    public void testarCriarMovimentoDeVenda() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVenda = sdf.parse("15/02/2017");

        Produto omo = new Produto("Omo");
        Movimento venda1 = new Venda(2.00, 2.00, omo, dataVenda);
        Movimento venda2 = new Venda(3.00,3.00, omo, dataVenda);

        try {
            UUID.fromString(venda1.getId());
            UUID.fromString(venda2.getId());
        } catch (IllegalArgumentException e) {
            fail("O id do produto deveria ser um UUID v�lido!");
        }

        assertEquals("A quantidade deve ser igual", 2.00, venda1.getQuantidade(), 0.00);
        assertEquals("O preço deve ser igual", 2.00, venda1.getValor(), 0.00);
        assertEquals("O produto deve ser igual", omo, venda1.getProduto());
        assertEquals("A data deve ser igual", dataVenda, venda1.getData());

        assertEquals("A quantidade deve ser igual", 3.00, venda2.getQuantidade(), 0.00);
        assertEquals("O preço deve ser igual", 3.00, venda2.getValor(), 0.00);
        assertEquals("O produto deve ser igual", omo, venda2.getProduto());
        assertEquals("A data deve ser igual", dataVenda, venda2.getData());
    }

    @Test
    public void testarNovoMovimentoNoRepositório() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("15/02/2017");

        Produto soja = new Produto("Soja");
        Produto trigo = new Produto("Trigo");
        Movimento compra1 = new Compra(1.00,1.00,soja, data);
        Movimento compra2 = new Compra(1.00,1.00,trigo, data);
        Movimento venda1 = new Venda(1.00,1.00,soja, data);
        Movimento venda2 = new Venda(1.00,1.00,trigo, data);

        MovimentoRepository repo = new MovimentoRepositoryTransient();
        repo.save(compra1);
        repo.save(compra2);

        assertTrue("Deveria conter a soja!", repo.findAll().contains(soja));
        assertTrue("Deveria conter o trigo!", repo.findAll().contains(trigo));

        try {
            repo.findAll().remove(trigo);
            fail("Deveria ter gerado uma exception de modifica��o n�o permitida!");
        } catch (Exception e) {
            assertNotNull(e);
        }

        assertEquals("Ao procurar pelo id, deveria retornar o objeto correto!", compra1, repo.findById(compra1.getId()));
        assertNull("Ao procurar por id inexistente, deveria retornar null!", repo.findById("ed336e0e-bfd5-4434-8e6c-c3453aab8dbe"));
    }

}
