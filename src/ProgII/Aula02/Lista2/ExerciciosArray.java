package ProgII.Aula02.Lista2;

public class ExerciciosArray {

    // A
    public void imprimeArray(int[][] array) {
        for (int linha = 0; linha < array.length; linha++) {
            for (int col = 0; col < array[linha].length; col++) {
                System.out.println("Posição [" + linha + "][" + col + "] é: " + array[linha][col]);
            }
        }
    }

    // B
    public void imprimeArray(int[] m) {
        for (int linha = 0; linha < m.length; linha++) {
            System.out.println("Posição [" + linha + "] é: " + m[linha]);
        }
    }

    // C
    public void imprimeLinhaArray(int[][] m, int lin) {
        for (int linha = 0; linha < m.length; linha++) {
            System.out.println("Imprime linha " + m[lin - 1][linha]);
        }
    }

    // D
    public void imprimeColunaArray(int[][] m, int col) {
        for (int linha = 0; linha < m.length; linha++) {
            System.out.println("Imprime coluna " + m[linha][col - 1]);
        }
    }

    // E
    public int[] encontraPares(int[][] m) {
        int[] pares = new int[m.length * m[0].length];
        int index = 0;

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if (m[linha][coluna] % 2 == 0) {
                    pares[index] = m[linha][coluna];
                    System.out.println(pares[index]);
                    index++;
                }
            }
        }
        return pares;
    }

    // F
    public void encontraPrimos(int[][] m) {
        int[] primos = new int[m.length * m[0].length];
        int index = 0;

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if (auxEncontraPrimo(m[linha][coluna])) {
                    primos[index] = m[linha][coluna];
                    System.out.println("[" + linha + "][" + coluna + "] = " + m[linha][coluna]);
                    index++;
                }
            }
        }
        System.out.println();
    }

    public boolean auxEncontraPrimo(int m1) {
        for (int testador = 2; testador < m1; testador++) {
            if (m1 % testador == 0) {
                return false;
            }
        }
        return true;
    }

    // G
    public int calculaMedia(int[][] m) {
        int media = 0;
        int index = 0;

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                media += m[linha][coluna];
                index++;
            }
        }
        return media / index;
    }

    // H
    public void calculaMediaLinhas(int[][] m) {
        double[] mediaLinha = new double[m.length];

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                mediaLinha[linha] += m[linha][coluna];
            }
        }

        for (int l = 0; l < m.length; l++) {
            mediaLinha[l] = mediaLinha[l] / m[l].length;
            System.out.println("A media da linha [" + (l + 1) + "] é igual a: " + mediaLinha[l]);
        }
        System.out.println();
    }

    // I
    public void calculaMediaColunas(int[][] m) {
        double[] mediaColuna = new double[m[0].length];

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                mediaColuna[coluna] += m[linha][coluna];
            }
        }

        for (int l = 0; l < m.length; l++) {
            mediaColuna[l] = mediaColuna[l] / m[l].length;
            System.out.println("A media da coluna [" + (l + 1) + "] é igual a: " + mediaColuna[l]);
        }
        System.out.println();
    }

    // J
    public void calculaMediadif(int[][] m, int[][] y) {
        double[] media = new double[m.length * m[0].length];
        int index = 0;

        for (int li = 0; li < m.length; li++) {
            for (int col = 0; col < m[li].length; col++) {
                media[index] += m[li][col] + y[li][col];
                index++;
            }
        }
        for (int i = 0; i < m.length * m[0].length; i++) {
            media[i] = media[i] / (m.length * m[0].length);
            System.out.println("A media da posição [" + (i + 1) + "] é de: " + media[i]);
        }
        System.out.println();
    }

    // K
    public void somaArrays(int[][] a, int[][] b) {
        int[] soma = new int[a.length * a[0].length];
        int index = 0;

        for (int li = 0; li < a.length; li++) {
            for (int col = 0; col < a[li].length; col++) {
                soma[index] = a[li][col] + b[li][col];
                index++;
            }
        }
        for (int i = 0; i < a.length * a[0].length; i++) {
            System.out.println("A soma dos arrays na posição [" + (i + 1) + "] é de: " + soma[i]);
        }
        System.out.println();
    }

    // L
    public void somaPosicoesArrays(int[][] a, int[][] b) {
        int[][] somaArray = new int[a.length][a[0].length];

        for (int li = 0; li < a.length; li++) {
            for (int col = 0; col < a[0].length; col++) {
                somaArray[li][col] = a[li][col] + b[li][col];
                System.out.println("A soma dos array na linha [" + (li + 1) + "] e na coluna [" + (col + 1) + "] é de: "
                        + somaArray[li][col]);
            }
        }
        System.out.println();
    }

}
