package ProgII.Aula01.ContaPoupanca;

public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void retira(double valor) {
        if (saldo >= 0 && saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor retirado: " + valor);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultaSaldo() {
        System.out.println("Saldo da conta " + numero + " é: " + saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }
}
