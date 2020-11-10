package LabII.Aula12.ExemploCardapioRefatorado.ui;

import java.util.List;
import java.util.Scanner;

import LabII.Aula12.ExemploCardapioRefatorado.negocio.Cardapio;
import LabII.Aula12.ExemploCardapioRefatorado.negocio.Produto;
import LabII.Aula12.ExemploCardapioRefatorado.servicos.Conta;

public class PedidoUI {
    private Scanner teclado;
    private Conta conta;
    private Cardapio cardapio;
    private int codigoProduto;
    private int quantidade;

    public PedidoUI() {
        teclado = new Scanner(System.in);
        cardapio = new Cardapio();
        conta = new Conta();
    }

    public void menu() {
        imprimirCardapio();
        escolherProdutoEQuantidade();
        mostrarValorTotalPedido();
        teclado.close();
    }

    private void imprimirCardapio() {
        List<Produto> opcoesCardapio = cardapio.getCardapio();

        System.out.printf("\n");
        System.out.printf(" -- MENU DE PRODUTOS -- \n");
        for (int i = 0; i < opcoesCardapio.size(); i++) {
            System.out.printf("\n " + opcoesCardapio.get(i).getCodigo());
            System.out.printf("-" + opcoesCardapio.get(i).getNome());
            System.out.printf(" " + opcoesCardapio.get(i).getvalorVenda());
        }
    }

    private void escolherProdutoEQuantidade() {
        System.out.printf("\n\n Faca seu pedido de acordo com o cardapio apresentado a cima: \n Produto? ");
        codigoProduto = teclado.nextInt();
        System.out.printf("Quantas unidades? ");
        quantidade = teclado.nextInt();
    }

    private void mostrarValorTotalPedido() {
        Produto produtoEscolhido = cardapio.getProdutoDoCardapio(codigoProduto);
        System.out.printf("O valor do pedido foi de: " + conta.calculaPedido(produtoEscolhido, quantidade));
    }
}
