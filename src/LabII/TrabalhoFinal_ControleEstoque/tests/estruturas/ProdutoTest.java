package LabII.TrabalhoFinal_ControleEstoque.tests.estruturas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;

public class ProdutoTest {

    @Test
    public void testaInformacoesProduto() {
        Produto p = new Produto(00001, "Martelo", 15, 25);
        assertEquals(00001, p.getCodigo());
        assertEquals("Martelo", p.getDescricao());
        assertEquals(15, p.getQuantidade());
        assertEquals(25, p.getQuantidadeMinEstoque());
    }
}
