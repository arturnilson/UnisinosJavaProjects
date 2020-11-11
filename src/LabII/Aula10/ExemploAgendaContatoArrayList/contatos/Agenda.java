package LabII.Aula10.ExemploAgendaContatoArrayList.contatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> agenda;

    public Agenda() {
        agenda = new ArrayList<>();
    }

    public void adiciona(Contato contato) {
        agenda.add(contato);
    }

    public void adiciona(Contato... contatos) {
        for (Contato contato : contatos) {
            agenda.add(contato);
        }
    }

    public boolean remove(Contato contato) {
        return agenda.remove(contato);
    }

    public Contato retorna(int posicao) {
        return agenda.get(posicao);
    }

    public boolean existe(Contato contato) {
        return agenda.contains(contato);
    }

    public int tamanho() {
        return agenda.size();
    }
}
