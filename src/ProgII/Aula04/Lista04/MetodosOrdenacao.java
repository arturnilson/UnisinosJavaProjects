package ProgII.Aula04.Lista04;

import java.util.Arrays;

public class MetodosOrdenacao {

    public void insertionSort(int[] array) {
        System.out.println("\n----===== Insertion Sort =====----\n");
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println();

        for (int indx = 0; indx < array.length; indx++) {
            int aux = indx;
            int B = array[indx];
            System.out.println((indx + 1) + "º Elemento ordenado: " + array[indx]);

            while ((aux > 0) && (array[aux - 1] > B)) {
                array[aux] = array[aux - 1];
                aux--;
            }
            array[aux] = B;

            System.out.println("Array após ordenação: " + Arrays.toString(array));
            System.out.println("------------------------------------------------------");
        }
    }

    public void bubbleSort(int[] array) {
        System.out.println("\n----===== Bubble Sort =====----\n");
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println();

        int aux = 1;
        int i = array.length - 1;

        while (i > 0) {
            int lastFlipped = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {

                    System.out.println(aux + "º Elemento sendo ordenado: " + array[j]);
                    int T = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = T;
                    lastFlipped = j;

                    System.out.println("Array após ordenação: " + Arrays.toString(array));
                    System.out.println("------------------------------------------------------");
                    aux++;
                }
            }
            i = lastFlipped;
        }
    }

    public void selectionSort(int[] array) {
        System.out.println("\n----===== Selection Sort =====----\n");
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println();

        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            min = i; // mínimo inicial
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j; // acha o novo mínimo
                }
            }
            System.out.println("Valor mínimo " + array[min]);

            int T = array[i]; // coloca o novo mínimo
            array[i] = array[min]; // na posição correta
            array[min] = T;
            System.out.println("Array após ordenação: " + Arrays.toString(array));
        }

    }
}
