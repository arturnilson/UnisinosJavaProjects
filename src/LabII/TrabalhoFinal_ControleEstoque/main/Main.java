package LabII.TrabalhoFinal_ControleEstoque.main;

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;
import LabII.TrabalhoFinal_ControleEstoque.gerenciador.ControleEstoque;
import LabII.TrabalhoFinal_ControleEstoque.ui.MenuUI;

public class Main {
    public static void main(String[] args) {
        MenuUI menu = new MenuUI();

        menu.menu();

        // ControleEstoque controle = new ControleEstoque();

        // controle.insereProduto(1, "martelo", 10, 30);
        // controle.insereProduto(2, "serra", 6, 15);
        // controle.insereProduto(3, "parafuso", 200, 1000);

        // listaProdutos(controle);

        // try {
        // controle.entradaEstoque(2, 6);
        // controle.entradaEstoque(3, 55);
        // // controle.entradaEstoque(112, 5);
        // listaProdutos(controle);

        // System.out.println(controle.saidaEstoque(1, 2));
        // controle.saidaEstoque(2, 2);
        // // controle.saidaEstoque(211, 2);

        // } catch (Exception e) {
        // System.out.println(e.toString());
        // }

        // listaProdutos(controle);

    }

    private static void listaProdutos(ControleEstoque controle) {
        Object[] produtos = controle.listarProdutos();

        for (int indx = 0; indx < produtos.length; indx++) {
            Produto produto = (Produto) produtos[indx];

            System.out.println(produto.getCodigo() + " \t " + produto.getDescricao() + " \t " + produto.getQuantidade()
                    + " \t " + produto.getQuantidadeMinEstoque());
        }
    }
}
