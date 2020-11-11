package LabII.Aula11.ExemploAPIPilhas.exemplo.pilhas.pecas;

import java.util.ListIterator;
import java.util.Stack;

public class APIStackTeste {

    public static void main(String[] args) {

        Stack<Peca> pecas = new Stack<>();

        Peca p1 = new Peca("cilindro");
        Peca p2 = new Peca("rotor");
        Peca p3 = new Peca("helice");
        Peca p4 = new Peca("parafuso");

        System.out.println("\nInserindo pe�as...");
        pecas.push(p1);
        pecas.push(p2);
        pecas.push(p3);
        pecas.push(p4);

        verificaSeEstaVazia(pecas);

        System.out.println("\nMostrando a pilha...");
        ListIterator<Peca> maquina = pecas.listIterator(pecas.size());
        while (maquina.hasPrevious()) {
            Peca peca = maquina.previous();
            System.out.println(peca.getNome());
        }

        System.out.println("\nEspiando...");
        Peca peca = pecas.peek();
        System.out.println(peca.getNome());

        System.out.println("\nRemovendo as pe�as...");
        pecas.pop();
        pecas.pop();
        pecas.pop();

        verificaSeEstaVazia(pecas);
    }

    private static void verificaSeEstaVazia(Stack<Peca> pilha) {
        System.out.print("Pilha est� fazia? ");
        System.out.println(pilha.isEmpty());
    }
}
