package LabII.Aula11.ExemploAPIFilas.estruturas.exemplos;

public class FilaComArrayTeste {

    public static void main(String[] args) {
        FilaComArray<String> nomes = new FilaComArray<>();

        verificaSeEstaVazia(nomes);
        System.out.println("inserindo 4 pessoas");
        nomes.enfileira("Guilherme");
        nomes.enfileira("Joao");
        nomes.enfileira("Maria");
        nomes.enfileira("Silvio");

        System.out.println("Tamanho da fila: " + nomes.getTamanho());
        verificaSeEstaVazia(nomes);

        System.out.println("Qual o primeiro elemento a sair da fila? " + nomes.espia());

        System.out.println(nomes.desinfileira());
        System.out.println(nomes.desinfileira());
        System.out.println(nomes.desinfileira());
        System.out.println(nomes.desinfileira());

        verificaSeEstaVazia(nomes);

        System.out.println("Tentando tirar da fila que n�o tem ningu�m...");
        nomes.desinfileira();

    }

    private static void verificaSeEstaVazia(FilaComArray<String> nomes) {
        System.out.println("Fila est� vazia? " + nomes.estaVazia());
    }
}
