package LabII.Aula12.ExemploCardapioRefatorado.negocio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Produto> cardapio;

    public Cardapio() {
        cardapio = new ArrayList<Produto>();
        adicionaProdutosNoCardapio();
    }

    private void adicionaProdutosNoCardapio() {
        cardapio.add(new Produto(1, "Cachorro Quente", 11.00));
        cardapio.add(new Produto(2, "X-Salada", 14.00));
        cardapio.add(new Produto(3, "X-Frango", 16.00));
        cardapio.add(new Produto(4, "Torrada Simples", 5.00));
        cardapio.add(new Produto(5, "Refrigerante Lata", 3.50));
        cardapio.add(new Produto(6, "Agua s/gas", 2.00));
        cardapio.add(new Produto(7, "Agua c/gas", 2.50));
        cardapio.add(new Produto(8, "Refrigerante Garrafa 600ml", 5.00));
        cardapio.add(new Produto(9, "Refrigerante 2L", 10.00));
    }

    public List<Produto> getCardapio() {
        return cardapio;
    }

    public Produto getProdutoDoCardapio(int codigoProduto) {
        Produto produtoEscolhido = null;

        for (int i = 0; i < cardapio.size(); i++) {
            if (codigoProduto == cardapio.get(i).getCodigo())
                produtoEscolhido = cardapio.get(i);
        }
        return produtoEscolhido;
    }
}
