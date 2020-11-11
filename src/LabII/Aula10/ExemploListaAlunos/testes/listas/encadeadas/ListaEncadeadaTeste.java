package LabII.Aula10.ExemploListaAlunos.testes.listas.encadeadas;

import LabII.Aula10.ExemploListaAlunos.estrutura.listas.encadeadas.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adiciona("Guilherme");
        lista.adiciona("Joao");
        lista.adiciona("Juliana");

        System.out.println("Mostrando a lista...\n" + lista);

        lista.adiciona(0, "Maria");
        System.out.println("Adicionando a Maria no inicio da lista...\n" + lista);

        System.out.println("Tamanho da lista...\n" + lista.tamanho());

        System.out.println("Retonando elemento da posicao 1...\n" + lista.retorna(1));

        lista.remove(2);
        System.out.println("Removendo elemento da posicao 2...\n" + lista);

        System.out.println("Verificando se contem o Guilherme?\n");
        System.out.println(lista.contem("Guilherme"));
    }
}
