package LabII.Laboratorio6_Eleicoes.comparadores;

import java.util.Comparator;

import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;

public class CandidatoIdadeComparator implements Comparator<Candidato> {
    @Override
    public int compare(Candidato candidato1, Candidato candidato2) {
        if (candidato1.getIdade() > candidato2.getIdade()) {
            return 1;
        } else {
            return -1;
        }
    }
}
