package LabII.Aula12.ExemploCardapioRefatorado.tests.servicos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import LabII.Aula12.ExemploCardapioRefatorado.negocio.Produto;
import LabII.Aula12.ExemploCardapioRefatorado.servicos.Conta;

public class ContaTest {

    @Test
    public void testaProdutoComValorInferiorA20() {
        Produto p = new Produto(1, "X Salada", 12.00);
        Conta c = new Conta();
        assertEquals(12.00, c.calculaPedido(p, 1), 0.01);

    }

    @Test
    public void testaProdutoComValorSuperiorA20() {
        Produto p = new Produto(1, "X Salada", 12.00);
        Conta c = new Conta();
        assertEquals(19.20, c.calculaPedido(p, 2), 0.01);

    }
}
