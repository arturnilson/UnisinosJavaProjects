package LabII.Aula10.ExemploAgendaContatoArrays.contatos;

public class Agenda {
    private static final int MAXIMO_CONTATOS = 10;
    private Contato[] agenda;
    private int numeroElementos;

    public Agenda() {
        agenda = new Contato[MAXIMO_CONTATOS];
        numeroElementos = 0;
    }

    public void adiciona(Contato contato) {
        if (posicaoEhValida())
            agenda[numeroElementos] = contato;
        numeroElementos++;
    }

    private boolean posicaoEhValida() {
        return numeroElementos >= 0 && numeroElementos < MAXIMO_CONTATOS;
    }

    public void adiciona(int posicao, Contato contato) {
        if (posicaoEhValida()) {
            // Se nao existe nenhum contato naquela posicao
            if (agenda[posicao] == null)
                numeroElementos++; // eh uma adicao
            // Se existe, ele simplesmente altera pelo novo contato
            agenda[posicao] = contato;
        }
    }

    public void remove(int posicao) {
        if (posicaoEhValida()) {
            if (agenda[posicao] != null) {// tem um objeto na posicao
                agenda[posicao] = null;
                numeroElementos--;
            }
        }
    }

    public Contato busca(int posicao) {
        if (posicaoEhValida()) {
            return agenda[posicao];
        }
        return null; // Caso seja uma posicao invalida, retornara null
    }

    public int getNumeroContatos() {
        return numeroElementos;
    }

    public Contato[] getAgenda() {
        return agenda;
    }
}
