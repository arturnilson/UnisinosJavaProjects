package LabII.ExercicioConceitosOO;

public class Conta {
    private double saldo = 0.0;
    private String numero;

    public Conta(String nome) {
        this.numero = nome;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        try {
            double aux = getSaldo() - valor;

            if (aux < 0) {
                throw new Exception();
            }

            this.saldo -= valor;
        } catch (Exception e) {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Saldo da conta é: " + getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
