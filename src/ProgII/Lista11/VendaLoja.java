package ProgII.Lista11;

/*
    Artur Nilson
*/

public class VendaLoja {
    private String loja;
    private String uf;
    private int qtde;
    private double vlrVenda;

    public VendaLoja(String loja, String uf, int qtde, double vlrVenda) {
        this.loja = loja;
        this.uf = uf;
        this.qtde = qtde;
        this.vlrVenda = vlrVenda;
    }

    public String getLoja() {
        return loja;
    }

    public String getUf() {
        return uf;
    }

    public int getQtde() {
        return qtde;
    }

    public double getVlrVenda() {
        return vlrVenda;
    }

    public int somaQtde(int quantidade) {
        return qtde += quantidade;
    }

    public double somaValorVenda(double valor) {
        return vlrVenda += valor;
    }

}
