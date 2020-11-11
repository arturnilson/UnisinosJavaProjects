package LabII.Aula11.ExemploAPIFilas.estruturas.exemplos;

// Fila usando array na implementação
public class FilaComArray<E> {
    private E[] dados;
    private int primeiro;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public FilaComArray() {
        dados = (E[]) (new Object[1]);
        tamanho = 0;
        primeiro = 0;
    }

    public void enfileira(E elemento) {
        if (estaCheia())
            amplia();
        dados[(primeiro + tamanho) % dados.length] = elemento;
        tamanho++;
    }

    public E desinfileira() {
        if (estaVazia())
            throw new EstruturaVaziaException("Fila est� vazia...");

        E resultado = dados[primeiro];
        primeiro = (primeiro + 1) % dados.length;
        tamanho--;

        return resultado;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    private void amplia() {
        @SuppressWarnings("unchecked")
        E[] novaFila = (E[]) (new Object[dados.length * 2]);
        for (int x = 0; x < dados.length; x++)
            novaFila[x] = dados[(primeiro + x) % dados.length];

        dados = novaFila;
        primeiro = 0;
    }

    private boolean estaCheia() {
        return tamanho == dados.length;
    }

    public int getTamanho() {
        return tamanho;
    }

    public E espia() {
        return dados[primeiro];
    }
}
