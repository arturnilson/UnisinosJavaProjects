package LabII.Laboratorio4_VacinaCovid.gerenciador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import LabII.Laboratorio4_VacinaCovid.pacientes.Paciente;

public class CovidQueue {
    private PriorityQueue<Paciente> fila;
    private Comparator<Paciente> comparadorIdade;
    private List<Paciente> listaVacinados;

    public CovidQueue() {
        comparadorIdade = new PacienteIdadeComparator();
        fila = new PriorityQueue<Paciente>(comparadorIdade);
        listaVacinados = new ArrayList<Paciente>();
    }

    public void addPaciente(String nome, int idade) {
        fila.add(new Paciente(nome, idade));

        System.out.println("Paciente: " + nome + " adicionado(a) na fila\n");
    }

    public void vacinarPaciente() {
        if (this.isEmpty()) {
            throw new EstruturaVaziaException("Fila está vazia.");
        }

        Paciente paciente = fila.poll();
        listaVacinados.add(paciente);

        System.out.println("Paciente Vacinado!");
        System.out.print(paciente.getIdade() + " - ");
        System.out.println(paciente.getNome());
        System.out.println();
    }

    public void next() {
        if (this.isEmpty()) {
            throw new EstruturaVaziaException("Fila está vazia.");
        }

        Paciente paciente = fila.peek();

        System.out.println("Próximo Paciente: ");
        System.out.print(paciente.getIdade() + " - ");
        System.out.println(paciente.getNome());
        System.out.println();
    }

    public void getPacientesFila() {
        if (this.isEmpty()) {
            throw new EstruturaVaziaException("Fila está vazia.");
        }

        System.out.println("Pacientes aguardando vacinação: ");
        this.showPacientes(fila.toArray());
    }

    public void getPacientesVacinados() {
        if (listaVacinados.size() == 0) {
            throw new EstruturaVaziaException("Lista está vazia.");
        }

        System.out.println("Pacientes vacinados: ");
        this.showPacientes(listaVacinados.toArray());
    }

    private void showPacientes(Object[] arrayPacientes) {
        for (int indx = 0; indx < arrayPacientes.length; indx++) {
            Paciente paciente = (Paciente) arrayPacientes[indx];

            System.out.print(paciente.getIdade() + " - ");
            System.out.println(paciente.getNome());
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return fila.size() == 0;
    }

}
