package LabII.Aula12.ExemploCardapioRefatorado.tests.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import LabII.Aula12.ExemploCardapioRefatorado.negocio.Cardapio;
import LabII.Aula12.ExemploCardapioRefatorado.negocio.Produto;

public class CardapioTest {
    private Cardapio c;

    @Before
    public void inicializa() {
        c = new Cardapio();
    }

    @Test
    public void testaSeCardapioTemProdutos() {
        assertTrue(c.getCardapio().size() > 0);
    }

    @Test
    public void testaSeCardapioTem9Produtos() {
        assertTrue(c.getCardapio().size() == 9);
    }

    @Test
    public void testaSeProduto1EhCachorroQuente() {
        Produto p = c.getProdutoDoCardapio(1);
        assertEquals(1, p.getCodigo());
        assertEquals("Cachorro Quente", p.getNome());
        assertEquals(11.00, p.getvalorVenda(), 0.01);
    }
}
