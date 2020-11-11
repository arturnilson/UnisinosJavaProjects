package LabII.Laboratorio2_Cinema.testes;

import java.util.Scanner;

import LabII.Laboratorio2_Cinema.cinema.Menu;
import LabII.Laboratorio2_Cinema.cinema.Opcoes;

public class CinemaTeste {
    public static void main(String[] args) {
        Opcoes op = new Opcoes();
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println(menu.getMenu());
            System.out.println("Digite a opção desejada: ");

            if (teclado.hasNextInt()) {
                int t = teclado.nextInt();

                if (t <= 4) {
                    op.escolherOpcao(t);
                } else {
                    continuar = false;
                }
            } else {
                System.out.println("Caracter inválido. Digite um inteiro de 1-5!");
                continuar = false;
            }

        } while (continuar);

    }
}
