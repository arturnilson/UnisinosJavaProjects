package LabII.Laboratorio5_ListaChamadasAgendaContatos.listas;

import java.util.ArrayList;
import java.util.List;

import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.Chamada;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.Contato;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.EstruturaVaziaException;

public class ListaChamadas {
    private List<Chamada> listaChamadas;
    private ListaContatos listaContatos;

    public ListaChamadas(ListaContatos lc) {
        this.listaContatos = lc;
        listaChamadas = new ArrayList<>();
    }

    public void adiciona(int numero) {
        String contatoChamada = this.verificaNumeroAgenda(numero);

        listaChamadas.add(new Chamada(numero, contatoChamada));
        System.out.println("Chamada perdida de: " + contatoChamada + " -> " + numero);
    }

    private String verificaNumeroAgenda(int numero) {
        String nomeContato = "Número Desconhecido";
        List<Contato> contatos = listaContatos.getListaContatos();

        for (int indx = 0; indx < contatos.size(); indx++) {
            if (numero == contatos.get(indx).getTelefone()) {
                nomeContato = contatos.get(indx).getNome();
            }
        }

        return nomeContato;
    }

    public void mostrarChamadas() {
        Object[] chamadas = listaChamadas.toArray();

        if (chamadas.length == 0) {
            throw new EstruturaVaziaException("Nenhuma chamada registrada.");
        }

        System.out.println("----=== Chamadas Não Atendidas ===----\n");

        for (int indx = 0; indx < chamadas.length; indx++) {
            Chamada chamada = (Chamada) chamadas[indx];

            System.out.print((indx + 1) + " => \t" + chamada.getContato() + " - ");
            System.out.println(chamada.getNumero());
        }
        System.out.println();
    }

    public void excluirChamadas() {
        listaChamadas.clear();
        System.out.println("Chamadas não atendidas excluidas.\n");
    }
}
