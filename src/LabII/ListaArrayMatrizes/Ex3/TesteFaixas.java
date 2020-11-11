package LabII.ListaArrayMatrizes.Ex3;

import java.util.Arrays;

public class TesteFaixas {
    public static void main(String[] args) {
        FaixaNotas f = new FaixaNotas();

        int[] notas = new int[10];
        notas[0] = 10;
        notas[1] = 45;
        notas[2] = 67;
        notas[3] = 22;
        notas[4] = 48;
        notas[5] = 100;
        notas[6] = 98;
        notas[7] = 102;
        notas[8] = 80;
        notas[9] = 70;

        String[] grafico = new String[notas.length];
        grafico = f.montaGraficoBarras(notas);

        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("\nRetorno das faixas: ");
        for (int indx = 0; indx < grafico.length; indx++) {
            System.out.println("Nota " + (indx + 1) + ": " + grafico[indx]);
        }
        System.out.println("--------------------------");

    }
}
