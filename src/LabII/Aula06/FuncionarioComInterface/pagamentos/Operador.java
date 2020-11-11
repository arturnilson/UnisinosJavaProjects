package LabII.Aula06.FuncionarioComInterface.pagamentos;

public class Operador implements Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Operador(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double getBonificacao() {
        return salario * 1.10;
    }
}
