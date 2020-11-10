package ProgII.Aula02.Lista2;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosArrayDois {

    public int[][] exercicio2a() {
        int[][] array1 = new int[3][10];
        for (int li = 0; li < array1.length; li++) {
            int index = 0;
            for (int col = 0; col < array1[li].length; col++) {
                array1[li][col] = index;
                index++;
            }
        }
        return array1;
    }

    public int[][] exercicio2b() {
        int[][] array2 = new int[5][10];
        for (int li = 0; li < array2.length; li++) {
            int index = 0;
            for (int col = 0; col < array2[li].length; col++) {
                array2[li][col] = index * index;
                index++;
            }
        }
        return array2;
    }

    public int[][] exercicio2c() {
        int[][] array3 = new int[6][6];
        int index = 0;
        for (int li = 0; li < array3.length; li++) {
            for (int col = 0; col < array3[li].length; col++) {
                array3[li][col] = index;
            }
            index++;
        }
        return array3;
    }

    public int[][] exercicio2d() {
        int[][] array4 = new int[9][6];
        int index = -1;
        for (int li = 0; li < array4.length; li++) {
            for (int col = 0; col < array4[li].length; col++) {
                array4[li][col] = index;
            }
            if (index == -1) {
                index = 0;
            } else {
                index = -1;
            }
        }

        return array4;
    }

    public int[][] exercicio3() {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int li, co;

        System.out.println("Digite o numero de linhas da matriz: ");
        li = teclado.nextInt();
        System.out.println("Digite o numero de colunas da matriz: ");
        co = teclado.nextInt();

        int[][] arrayInteiros = new int[li][co];

        for (int lin = 0; lin < arrayInteiros.length; lin++) {
            for (int col = 0; col < arrayInteiros[lin].length; col++)
                arrayInteiros[lin][col] = rand.nextInt(100);
        }
        return arrayInteiros;
    }

    public double[][] exercicio4() {
        double[][] array = new double[2][5];
        Scanner teclado = new Scanner(System.in);

        int index = 1;
        System.out.println("Informe 10 valores do tipo double");

        for (int li = 0; li < array.length; li++) {
            for (int col = 0; col < array[li].length; col++) {
                System.out.println("Digite o " + index + "º valor do tipo double: ");
                array[li][col] = teclado.nextDouble();
                index++;
            }
        }

        return array;
    }

    public int exercicio5(double[][] arrayB) {
        int total = 0;
        for (int li = 0; li < arrayB.length; li++) {
            for (int col = 0; col < arrayB[li].length; col++) {
                total++;
            }
        }

        return total;
    }

    public String exercicio6(double[][] m) {
        String retorno = "";

        for (int li = 0; li < m.length; li++) {
            for (int col = 0; col < m[li].length; col++) {
                retorno += m[li][col] + " - ";
            }
            retorno += "\n";
        }

        return retorno;
    }

    public double exercicio7(double[][] m) {
        double maiorV = 0;
        for (int li = 0; li < m.length; li++) {
            for (int col = 0; col < m[li].length; col++) {
                if (maiorV < m[li][col]) {
                    maiorV = m[li][col];
                }
            }
        }
        return maiorV;
    }

    public int exercicio8(int[][] m) {
        int soma = 0;

        for (int li = 0; li < m.length; li++) {
            for (int col = 0; col < m[li].length; col++) {
                soma += m[li][col];
            }
        }
        return soma;
    }

    public double exercicio9(double[][] m) {
        double media = 0;

        for (int li = 0; li < m.length; li++) {
            for (int col = 0; col < m[li].length; col++) {
                media += m[li][col];
            }
        }
        media = media / (m.length * m[0].length);

        return media;
    }

    public String[][] exercicio10() {
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);
        String[][] caracteres = new String[1 + rand.nextInt(5)][1 + rand.nextInt(3)];

        for (int li = 0; li < caracteres.length; li++) {
            for (int col = 0; col < caracteres[li].length; col++) {
                System.out.println("Digite um caracter qualquer:");
                caracteres[li][col] = teclado.nextLine();
            }
        }

        return caracteres;
    }

    public int[] exercicio11(int[][] m) {
        int[] positivos = new int[m.length * m[0].length];
        int index = 0;

        for (int li = 0; li < m.length; li++) {
            for (int col = 0; col < m[li].length; col++) {
                if (m[li][col] > 0) {
                    positivos[index] = m[li][col];
                    index++;
                }
            }
        }
        return positivos;
    }
}
