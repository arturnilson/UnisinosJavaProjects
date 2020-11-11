package LabII.Aula08.ExemploListaGenerica.estruturas;

public class Lista<T> {
    private static final int MAXIMO_ELEMENTOS = 10;
    private T[] lista;
    private int numeroElementos = 0;

    public Lista(int tamanhoLista) {
        lista = (T[]) new Object[tamanhoLista];
    }

    public Lista() {
        this(MAXIMO_ELEMENTOS);
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!EhPosicaoValida(posicao)) {
            return false;
        }

        if (lista[posicao] == null) {
            numeroElementos++;
        }

        lista[posicao] = elemento;
        return true;
    }

    public boolean adiciona(T elemento) {
        if (listaCheia()) {
            return false;
        }
        lista[numeroElementos] = elemento;
        numeroElementos++;

        return true;
    }

    public int numeroElementos() {
        return numeroElementos;
    }

    private boolean listaCheia() {
        return numeroElementos == lista.length;
    }

    private boolean EhPosicaoValida(int posicao) {
        return posicao >= 0 && posicao < lista.length;
    }

    public boolean existe(T elemento) {
        for (int indx = 0; indx < lista.length; indx++) {
            T t = lista[indx];
            if (t != null && t.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public T pesquisa(int posicao) {
        T tarefa = null;
        if (EhPosicaoValida(posicao)) {
            tarefa = lista[posicao];
        }

        return tarefa;
    }

    public int pesquisa(T elemento) {
        int posicao = -1;

        for (int indx = 0; indx < lista.length; indx++) {
            T t = lista[indx];
            if (t != null && t.equals(elemento)) {
                posicao = indx;
                break;
            }
        }
        return posicao;
    }

    public boolean remove(int posicao) {
        boolean removeu = false;

        if (EhPosicaoValida(posicao) && pesquisa(posicao) != null) {
            lista[posicao] = null;
            removeu = true;
            numeroElementos--;
        }

        return removeu;
    }

}
