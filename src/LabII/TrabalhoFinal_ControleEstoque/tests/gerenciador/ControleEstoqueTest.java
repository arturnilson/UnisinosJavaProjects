package LabII.TrabalhoFinal_ControleEstoque.tests.gerenciador;

import org.junit.Test;

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;
import LabII.TrabalhoFinal_ControleEstoque.gerenciador.ControleEstoque;

public class ControleEstoqueTest {
    @Test
    public void testaAumantaEstoqueProduto() {
        ControleEstoque ce = new ControleEstoque();

        ce.insereProduto(00001, "Martelo", 15, 25);

        ce.entradaEstoque(00001, 10);
    }
}
