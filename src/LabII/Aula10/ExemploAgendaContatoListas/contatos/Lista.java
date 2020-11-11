package LabII.Aula10.ExemploAgendaContatoListas.contatos;

import java.util.Arrays;

// Implementacao basica de uma lista, usando arrays
public class Lista<T> {
    private static final int TAM_VETOR = 10;
    private T[] elementos;
    private int totalElementos;

    @SuppressWarnings("unchecked")
    public Lista() {
        elementos = (T[]) new Object[TAM_VETOR];
        totalElementos = 0;
    }

    public void adiciona(T elemento) {
        aumentaEspaco();
        elementos[totalElementos] = elemento;
        totalElementos++;
    }

    private void aumentaEspaco() {
        if (totalElementos == elementos.length) {
            @SuppressWarnings("unchecked")
            T[] novoArray = (T[]) new Object[elementos.length * 2];
            for (int x = 0; x < elementos.length; x++) {
                novoArray[x] = elementos[x];
            }
            elementos = novoArray;
        }
    }

    public void adiciona(int posicao, T elemento) {
        aumentaEspaco();
        // if (!existeElementoNa(posicao)) {
        // throw new IllegalArgumentException("posicao invalida...");
        // }

        for (int x = totalElementos - 1; x >= posicao; x -= 1) {
            elementos[x + 1] = elementos[x];
        }

        elementos[posicao] = elemento;
        totalElementos++;
    }

    public T retorna(int posicao) {
        if (!existeElementoNa(posicao)) {
            throw new IllegalArgumentException("posicao invalida...");
        }
        return elementos[posicao];
    }

    private boolean existeElementoNa(int posicao) {
        return posicao >= 0 && posicao < totalElementos;
    }

    public void remove(int posicao) {
        if (!estaOcupada(posicao)) {
            throw new IllegalArgumentException("posicao invalida...");
        }

        for (int x = posicao; x < totalElementos - 1; x++) {
            elementos[x] = elementos[x + 1];
        }

        totalElementos--;
    }

    private boolean estaOcupada(int posicao) {
        return existeElementoNa(posicao);
    }

    public boolean existe(T elemento) {
        for (int x = 0; x < totalElementos; x++) {
            if (elemento.equals(elementos[x])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalElementos;
    }

    public String toString() {
        return Arrays.toString(elementos);
    }
}
