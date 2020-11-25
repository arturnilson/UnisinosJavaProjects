package LabII.Laboratorio5_ListaChamadasAgendaContatos.testes;

/*
 *   Artur Nilson
 */

import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.Contato;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.listas.ListaChamadas;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.listas.ListaContatos;

public class ListaContatosTest {
    public static void main(String[] args) {
        ListaContatos lc = new ListaContatos();
        ListaChamadas lchamadas = new ListaChamadas(lc);

        // lc.adiciona(new Contato("Joao", 1231123));
        // lc.adiciona(new Contato("Maria", 2222222));
        // lc.adiciona(new Contato("Julia", 3333333));
        // lc.adiciona(new Contato("Caio", 44444444));
        // lc.adiciona(new Contato("Marcos", 555555));
        lc.mostrarContatos();

        lc.remove(2);
        lc.mostrarContatos();

        lchamadas.adiciona(4444444);
        lchamadas.adiciona(555555);
        lchamadas.adiciona(1121131);

        lchamadas.mostrarChamadas();
        lchamadas.excluirChamadas();
        lchamadas.mostrarChamadas();

    }
}
