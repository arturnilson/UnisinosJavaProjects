package LabII.Aula10.ExemploAgendaContatoArrays.testes;

import LabII.Aula10.ExemploAgendaContatoArrays.contatos.Agenda;
import LabII.Aula10.ExemploAgendaContatoArrays.contatos.Contato;

public class AgendaTeste {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Guilherme", "348394839", "gslacerda@unisinos.br");
        Contato c2 = new Contato("Joao", "54958495094", "joao@unisinos.br");
        Contato c4 = new Contato("Maria", "56568590", "maria@unisinos.br");
        Contato c5 = new Contato("Paula", "6950695", "paula@unisinos.br");

        mostraNumeroContatos(agenda);
        System.out.println("--->Adicionando contatos...");
        agenda.adiciona(c1);
        agenda.adiciona(c2);
        agenda.adiciona(c5);

        // adiciona em uma posicao especifica...
        agenda.adiciona(4, c4);

        mostraNumeroContatos(agenda);

        System.out.println("\n--->Lista todos os contatos...");
        Contato[] lista = agenda.getAgenda();
        for (int x = 0; x < lista.length; x++) {
            Contato c = lista[x];
            imprimeContato(c);
        }

        System.out.println("\n--->Busca um contato especifico...");
        Contato c = agenda.busca(0);
        imprimeContato(c);

        System.out.println("\n--->Excluindo um contato especifico...");
        agenda.remove(0);

        mostraNumeroContatos(agenda);
    }

    private static void mostraNumeroContatos(Agenda agenda) {
        System.out.print("\n--->Total de contatos: ");
        System.out.println(agenda.getNumeroContatos());
    }

    public static void imprimeContato(Contato contato) {
        if (contato != null) {
            System.out.println("\nCONTATO");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("e-mail: " + contato.getEmail());
        }
    }
}
