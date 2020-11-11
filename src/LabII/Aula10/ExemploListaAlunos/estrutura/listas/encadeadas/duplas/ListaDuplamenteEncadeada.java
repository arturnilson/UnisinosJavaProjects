package LabII.Aula10.ExemploListaAlunos.estrutura.listas.encadeadas.duplas;

public class ListaDuplamenteEncadeada {
    private Celula primeira;
    private Celula ultima;
    private int totalElementos;

    public void adiciona(Object elemento) {
        // Caso 1: quando a lista esta vazia...
        if (totalElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            // Caso 3: adicionando no final da lista...
            Celula nova = new Celula(elemento);
            ultima.setProxima(nova);
            ultima = nova;
            totalElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        // Adicionando no comeco...
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        }
        // Adicionando no final...
        else if (posicao == totalElementos) { // No fim.
            adiciona(elemento);
        }
        // Adicionando em qualquer posicao...
        else {
            Celula anterior = retornaCelula(posicao - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(elemento, anterior.getProxima());
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            totalElementos++;
        }
    }

    public Object retorna(int posicao) {
        return retornaCelula(posicao).getElemento();
    }

    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (posicao == 0) {
            removeDoComeco();
        } else if (posicao == totalElementos - 1) {
            removeDoFim();
        } else {
            Celula anterior = retornaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            totalElementos--;
        }

    }

    public int tamanho() {
        return totalElementos;
    }

    public boolean contem(Object elemento) {
        Celula atual = primeira;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public void adicionaNoComeco(Object elemento) {
        if (totalElementos == 0) {
            Celula nova = new Celula(elemento);
            primeira = nova;
            ultima = nova;
        } else {
            Celula nova = new Celula(elemento, primeira);
            primeira.setAnterior(nova);
            primeira = nova;
        }
        this.totalElementos++;
    }

    public void removeDoComeco() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        primeira = primeira.getProxima();
        totalElementos--;
        if (totalElementos == 0) {
            ultima = null;
        }
    }

    public void removeDoFim() {
        if (!posicaoOcupada(this.totalElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (totalElementos == 1) {
            removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima = penultima;
            this.totalElementos--;
        }
    }

    public String toString() {
        // Verificando se a Lista est� vazia
        if (totalElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;

        // Percorrendo at� o penultimo elemento.
        for (int i = 0; i < totalElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        // ultimo elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalElementos;
    }

    private Celula retornaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
}
