package LabII.Aula11.ExemploAPIPilhas.estrutura.exemplo;

// Fila usando array na implementa��o
public class PilhaComArray<E> {
    private E[] dados;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public PilhaComArray() {
        dados = (E[]) (new Object[1]);
        tamanho = 0;
    }

    public void empilha(E elemento) {
        if (estaCheia())
            amplia();
        dados[tamanho] = elemento;
        tamanho++;
    }

    public E desempilha() {
        if (estaVazia())
            throw new EstruturaVaziaException("Pilha est� vazia...");

        tamanho--;
        return dados[tamanho];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    private void amplia() {
        @SuppressWarnings("unchecked")
        E[] novaFila = (E[]) (new Object[dados.length * 2]);
        for (int x = 0; x < dados.length; x++)
            novaFila[x] = dados[x];

        dados = novaFila;
    }

    private boolean estaCheia() {
        return tamanho == dados.length;
    }

    public int getTamanho() {
        return tamanho;
    }

    public E espia() {
        if (estaVazia())
            throw new EstruturaVaziaException("Pilha est� vazia...");
        return dados[tamanho - 1];
    }
}
