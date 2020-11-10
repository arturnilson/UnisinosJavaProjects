package ProgII.Aula04.Lista04;

import java.util.Arrays;

/*
  Artur Nilson
*/

public class MetodosPesquisa {

    public int pesquisaSequencial(int[] array, int arg) {
        System.out.println("\n----===== Pesquisa Sequencial =====----\n");
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Valor procurado: " + arg);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Verificando posição [" + i + "] valor: " + array[i]);
            if (array[i] == arg) {
                System.out.println("Valor " + arg + " encontrado na posição: " + i);
                return i;
            }
        }
        return -1;
    }

    public int pesquisaSequencialOrdenada(int[] array, int arg) {
        System.out.println("\n----===== Pesquisa Sequencial Ordenada Exercício 2 =====----\n");
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
        return -1;
    }

    public int pesquisaBinaria(int[] tab, int arg, String exercicio) {
        System.out.println("\n----===== Pesquisa Binaria " + exercicio + " =====----\n");
        System.out.println("Array original: " + Arrays.toString(tab));
        System.out.println("Valor procurado: " + arg);
        System.out.println();

        int inf = 0;
        int sup = tab.length - 1;
        while (inf <= sup) {
            int med = (inf + sup) / 2;
            System.out.println("Passando pelo valor " + tab[med] + " e comparando com " + arg);
            if (arg == tab[med]) {
                System.out.println("A posição do valor " + arg + " é " + med);
                return med;
            } else if (arg < tab[med])
                sup = med - 1; // procura 1ª metade
            else
                inf = med + 1; // procura 2ª metade
        }
        System.out.println("Valor não encontrado no array.");
        return -1;
    }
}
