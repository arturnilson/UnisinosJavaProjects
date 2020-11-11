package LabII.Aula06.FuncionarioComTudo.pagamentos;

public class Operador extends Funcionario {

    public Operador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 1.10;
    }

}
