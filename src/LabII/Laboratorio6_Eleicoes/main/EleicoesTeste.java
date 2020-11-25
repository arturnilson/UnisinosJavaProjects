package LabII.Laboratorio6_Eleicoes.main;

/*
 *   Artur Nilson
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;
import LabII.Laboratorio6_Eleicoes.gerenciador.Eleicoes;

public class EleicoesTeste {
    public static void main(String[] args) {
        Eleicoes el = new Eleicoes();
        Candidato candidato = new Candidato("Polvo", "PCdoQ", 65, 254);
        Candidato candidato1 = new Candidato("Enéias", "PaV", 55, 159);
        Candidato candidato2 = new Candidato("Hulk", "PaCUMÊ", 47, 198);
        Candidato candidato3 = new Candidato("Epson", "PSTE", 58, 86);
        Candidato candidato4 = new Candidato("Bozo", "PLUA", 35, 75);

        el.registraCandidato(candidato, candidato1, candidato2, candidato3, candidato4);

        System.out.println("----==== MAIS JOVEM ====----");
        ArrayList<Candidato> listAuxiliar = el.ordenaCandidatoMaisJovem();
        mostraList(el, listAuxiliar);
        System.out.println();

        System.out.println("----==== MAIS VELHO ====----");
        ArrayList<Candidato> listAuxiliar2 = el.ordenaCandidatoMaisVelho();
        mostraList(el, listAuxiliar2);
        System.out.println();

        System.out.println("----==== MAIS VOTADO ====----");
        ArrayList<Candidato> listAuxiliar3 = el.ordenaCandidatoMaisVotado();
        mostraList(el, listAuxiliar3);
        System.out.println();

        System.out.println("----==== MENOS VOTADO ====----");
        ArrayList<Candidato> listAuxiliar4 = el.ordenaCandidatoMenosVotado();
        mostraList(el, listAuxiliar4);
        System.out.println();

        System.out.println("----==== MÉDIA VOTOS CANDIDATO ====----");

        ArrayList<Candidato> listAuxiliar5 = el.getListEleicoes();
        mostraMedia(el, listAuxiliar5);

        System.out.println("----==== TOTAL DE VOTOS ====----");
        System.out.println("Total: " + el.totalVotosRecebidos());

    }

    private static void mostraList(Eleicoes el, ArrayList<Candidato> listAuxiliar) {
        int index = 0;
        for (Candidato cand : listAuxiliar) {
            if (index == 0) {
                System.out.println("--------------------------------");
                System.out.println("Nome\tPartido\tIdade\tVotos");
                System.out.println("--------------------------------");
            }
            System.out.println(el.toString(cand));
            index++;
        }
    }

    private static void mostraMedia(Eleicoes el, ArrayList<Candidato> listAuxiliar) {
        NumberFormat f = new DecimalFormat("#.00");
        for (Candidato cand : listAuxiliar) {
            System.out.println(cand.getNome() + "\t" + cand.getPartido() + "\t"
                    + f.format(el.mediaVotosPorCandidato(cand)) + " %");
        }
    }
}
