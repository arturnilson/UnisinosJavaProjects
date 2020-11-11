package LabII.Laboratorio3_Salarios.salarios;

public class FuncionarioAssalariado extends Funcionario {
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String cpf, double salarioSemanal) {
        super(nome, cpf);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalario() {
        return salarioSemanal;
    }

}
