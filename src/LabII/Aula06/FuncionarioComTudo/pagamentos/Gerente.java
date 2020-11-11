package LabII.Aula06.FuncionarioComTudo.pagamentos;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 1.25;
    }

}
