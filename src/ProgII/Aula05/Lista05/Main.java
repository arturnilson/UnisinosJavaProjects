package ProgII.Aula05.Lista05;

import java.util.Arrays;

/*
  Artur Nilson
*/

public class Main {
    public static void main(String[] args) {
        Exercicios ex = new Exercicios();

        // Exercicio 1
        int fatorial = 7;
        System.out.println("Fatorial de " + fatorial + "\n" + ex.exercicio1(fatorial));
        System.out.println();

        // Exercicio 2
        int fibonacci = 12;
        System.out.println("Fibonacci de " + fibonacci + "\n" + ex.exercicio2(fibonacci));
        System.out.println();

        // Exercicio 3
        int somaIntervalo = 5;
        System.out.println("Soma Intervalo de " + somaIntervalo + "\n" + ex.exercicio3(somaIntervalo));

        // Exercicio 4
        int somaPares = 15;
        System.out.println("\nSoma Pares de " + somaPares + "\n" + ex.exercicio4(somaPares));

        // Exercicio 5
        int[] vetor = { 1, 4, 5, 3, 2 };
        System.out.println("\nSoma Valores do vetor: " + Arrays.toString(vetor) + "\n" + ex.exercicio5(vetor, 0));

        // Exercicio 6
        int[] vetor1 = { 1, 4, 5, 3, 2, 8, 6 };
        System.out.println("\nInverte Valores do vetor: " + Arrays.toString(vetor1));
        Exercicios.inverterArrayR(vetor1);
        System.out.println();

        // Exercício 7
        String str = "Palavra invertida";
        System.out.println("String Invertida (" + str + "): " + ex.exercicio7(str));

        // Exercício 8
        /*
         * Dividir a resolução de um problema grande em vários pequenos problemas. Pode
         * ser utilizada quando há uma função que a cada chamada esteja mais próxima da
         * resolução do seu problema, tornando ela recursiva e funcionando como uma
         * pilha.
         */

    }
}
