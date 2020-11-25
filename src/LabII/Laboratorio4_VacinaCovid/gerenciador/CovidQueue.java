package LabII.Laboratorio4_VacinaCovid.gerenciador;

/*
 *   Artur Nilson
 */

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
    }

    public Paciente vacinarPaciente() {
        if (fila.isEmpty()) {
            throw new EstruturaVaziaException("Fila está vazia.");
        }

        Paciente paciente = fila.poll();
        listaVacinados.add(paciente);

        return paciente;
    }

    public Paciente next() {
        if (fila.isEmpty()) {
            throw new EstruturaVaziaException("Fila está vazia.");
        }

        Paciente paciente = fila.peek();

        return paciente;
    }

    public PriorityQueue<Paciente> getPacientesFila() {
        if (fila.isEmpty()) {
            throw new EstruturaVaziaException("Fila está vazia.");
        }
        PriorityQueue<Paciente> filaAux = new PriorityQueue<>(fila);

        return filaAux;
    }

    public List<Paciente> getPacientesVacinados() {
        if (listaVacinados.isEmpty()) {
            throw new EstruturaVaziaException("Lista está vazia.");
        }

        List<Paciente> listaAux = new ArrayList<Paciente>(listaVacinados);

        return listaAux;
    }
}
