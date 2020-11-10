package ProgII.TesteGA;

import java.util.Arrays;

public class Ex8 {
    public int pesquisaBinaria(int[] tab, int arg) {
        System.out.println("\n----===== Pesquisa Binaria =====----\n");
        System.out.println("Array original: " + Arrays.toString(tab));
        System.out.println("Valor procurado: " + arg);
        System.out.println();

        int inf = 0;
        int sup = tab.length - 1;
        while (inf <= sup) {
            int med = (inf + sup) / 2;
            System.out.println("Média " + med + " Elemento: " + tab[med]);
            if (arg == tab[med]) {
                System.out.println("A posição do valor " + arg + " é " + med);
                return med;
            } else if (arg < tab[med]) {
                System.out.println("Procura na 1ª metade.");
                sup = med - 1;
            } else {
                System.out.println("Procura na 2ª metade.");
                inf = med + 1;
            }
        }
        System.out.println("Valor não encontrado no array.");
        return -1;
    }
}
