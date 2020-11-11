package LabII.Laboratorio3_Salarios.testes;

import LabII.Laboratorio3_Salarios.salarios.FuncionarioAssalariado;
import LabII.Laboratorio3_Salarios.salarios.FuncionarioComissionado;
import LabII.Laboratorio3_Salarios.salarios.FuncionarioComissionadoBaseSalario;
import LabII.Laboratorio3_Salarios.salarios.FuncionarioHorista;

public class FuncionarioTeste {
    public static void main(String[] args) {
        FuncionarioComissionado c1 = new FuncionarioComissionado("Joao", "123123", 0.25, 2500);
        FuncionarioAssalariado a1 = new FuncionarioAssalariado("Maria", "1231231", 1500);
        FuncionarioComissionadoBaseSalario b1 = new FuncionarioComissionadoBaseSalario("Marcia", "11111", 0.25, 110,
                500);
        FuncionarioHorista h1 = new FuncionarioHorista("Gerson", "000000", 150, 45);

        System.out.println("-- Comissionado --");
        System.out.println(c1.getNome());
        System.out.println("Rendimentos: " + c1.getRendimentos());
        System.out.println();

        System.out.println("-- Comissionado com Salário Base --");
        System.out.println(b1.getNome());
        System.out.println("Cpf: " + b1.getCpf());
        System.out.println("Rendimentos: " + b1.getRendimentos());
        System.out.println();

        System.out.println("-- Horista --");
        System.out.println(h1.getNome());
        System.out.println("Cpf: " + h1.getCpf());
        System.out.println("Salário Horista: " + h1.calculaSalario());
        System.out.println();

        System.out.println("-- Assalariado --");
        System.out.println(a1.getNome());
        System.out.println("Cpf: " + a1.getCpf());
        System.out.println("Salário: " + a1.getSalario());

    }
}
