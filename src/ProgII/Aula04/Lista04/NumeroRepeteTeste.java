package ProgII.Aula04.Lista04;

/*
  Artur Nilson
*/

public class NumeroRepeteTeste {
    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 11;
        a[1] = 10;
        a[2] = 18;
        a[3] = 12;
        a[4] = 6;
        a[5] = 11;
        a[6] = 25;
        a[7] = 2;
        a[8] = 11;

        NumeroRepete ma = new NumeroRepete();

        ma.getRepeticoesElemento(a);

    }
}
