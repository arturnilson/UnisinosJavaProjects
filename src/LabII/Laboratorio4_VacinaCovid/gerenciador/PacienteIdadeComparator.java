package LabII.Laboratorio4_VacinaCovid.gerenciador;

import java.util.Comparator;

import LabII.Laboratorio4_VacinaCovid.pacientes.Paciente;

public class PacienteIdadeComparator implements Comparator<Paciente> {

    @Override
    public int compare(Paciente paciente1, Paciente paciente2) {
        if (paciente1.getIdade() < paciente2.getIdade()) {
            return 1;
        } else {
            return -1;
        }
    }

}
