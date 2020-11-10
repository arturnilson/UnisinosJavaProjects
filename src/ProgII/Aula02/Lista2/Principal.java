package ProgII.Aula02.Lista2;

public class Principal {

    public static void main(String[] args) {

        // Exercicio 1
        int[][] a = new int[3][3];
        a[0][0] = 11;
        a[0][1] = 23;
        a[0][2] = 54;
        a[1][0] = 3;
        a[1][1] = 6;
        a[1][2] = 33;
        a[2][0] = 25;
        a[2][1] = 2;
        a[2][2] = 14;

        int[] b = { 2, 5, 19, 4, 9, 12, 24, 32, 90, 8 };

        ExerciciosArray ex = new ExerciciosArray();
        ex.imprimeArray(a);
        ex.imprimeArray(b);
        ex.imprimeLinhaArray(a, 1);
        ex.imprimeColunaArray(a, 2);
        ex.encontraPares(a);
        ex.encontraPrimos(a);
        System.out.println(ex.calculaMedia(a));
        ex.calculaMediaLinhas(a);
        ex.calculaMediaLinhas(a);
        ex.calculaMediaColunas(a);
        ex.calculaMediadif(a, a);
        ex.somaArrays(a, a);
        ex.somaPosicoesArrays(a, a);

        // Exercicio 2
        ExerciciosArrayDois exer = new ExerciciosArrayDois();

        System.out.println("Exercício 2A");
        int[][] array = new int[3][10];
        array = exer.exercicio2a();

        for (int l = 0; l < array.length; l++) {
            for (int c = 0; c < array[l].length; c++) {
                System.out.printf(array[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercício 2B");
        int[][] array2 = new int[5][10];
        array2 = exer.exercicio2b();

        for (int l = 0; l < array2.length; l++) {
            for (int c = 0; c < array2[l].length; c++) {
                System.out.printf(array2[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercício 2C");
        int[][] array3 = new int[6][6];
        array3 = exer.exercicio2c();

        for (int l = 0; l < array3.length; l++) {
            for (int c = 0; c < array3[l].length; c++) {
                System.out.printf(array3[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercício 2D");
        int[][] array4 = new int[9][6];
        array4 = exer.exercicio2d();

        for (int l = 0; l < array4.length; l++) {
            for (int c = 0; c < array4[l].length; c++) {
                System.out.printf(array4[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercicio 3");
        int[][] array5 = new int[15][15];
        array5 = exer.exercicio3();

        for (int l = 0; l < array5.length; l++) {
            for (int c = 0; c < array5[l].length; c++) {
                System.out.printf(array5[l][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Exercicio 4");
        double[][] array6 = new double[15][15];
        array6 = exer.exercicio4();

        for (int l = 0; l < array6.length; l++) {
            for (int c = 0; c < array6[l].length; c++) {
                System.out.printf(array6[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Imprimindo exercicio 5");
        System.out.println("O numero de elementos da matriz bidimencional é de: " + exer.exercicio5(array6));

        // Exercicio 6
        double[][] matriz = new double[3][4];
        matriz[0][0] = 22.1;
        matriz[0][1] = 7.2;
        matriz[0][2] = 33.3;
        matriz[0][3] = 15.1;
        matriz[1][0] = 2.0;
        matriz[1][1] = 3.4;
        matriz[1][2] = 75.2;
        matriz[1][3] = 6.3;
        matriz[2][0] = 11.4;
        matriz[2][1] = 45.0;
        matriz[2][2] = 22.6;
        matriz[2][3] = 33.1;

        System.out.println();
        System.out.println("Exercicio 6!");
        System.out.println(exer.exercicio6(matriz));

        System.out.println();
        System.out.println("Exercicio 7!");
        System.out.println("O maior valor da matriz é: " + exer.exercicio7(matriz));

        System.out.println();
        System.out.println("Exercicio 8!");
        System.out.println("O total da soma dos elementos da matriz é: " + exer.exercicio8(a));

        System.out.println();
        System.out.println("Exercicio 9!");
        System.out.println("A media da matriz é: " + exer.exercicio9(matriz));

        System.out.println();
        System.out.println("Exercicio 10!");
        System.out.println("A matriz de caracteres é: ");

        String[][] array1 = new String[5][3];
        array1 = exer.exercicio10();
        for (int l = 0; l < array1.length; l++) {
            for (int c = 0; c < array1[l].length; c++) {
                System.out.println(array1[l][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercicio 11");
        int[] positivos = new int[a.length * a[0].length];
        positivos = exer.exercicio11(a);
        for (int l = 0; l < positivos.length; l++) {
            System.out.printf("[" + positivos[l] + "]");
        }
        System.out.println();
    }

    /*
     * Exercício 13
     * 
     * A) F B) V C) F D) V E) F
     * 
     * 
     * Exercício 14
     * 
     * public int getIdade() { return super.getIdade(); }
     * 
     */

}
