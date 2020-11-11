package LabII.Aula11.ExemploAPIPilhas.exemplo.pilhas.pecas;

import java.util.LinkedList;
import java.util.List;

public class PilhaPecas {
    private List<Peca> pecas;

    public PilhaPecas() {
        pecas = new LinkedList<>();
    }

    public void insere(Peca peca) {
        pecas.add(peca);
    }

    public void insere(Peca... maquina) {
        for (Peca peca : maquina) {
            pecas.add(peca);
        }
    }

    public Peca remove() {
        return pecas.remove(pecas.size() - 1);
    }

    public boolean estaVazia() {
        return pecas.size() == 0;
    }

    public Peca espia() {
        return pecas.get(pecas.size() - 1);
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[\n");
        for (int x = pecas.size() - 1; x >= 0; x--) {
            Peca peca = pecas.get(x);
            string.append(peca.getNome() + "\n");
        }
        string.append("]");

        return string.toString();
    }
}
