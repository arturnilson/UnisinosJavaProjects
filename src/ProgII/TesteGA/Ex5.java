package ProgII.TesteGA;

import java.util.Arrays;

public class Ex5 {
    public int[] paresEspeciais() {
        int[] retorno = new int[10];
        int aux = 100;

        for (int indx = 0; indx < retorno.length; indx++) {
            retorno[indx] = aux;
            aux -= 10;
        }

        return retorno;
    }

    public static int[] paresEspeciais2() {
        int[] retorno = new int[10];
        int j = 0;

        for (int i = 100; i >= 10; i -= 10) {
            retorno[j++] = i;
        }

        return retorno;
    }
}
