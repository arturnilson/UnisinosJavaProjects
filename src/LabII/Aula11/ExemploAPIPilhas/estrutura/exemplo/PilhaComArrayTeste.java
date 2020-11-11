package LabII.Aula11.ExemploAPIPilhas.estrutura.exemplo;

public class PilhaComArrayTeste {

    public static void main(String[] args) {
        PilhaComArray<String> nomes = new PilhaComArray<>();

        verificaSeEstaVazia(nomes);
        System.out.println("inserindo 4 pessoas");
        nomes.empilha("Guilherme");
        nomes.empilha("Joao");
        nomes.empilha("Maria");
        nomes.empilha("Silvio");

        System.out.println("Tamanho da fila: " + nomes.getTamanho());
        verificaSeEstaVazia(nomes);

        System.out.println("Qual o primeiro elemento a sair da pilha? " + nomes.espia());

        System.out.println(nomes.desempilha());
        System.out.println(nomes.desempilha());
        System.out.println(nomes.desempilha());
        System.out.println(nomes.desempilha());

        verificaSeEstaVazia(nomes);

        System.out.println("Tentando tirar da pilha que n�o tem ningu�m...");

        nomes.desempilha();
    }

    private static void verificaSeEstaVazia(PilhaComArray<String> nomes) {
        System.out.println("Pilha est� vazia? " + nomes.estaVazia());
    }
}
