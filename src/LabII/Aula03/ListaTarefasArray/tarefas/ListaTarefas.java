package LabII.Aula03.ListaTarefasArray.tarefas;

public class ListaTarefas {
    private static final int MAXIMO_TAREFAS = 10;
    private Tarefa[] tarefas;
    private int numeroElementos = 0;

    public ListaTarefas() {
        tarefas = new Tarefa[MAXIMO_TAREFAS];
    }

    public ListaTarefas(int tamanhoLista) {
        tarefas = new Tarefa[tamanhoLista];
    }

    public boolean adiciona(int posicao, Tarefa tarefa) {
        if (!EhPosicaoValida(posicao)) {
            return false;
        }

        if (tarefas[posicao] == null) {
            numeroElementos++;
        }

        tarefas[posicao] = tarefa;
        return true;
    }

    public boolean adiciona(Tarefa tarefa) {
        if (listaCheia()) {
            return false;
        }
        tarefas[numeroElementos] = tarefa;
        numeroElementos++;

        return true;
    }

    public int numeroTarefas() {
        return numeroElementos;
    }

    private boolean listaCheia() {
        return numeroElementos == tarefas.length;
    }

    private boolean EhPosicaoValida(int posicao) {
        return posicao >= 0 && posicao < tarefas.length;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public boolean existe(Tarefa tarefa) {
        for (int indx = 0; indx < tarefas.length; indx++) {
            Tarefa t = tarefas[indx];
            if (t != null && t.equals(tarefa)) {
                return true;
            }
        }
        return false;
    }

    public Tarefa pesquisaTarefa(int posicao) {
        Tarefa tarefa = null;
        if (EhPosicaoValida(posicao)) {
            tarefa = tarefas[posicao];
        }

        return tarefa;

    }

    public int pesquisaTarefa(Tarefa tarefa) {
        int posicao = -1;

        for (int indx = 0; indx < tarefas.length; indx++) {
            Tarefa t = tarefas[indx];
            if (t != null && t.equals(tarefa)) {
                posicao = indx;
                break;
            }
        }
        return posicao;
    }

    public boolean removeTarefa(int posicao) {
        boolean removeu = false;

        if (EhPosicaoValida(posicao) && pesquisaTarefa(posicao) != null) {
            tarefas[posicao] = null;
            removeu = true;
            numeroElementos--;
        }

        return removeu;
    }

}
