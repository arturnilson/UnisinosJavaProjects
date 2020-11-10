package LabII.Aula12.ExemploCardapioRefatorado.tests.negocio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import LabII.Aula12.ExemploCardapioRefatorado.negocio.Produto;

public class ProdutoTest {

    @Test
    public void testaInformacoesDeUmProduto() {
        Produto p = new Produto(1, "X Salada", 12.00);
        assertEquals(1, p.getCodigo());
        assertEquals("X Salada", p.getNome());
        assertEquals(12.00, p.getvalorVenda(), 0.01);
    }
}