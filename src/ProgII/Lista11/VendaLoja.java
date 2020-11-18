package ProgII.Lista11;

public class VendaLoja {
    private String loja;
    private String uf;
    private int qtde;
    private double vlrVenda;
    private int notaFiscal;

    public VendaLoja(String loja, String uf, int qtde, double vlrVenda, int notaFiscal) {
        this.loja = loja;
        this.uf = uf;
        this.qtde = qtde;
        this.vlrVenda = vlrVenda;
        this.notaFiscal = notaFiscal;
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

    public int getNotaFiscal() {
        return notaFiscal;
    }

}
