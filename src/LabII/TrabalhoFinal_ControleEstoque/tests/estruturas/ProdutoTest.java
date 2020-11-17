package LabII.TrabalhoFinal_ControleEstoque.tests.estruturas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;

public class ProdutoTest {
    private Produto prod;

    @Before
    public void inicializa() {
        prod = new Produto(00001, "Martelo", 15, 25);
    }

    @Test
    public void testaInformacoesProduto() {
        assertEquals(00001, prod.getCodigo());
        assertEquals("Martelo", prod.getDescricao());
        assertEquals(15, prod.getQuantidade());
        assertEquals(25, prod.getQuantidadeMinEstoque());
    }

    @Test
    public void testaAumentaQuantidade() {
        prod.aumentaQuantidade(10);
        assertEquals(25, prod.getQuantidade());
    }

    @Test
    public void testaDiminuiQuantidade() {
        prod.diminuiQuantidade(5);
        assertEquals(10, prod.getQuantidade());
    }

}
