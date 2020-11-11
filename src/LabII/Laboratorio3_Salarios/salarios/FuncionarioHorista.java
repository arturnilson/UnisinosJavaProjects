package LabII.Laboratorio3_Salarios.salarios;

public class FuncionarioHorista extends Funcionario {
    private double salario;
    private double horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, double salario, double horasTrabalhadas) {
        super(nome, cpf);
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calculaSalario() {
        double calculoSalario = 0;

        if (horasTrabalhadas < 40) {
            calculoSalario = salario * horasTrabalhadas;
        } else {
            calculoSalario = 40 * salario + (horasTrabalhadas - 40) * salario * 1.5;
        }

        return calculoSalario;
    }

}
