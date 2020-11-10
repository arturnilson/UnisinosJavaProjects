package ProgII.Aula01.ContaPoupanca;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(int numero, double taxaDeRendimento) {
        super(numero);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void creditaRendimento() {
        super.deposita(super.getSaldo() * taxaDeRendimento);
        System.out.println("Saldo após rendimento: " + super.getSaldo());
    }

}
