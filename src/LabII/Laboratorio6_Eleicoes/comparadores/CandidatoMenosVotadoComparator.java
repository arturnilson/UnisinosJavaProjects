package LabII.Laboratorio6_Eleicoes.comparadores;

/*
 *   Artur Nilson
 */

import java.util.Comparator;

import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;

public class CandidatoMenosVotadoComparator implements Comparator<Candidato> {
    @Override
    public int compare(Candidato candidato1, Candidato candidato2) {
        if (candidato1.getVotos() > candidato2.getVotos()) {
            return 1;
        } else {
            return -1;
        }
    }
}