package ProgII.Aula04.Lista04;

/*
  Artur Nilson
*/

public class Teste {
    public static void main(String[] args) {
        MetodosOrdenacao mo = new MetodosOrdenacao();

        int[] arrayInt = new int[10];
        arrayInt[0] = 4;
        arrayInt[1] = -3;
        arrayInt[2] = 18;
        arrayInt[3] = 22;
        arrayInt[4] = 5;
        arrayInt[5] = 0;
        arrayInt[6] = 1;
        arrayInt[7] = 47;
        arrayInt[8] = -2;
        arrayInt[9] = 9;

        // Exercício 1
        mo.insertionSort(arrayInt);
        mo.bubbleSort(arrayInt);
        mo.selectionSort(arrayInt);

        MetodosPesquisa mp = new MetodosPesquisa();

        int[] arrayInt2 = new int[13];
        arrayInt2[0] = 2;
        arrayInt2[1] = 5;
        arrayInt2[2] = 9;
        arrayInt2[3] = 12;
        arrayInt2[4] = 15;
        arrayInt2[5] = 20;
        arrayInt2[6] = 22;
        arrayInt2[7] = 26;
        arrayInt2[8] = 30;
        arrayInt2[9] = 45;
        arrayInt2[10] = 87;
        arrayInt2[11] = 92;
        arrayInt2[12] = 100;

        // Exercício 2
        mp.pesquisaSequencialOrdenada(arrayInt2, 87);
        mp.pesquisaBinaria(arrayInt2, 87, "Exercício 2b");

        int[] arrayInt3 = new int[13];
        arrayInt3[0] = 10;
        arrayInt3[1] = 20;
        arrayInt3[2] = 30;
        arrayInt3[3] = 40;
        arrayInt3[4] = 50;
        arrayInt3[5] = 60;
        arrayInt3[6] = 70;
        arrayInt3[7] = 80;
        arrayInt3[8] = 90;
        arrayInt3[9] = 100;
        arrayInt3[10] = 110;
        arrayInt3[11] = 120;
        arrayInt3[12] = 130;

        // Exercício 3
        mp.pesquisaBinaria(arrayInt3, 21, "Exercício 3");

        int[] arrayInt4 = new int[14];
        arrayInt4[0] = 3;
        arrayInt4[1] = 12;
        arrayInt4[2] = 24;
        arrayInt4[3] = 76;
        arrayInt4[4] = 45;
        arrayInt4[5] = 27;
        arrayInt4[6] = 9;
        arrayInt4[7] = 18;
        arrayInt4[8] = 32;
        arrayInt4[9] = 11;
        arrayInt4[10] = 20;
        arrayInt4[11] = 19;
        arrayInt4[12] = 88;
        arrayInt4[13] = 101;

        int[] arrayInt5 = new int[14];
        arrayInt5[0] = -4;
        arrayInt5[1] = 2;
        arrayInt5[2] = 7;
        arrayInt5[3] = 18;
        arrayInt5[4] = 28;
        arrayInt5[5] = 29;
        arrayInt5[6] = 56;
        arrayInt5[7] = 77;
        arrayInt5[8] = 81;
        arrayInt5[9] = 84;
        arrayInt5[10] = 92;
        arrayInt5[11] = 100;
        arrayInt5[12] = 112;
        arrayInt5[13] = 132;

        // Exercício 4
        mp.pesquisaBinaria(arrayInt4, 18, "Exercício 4a");
        mp.pesquisaBinaria(arrayInt5, 18, "Exercício 4b");

        // Pesquisa Binária deve ser feita somente com array ordenado.
    }
}
