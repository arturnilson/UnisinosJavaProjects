package ProgII.Aula05;

public class Recursao {

    public static long fatorial(int numero) {

        if (numero < 0 || numero > 20) {
            throw new IllegalArgumentException("Argumento inválido! Valores válidos [0 - 20]");
        }

        if (numero <= 1) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }

}
