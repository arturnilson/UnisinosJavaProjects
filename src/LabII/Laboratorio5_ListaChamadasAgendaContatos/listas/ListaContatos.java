package LabII.Laboratorio5_ListaChamadasAgendaContatos.listas;

/*
 *   Artur Nilson
 */

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;

import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.Contato;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.EstruturaVaziaException;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.InvalidIndexException;

public class ListaContatos {
    private List<Contato> contatosAgenda;

    public ListaContatos() {
        contatosAgenda = new ArrayList<>();
    }

    public void adiciona(Contato contato) throws InvalidClassException {
        if (!(contato instanceof Contato)) {
            throw new InvalidClassException("Adiciona deve receber classe tipo Contato.");
        }

        contatosAgenda.add(contato);
    }

    public Contato remove(int index) {
        if (index > contatosAgenda.size() - 1) {
            throw new InvalidIndexException("Código inválido.");
        }

        Contato removido = contatosAgenda.remove(index);

        return removido;
    }

    public void mostrarContatos() {
        Object[] contatos = contatosAgenda.toArray();

        if (contatos.length == 0) {
            throw new EstruturaVaziaException("Nenhum contato registrado.");
        }

        System.out.println("----=== Contatos Salvos ===----\n");

        for (int indx = 0; indx < contatos.length; indx++) {
            Contato contato = (Contato) contatos[indx];

            System.out.print(contatosAgenda.indexOf(contato) + " => ");
            System.out.print("\t" + contato.getNome() + " - ");
            System.out.println(contato.getTelefone());
        }
        System.out.println();
    }

    public List<Contato> getListaContatos() {
        return contatosAgenda;
    }
}
