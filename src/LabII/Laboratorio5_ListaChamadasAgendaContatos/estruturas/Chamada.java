package LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas;

public class Chamada {
    private int numero;
    private String contato;

    public Chamada(int numero, String contato) {
        this.contato = contato;
        this.numero = numero;
    }

    public Chamada(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getContato() {
        return contato;
    }
}
