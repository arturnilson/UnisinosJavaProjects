package LabII.TrabalhoFinal_ControleEstoque.estruturas;

public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    private int quantidadeMinEstoque;

    public Produto(int codigo, String descricao, int quantidade, int quantidadeMinEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.quantidadeMinEstoque = quantidadeMinEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void aumentaQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuiQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    public int getQuantidadeMinEstoque() {
        return quantidadeMinEstoque;
    }

}
