package LabII.Aula10.ExemploAgendaContatoListas.testes;

import LabII.Aula10.ExemploAgendaContatoListas.contatos.Contato;
import LabII.Aula10.ExemploAgendaContatoListas.contatos.Lista;

public class AgendaTeste {

    public static void main(String[] args) {
        Lista<Contato> agenda = new Lista<>();

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
        agenda.adiciona(3, c4);

        mostraNumeroContatos(agenda);

        System.out.println("\n--->Lista todos os contatos...");
        for (int x = 0; x < agenda.tamanho(); x++) {
            Contato c = agenda.retorna(x);
            imprimeContato(c);
        }

        System.out.println("\n--->Busca um contato especifico...");
        Contato c = agenda.retorna(0);
        imprimeContato(c);

        System.out.println("\n--->Excluindo um contato especifico...");
        agenda.remove(0);

        mostraNumeroContatos(agenda);
    }

    private static void mostraNumeroContatos(Lista<Contato> agenda) {
        System.out.print("\n--->Total de contatos: ");
        System.out.println(agenda.tamanho());
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
