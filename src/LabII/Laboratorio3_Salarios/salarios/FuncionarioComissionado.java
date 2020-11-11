package LabII.Laboratorio3_Salarios.salarios;

public class FuncionarioComissionado extends Funcionario {
    private double taxaComissao;
    private double vendasBrutas;

    public FuncionarioComissionado(String nome, String cpf, double taxaComissao, double vendasBrutas) {
        super(nome, cpf);
        this.taxaComissao = taxaComissao;
        this.vendasBrutas = vendasBrutas;
    }

    public double getRendimentos() {
        return getTaxaComissao() * getVendasBrutas();
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

}
