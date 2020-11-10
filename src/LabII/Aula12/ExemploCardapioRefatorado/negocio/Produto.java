package LabII.Aula12.ExemploCardapioRefatorado.negocio;

public class Produto {
    private int codigo;
    private String nome;
    private double valorVenda;

    public Produto(int codigo, String nome, double valorVenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorVenda = valorVenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getvalorVenda() {
        return valorVenda;
    }
}
