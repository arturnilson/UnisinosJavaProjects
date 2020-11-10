package LabII.Aula12.ExemploCardapioRefatorado.servicos;

import LabII.Aula12.ExemploCardapioRefatorado.negocio.Produto;

public class Conta {
    private static final double PERCENTUAL_A_DESCONTAR = 0.80;
    private static final int VALOR_PARA_CONSIDERAR_DESCONTO = 20;

    public double calculaPedido(Produto produtoEscolhido, int quantidade) {
        double valorTotalPedido = produtoEscolhido.getvalorVenda() * quantidade;

        if (valorTotalPedido > VALOR_PARA_CONSIDERAR_DESCONTO)
            valorTotalPedido = valorTotalPedido * PERCENTUAL_A_DESCONTAR;

        return valorTotalPedido;
    }
}
