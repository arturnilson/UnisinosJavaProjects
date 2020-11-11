package LabII.Aula06.FuncionarioComHeranca.pagamentos;

public class Operador extends Funcionario {

    public Operador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    // Polimorfismo
    @Override
    public double getBonificacao() {
        return getSalario() * 1.10;
    }

}