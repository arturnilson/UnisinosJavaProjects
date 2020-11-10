package ProgII.Aula04.Lista04;

import java.util.Arrays;

/*
  Artur Nilson
*/

// fazer um método que recebe um array de inteiros e retorne o elemento que mais se repete

public class NumeroRepete {

    public void getRepeticoesElemento(int[] arrayInteiros) {
        System.out.println("Array original: " + Arrays.toString(arrayInteiros));
        int numero = 0, cont = 0;

        for (int i = 0; i < arrayInteiros.length; i++) {
            int quantidade = 0;

            for (int j = 0; j < arrayInteiros.length; j++) {
                if (arrayInteiros[i] == arrayInteiros[j]) {
                    quantidade++;
                }
            }

            if (quantidade > cont) {
                numero = arrayInteiros[i];
                cont = quantidade;
            }
        }

        System.out.println("O número " + numero + " se repete " + cont + " vezes");
    }

}