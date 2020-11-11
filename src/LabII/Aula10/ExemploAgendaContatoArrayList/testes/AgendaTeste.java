package LabII.Aula10.ExemploAgendaContatoArrayList.testes;

import LabII.Aula10.ExemploAgendaContatoArrayList.contatos.Agenda;
import LabII.Aula10.ExemploAgendaContatoArrayList.contatos.Contato;

public class AgendaTeste {

    public static void main(String[] args) {
        Contato c1 = new Contato("Guilherme", "348394839", "gslacerda@unisinos.br");
        Contato c2 = new Contato("Joao", "54958495094", "joao@unisinos.br");
        Contato c4 = new Contato("Maria", "56568590", "maria@unisinos.br");
        Contato c5 = new Contato("Paula", "6950695", "paula@unisinos.br");
        Contato c6 = new Contato("Pedro", "586956859695", "pedro@unisinos.br");

        Agenda agenda = new Agenda();

        System.out.println(agenda.tamanho()); // 0

        agenda.adiciona(c1);

        System.out.println(agenda.tamanho()); // 1

        agenda.adiciona(c2, c4, c5);

        System.out.println(agenda.tamanho()); // 4

        System.out.println(agenda.remove(c4)); // true
        System.out.println(agenda.remove(c6)); // false

        System.out.println(agenda.retorna(1)); // Joao

        // System.out.println(agenda.retorna(50)); // Joao

        System.out.println(agenda.existe(c6)); // Pedro: false

    }
}
