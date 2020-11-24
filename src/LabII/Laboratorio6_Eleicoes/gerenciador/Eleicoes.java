package LabII.Laboratorio6_Eleicoes.gerenciador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import LabII.Laboratorio6_Eleicoes.comparadores.CandidatoMaisJovemComparator;
import LabII.Laboratorio6_Eleicoes.comparadores.CandidatoMaisVelhoComparator;
import LabII.Laboratorio6_Eleicoes.comparadores.CandidatoMaisVotadoComparator;
import LabII.Laboratorio6_Eleicoes.comparadores.CandidatoMenosVotadoComparator;
import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;
import LabII.Laboratorio6_Eleicoes.exceptions.EmptyListException;

public class Eleicoes {
    private ArrayList<Candidato> listEleicoes;
    private int totalVotos = 0;

    public Eleicoes() {
        listEleicoes = new ArrayList<>();
    }

    public void registraCandidato(Candidato candidato) {
        totalVotos += candidato.getVotos();
        listEleicoes.add(candidato);
    }

    public void registraCandidato(Candidato... candidatos) {
        for (Candidato candidato : candidatos) {
            totalVotos += candidato.getVotos();
            listEleicoes.add(candidato);
        }
    }

    public ArrayList<Candidato> ordenaCandidatoMaisJovem() {
        this.validateList();

        Comparator<Candidato> comparadorMaisJovem = new CandidatoMaisJovemComparator();
        ArrayList<Candidato> listAuxiliar = (ArrayList<Candidato>) listEleicoes.clone();

        Collections.sort(listAuxiliar, comparadorMaisJovem);

        return listAuxiliar;

    }

    public ArrayList<Candidato> ordenaCandidatoMaisVelho() {
        this.validateList();

        Comparator<Candidato> comparadorMaisVelho = new CandidatoMaisVelhoComparator();
        ArrayList<Candidato> listAuxiliar = (ArrayList<Candidato>) listEleicoes.clone();

        Collections.sort(listAuxiliar, comparadorMaisVelho);

        return listAuxiliar;
    }

    public ArrayList<Candidato> ordenaCandidatoMaisVotado() {
        this.validateList();

        Comparator<Candidato> comparadorMaisVotado = new CandidatoMaisVotadoComparator();
        ArrayList<Candidato> listAuxiliar = (ArrayList<Candidato>) listEleicoes.clone();

        Collections.sort(listAuxiliar, comparadorMaisVotado);

        return listAuxiliar;
    }

    public ArrayList<Candidato> ordenaCandidatoMenosVotado() {
        this.validateList();

        Comparator<Candidato> comparadorMenosVotado = new CandidatoMenosVotadoComparator();
        ArrayList<Candidato> listAuxiliar = (ArrayList<Candidato>) listEleicoes.clone();

        Collections.sort(listAuxiliar, comparadorMenosVotado);

        return listAuxiliar;
    }

    public int totalVotosRecebidos() {
        return totalVotos;
    }

    public double mediaVotosPorCandidato(Candidato cand) {
        return (double) cand.getVotos() / (double) totalVotos * 100;
    }

    public String toString(Candidato candidato) {
        return candidato.getNome() + "\t" + candidato.getPartido() + "\t" + candidato.getIdade() + "\t"
                + candidato.getVotos();
    }

    public ArrayList<Candidato> getListEleicoes() {
        return listEleicoes;
    }

    public void validateList() {
        if (listEleicoes.isEmpty()) {
            throw new EmptyListException("Não há arquivos para serem ordenados.");
        }
    }

}
