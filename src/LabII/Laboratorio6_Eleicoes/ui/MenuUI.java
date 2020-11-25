package LabII.Laboratorio6_Eleicoes.ui;

/*
 *   Artur Nilson
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;
import LabII.Laboratorio6_Eleicoes.exceptions.EmptyListException;
import LabII.Laboratorio6_Eleicoes.gerenciador.Eleicoes;

public class MenuUI {
    private Eleicoes eleicoes;
    private Scanner teclado;

    public MenuUI() {
        eleicoes = new Eleicoes();
        teclado = new Scanner(System.in);
    }

    public void menu() {
        boolean continuar = true;

        do {
            System.out.println(this.getMenu());
            System.out.println("Digite a opção desejada: ");

            if (teclado.hasNextInt()) {
                int t = teclado.nextInt();

                if (t <= 7) {
                    this.escolherOpcao(t);
                } else {
                    continuar = false;
                }
            } else {
                System.out.println("Caracter inválido. Digite um inteiro de 1-6!");
                continuar = false;
            }

        } while (continuar);

    }

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Scanner teclado1 = new Scanner(System.in);

                try {
                    System.out.println("----==== Cadastrar Candidato ====----");
                    System.out.println("Informe o nome: ");
                    String nome = teclado1.nextLine();
                    System.out.println("Informe o partido: ");
                    String partido = teclado1.nextLine();
                    System.out.println("Informe a idade: ");
                    int idade = teclado1.nextInt();
                    System.out.println("Informe os votos: ");
                    int votos = teclado1.nextInt();

                    eleicoes.registraCandidato(new Candidato(nome, partido, idade, votos));
                    System.out.println("Candidado Registrado!");

                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 2:

                try {
                    System.out.println("----==== Candidato Mais Jovem ====----");
                    ArrayList<Candidato> listAuxiliar = eleicoes.ordenaCandidatoMaisJovem();
                    mostraList(eleicoes, listAuxiliar);
                    System.out.println();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 3:
                try {
                    System.out.println("----==== Candidato Mais Velho ====----");
                    ArrayList<Candidato> listAuxiliar2 = eleicoes.ordenaCandidatoMaisVelho();
                    mostraList(eleicoes, listAuxiliar2);
                    System.out.println();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;

            case 4:
                try {
                    System.out.println("----==== Candidato Mais Votado ====----");
                    ArrayList<Candidato> listAuxiliar3 = eleicoes.ordenaCandidatoMaisVotado();
                    mostraList(eleicoes, listAuxiliar3);
                    System.out.println();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;

            case 5:
                try {
                    System.out.println("----==== Candidato Menos Votado ====----");
                    ArrayList<Candidato> listAuxiliar4 = eleicoes.ordenaCandidatoMenosVotado();
                    mostraList(eleicoes, listAuxiliar4);
                    System.out.println();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 6:
                System.out.println("----==== Total de Votos ====----");
                System.out.println("Total: " + eleicoes.totalVotosRecebidos());

                break;

            case 7:
                try {
                    System.out.println("----==== Média de Votos por Candidato ====----");
                    ArrayList<Candidato> listAuxiliar5 = eleicoes.getListEleicoes();
                    mostraMedia(eleicoes, listAuxiliar5);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;
        }
    }

    public String getMenu() {
        return "----==== MENU ELEIÇÕES ====----" + "\n1- Inserir Candidato" + "\n2- Ordenar candidato mais jovem"
                + "\n3- Ordenar candidato mais velho" + "\n4- Ordenar candidato mais votado"
                + "\n5- Ordenar candidato menos votado" + "\n6- Total de votos recebidos"
                + "\n7- Média de votos por candidato" + "\n8- Sair\n\n";
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
        if (listAuxiliar.isEmpty()) {
            throw new EmptyListException("Lista Vazia");
        }

        NumberFormat f = new DecimalFormat("#.00");
        for (Candidato cand : listAuxiliar) {
            System.out.println(cand.getNome() + "\t" + cand.getPartido() + "\t"
                    + f.format(el.mediaVotosPorCandidato(cand)) + " %");
        }
    }
}
