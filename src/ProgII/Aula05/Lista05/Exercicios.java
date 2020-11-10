package ProgII.Aula05.Lista05;

import java.util.Arrays;

/*
  Artur Nilson
*/

public class Exercicios {

    // Fatorial
    public long exercicio1(int numero) {

        if (numero < 0 || numero > 20) {
            throw new IllegalArgumentException("Argumento inválido! Valores válidos [0 - 20]");
        }

        if (numero <= 1) {
            return 1;
        } else {
            return numero * exercicio1(numero - 1);
        }
    }

    // Fibonacci
    public long exercicio2(int numero) {

        if (numero <= 1) {
            return numero;
        } else {
            return exercicio2(numero - 2) + exercicio2(numero - 1);
        }
    }

    // Soma Intervalo
    public long exercicio3(int numero) {

        if (numero <= 1) {
            return 1;
        } else {
            return numero + exercicio3(numero - 1);
        }
    }

    // Soma Intervalo Pares
    public int exercicio4(int numero) {

        if (numero == 0) {
            return 0;
        }

        if (numero % 2 == 0) {
            return numero + exercicio4(numero - 1);
        }

        return exercicio4(numero - 1);
    }

    // Soma Valores Array Unidimensional
    public int exercicio5(int[] array, int aux) {

        if (aux < array.length) {
            return array[aux] + exercicio5(array, aux + 1);
        } else {
            return 0;
        }
    }

    // Inverte Elementos
    public static void inverterArrayR(int[] array) {
        inverterArrayR(array, 0, array.length - 1);
    }

    private static void inverterArrayR(int[] array, int i, int j) {
        if (i < j) {
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            System.out.println((i + 1) + "ª inversão: " + Arrays.toString(array));
            inverterArrayR(array, ++i, --j);
        }
    }

    // Inverte String
    public String exercicio7(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return exercicio7(str.substring(1)) + str.charAt(0);
    }
}
