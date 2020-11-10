package ProgII.TesteGA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();

        int[][] vetor1 = new int[3][3];
        vetor1[0][0] = 2;
        vetor1[0][1] = 56;
        vetor1[0][2] = 71;
        vetor1[1][0] = 20;
        vetor1[1][1] = 16;
        vetor1[1][2] = 2;
        vetor1[2][0] = 32;
        vetor1[2][1] = 6;
        vetor1[2][2] = 8;

        System.out.println(ex4.calculaMediaPares10Plus(vetor1));

        Ex5 ex5 = new Ex5();
        System.out.println(Arrays.toString(ex5.paresEspeciais()));

        Ex6 ex6 = new Ex6();
        int[] arrayInt = new int[10];
        arrayInt[0] = 6;
        arrayInt[1] = 12;
        arrayInt[2] = 1;
        arrayInt[3] = 5;
        arrayInt[4] = 9;
        arrayInt[5] = 11;
        arrayInt[6] = 7;
        arrayInt[7] = 4;
        arrayInt[8] = 2;
        arrayInt[9] = 3;

        int[] arrayInt1 = new int[10];
        arrayInt1[0] = 6;
        arrayInt1[1] = 12;
        arrayInt1[2] = 1;
        arrayInt1[3] = 5;
        arrayInt1[4] = 9;
        arrayInt1[5] = 11;
        arrayInt1[6] = 7;
        arrayInt1[7] = 4;
        arrayInt1[8] = 2;
        arrayInt1[9] = 3;

        int[] arrayInt2 = new int[10];
        arrayInt2[0] = 6;
        arrayInt2[1] = 12;
        arrayInt2[2] = 1;
        arrayInt2[3] = 5;
        arrayInt2[4] = 9;
        arrayInt2[5] = 11;
        arrayInt2[6] = 7;
        arrayInt2[7] = 4;
        arrayInt2[8] = 2;
        arrayInt2[9] = 3;

        ex6.insertionSort(arrayInt);
        ex6.bubbleSort(arrayInt1);
        ex6.selectionSort(arrayInt2);

        Ex8 ex8 = new Ex8();
        int[] vetorEx8 = new int[10];
        vetorEx8[0] = 3;
        vetorEx8[1] = 6;
        vetorEx8[2] = 9;
        vetorEx8[3] = 12;
        vetorEx8[4] = 15;
        vetorEx8[5] = 18;
        vetorEx8[6] = 21;
        vetorEx8[7] = 24;
        vetorEx8[8] = 27;
        vetorEx8[9] = 30;

        System.out.println(ex8.pesquisaBinaria(vetorEx8, 12));

        Ex9 ex9 = new Ex9();
        int[] vetorEx9 = new int[10];
        vetorEx9[0] = 3;
        vetorEx9[1] = 6;
        vetorEx9[2] = 9;
        vetorEx9[3] = 12;
        vetorEx9[4] = 15;
        vetorEx9[5] = 18;
        vetorEx9[6] = 21;
        vetorEx9[7] = 24;
        vetorEx9[8] = 27;
        vetorEx9[9] = 30;

        System.out.println(ex9.pesquisaSequencialOrdenada(vetorEx9, 13));
        System.out.println();

        Ex10 ex10 = new Ex10();
        System.out.println("F(3): " + ex10.f(3));
        System.out.println("F(6): " + ex10.f(6));
        System.out.println("F(12): " + ex10.f(12));

        /*
         * F(3): Compara se o valor é menor que 4, sendo menor ele multiplica por 3
         * 
         * F(6): Compara se o 6 é menor que 4, sendo maior ele refaz a chamada da função
         * 2* a nova chamada da função -4 + 5, desmontando o empilhamento da recursão;
         * 
         * F(12): Compara se o 6 é menor que 4, sendo maior ele refaz a chamada da
         * função 2 * 12-4 + 5 e refaz a comparação com o valor 8, como é maior ele
         * refaz a chamada da função com 2* 4-4 + 5 até chegar no fim e desmontar o
         * empilhamento da recursão
         */

    }
}
