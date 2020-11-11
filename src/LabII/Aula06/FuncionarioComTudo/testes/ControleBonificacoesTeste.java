package LabII.Aula06.FuncionarioComTudo.testes;

import LabII.Aula06.FuncionarioComTudo.pagamentos.Bonificavel;
import LabII.Aula06.FuncionarioComTudo.pagamentos.ControleBonificacoes;
import LabII.Aula06.FuncionarioComTudo.pagamentos.Gerente;
import LabII.Aula06.FuncionarioComTudo.pagamentos.Operador;
import LabII.Aula06.FuncionarioComTudo.pagamentos.Socio;

public class ControleBonificacoesTeste {
    public static void main(String[] args) {
        Bonificavel g1 = new Gerente("Mariana", "465498712", 6000);
        Bonificavel o1 = new Operador("João", "1234567", 3000);
        Bonificavel s1 = new Socio(20000);

        System.out.println("Bonificação (Gerente): " + g1.getBonificacao());
        System.out.println("Bonificação (Operador): " + o1.getBonificacao());
        System.out.println("Bonificação (Sócio): " + s1.getBonificacao());

        ControleBonificacoes cb = new ControleBonificacoes();
        cb.registraBonificacao(g1);
        cb.registraBonificacao(o1);
        cb.registraBonificacao(s1);

        System.out.println("Total de Bonificações: " + cb.getTotalBonificacoes());
    }
}