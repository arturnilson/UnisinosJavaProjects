package LabII.Aula06.FuncionarioComInterface.testes;

import LabII.Aula06.FuncionarioComInterface.pagamentos.ControleBonificacoes;
import LabII.Aula06.FuncionarioComInterface.pagamentos.Funcionario;
import LabII.Aula06.FuncionarioComInterface.pagamentos.Gerente;
import LabII.Aula06.FuncionarioComInterface.pagamentos.Operador;

public class ControleBonificacoesTeste {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("Mariana", "465498712", 6000);
        Funcionario o1 = new Operador("João", "1234567", 3000);

        System.out.println("Bonificação (Gerente): " + g1.getBonificacao());
        System.out.println("Bonificação (Operador): " + o1.getBonificacao());

        ControleBonificacoes cb = new ControleBonificacoes();
        cb.registraBonificacao(g1);
        cb.registraBonificacao(o1);

        System.out.println("Total de Bonificações: " + cb.getTotalBonificacoes());

    }
}
