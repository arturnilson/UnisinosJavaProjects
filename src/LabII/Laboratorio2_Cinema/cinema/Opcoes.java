package LabII.Laboratorio2_Cinema.cinema;

import java.util.Scanner;

public class Opcoes {
    private Mapa mapa = new Mapa();

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Scanner teclado = new Scanner(System.in);

                System.out.println("----==== Reservar Assento ====----");
                System.out.println("Informe a linha: ");
                String linha = teclado.nextLine();
                System.out.println("Informe a coluna: ");
                int coluna = teclado.nextInt();

                if (!mapa.reservarAssento(linha, coluna)) {
                    System.out.println("Não foi possível reservar o assento informado.");
                } else {
                    System.out.println("Reserva Efetuada com Sucesso!");
                }

                System.out.println();

                break;

            case 2:
                Scanner teclado1 = new Scanner(System.in);

                System.out.println("----==== Cancelar Assento ====----");
                System.out.println("Informe a linha: ");
                String linha1 = teclado1.nextLine();
                System.out.println("Informe a coluna: ");
                int coluna1 = teclado1.nextInt();

                if (!mapa.cancelarReserva(linha1, coluna1)) {
                    System.out.println("Não foi possível cancelar reserva.");
                } else {
                    System.out.println("Reserva Cancelada com Sucesso!");
                }

                System.out.println();
                break;

            case 3:
                System.out.println("----==== Mapa de Assentos ====----");
                mapa.mostrarMapa();
                System.out.println();
                break;

            case 4:
                System.out.println("----==== Quantidades ====----");
                System.out.println(mapa.toString());
                System.out.println();
                break;
        }

    }

}
