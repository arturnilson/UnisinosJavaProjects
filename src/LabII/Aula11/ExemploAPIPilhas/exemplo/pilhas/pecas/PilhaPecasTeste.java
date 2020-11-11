package LabII.Aula11.ExemploAPIPilhas.exemplo.pilhas.pecas;

public class PilhaPecasTeste {

    public static void main(String[] args) {
        PilhaPecas pilha = new PilhaPecas();

        Peca p1 = new Peca("cilindro");
        Peca p2 = new Peca("rotor");
        Peca p3 = new Peca("helice");
        Peca p4 = new Peca("parafuso");

        verificaSeEstaVazia(pilha);

        System.out.println("\nInserindo pe�as...");
        pilha.insere(p1);
        pilha.insere(p2);
        pilha.insere(p3);

        verificaSeEstaVazia(pilha);

        System.out.println("\nMostrando a maquina...");
        System.out.println(pilha.toString());

        System.out.println("\nEspiando...");
        Peca peca = pilha.espia();
        System.out.println(peca.getNome());

        System.out.println("\nRemovendo pecas...");
        pilha.remove();
        pilha.remove();
        pilha.remove();

        verificaSeEstaVazia(pilha);

        System.out.println("Inserindo pecas com insere especial...");
        pilha.insere(p1, p2, p3, p4);
        System.out.println(pilha.toString());

    }

    private static void verificaSeEstaVazia(PilhaPecas pilha) {
        System.out.print("Pilha est� fazia? ");
        System.out.println(pilha.estaVazia());
    }
}
