package LabII.Laboratorio1_Banco.banco;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        System.out.println("Depósito realizado com sucesso.");
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double saldoContaAux = saldo - valor;

        try {
            if (saldoContaAux < 0) {
                throw new IllegalArgumentException("Você não possui saldo suficiente para sacar essa quantia.");
            }
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public String toString() {
        return "Conta: " + this.numero + "\nSaldo atual: R$ " + this.saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
