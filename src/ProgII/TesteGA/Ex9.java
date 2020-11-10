package ProgII.TesteGA;

import java.util.Arrays;

public class Ex9 {
    public int pesquisaSequencialOrdenada(int[] array, int arg) {
        System.out.println("\n----===== Pesquisa Sequencial Ordenada =====----\n");
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Valor procurado: " + arg);
        System.out.println();

        for (int i = 0; (i < array.length) && (array[i] <= arg); i++) {
            System.out.println("Verificando posição [" + i + "] valor: " + array[i]);
            if (array[i] == arg) {
                System.out.println("Valor " + arg + " encontrado na posição: " + i);
                return i;
            }
        }
        System.out.println("Valor não localizado no vetor.");
        return -1;
    }
}
