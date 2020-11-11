package LabII.Laboratorio4_VacinaCovid.ui;

import java.util.Scanner;

import LabII.Laboratorio4_VacinaCovid.gerenciador.CovidQueue;

public class MenuUI {
    private Scanner teclado;
    private CovidQueue covidQueue;

    public MenuUI() {
        teclado = new Scanner(System.in);
        covidQueue = new CovidQueue();
    }

    public void menu() {
        boolean continuar = true;

        do {
            System.out.println(this.getMenu());
            System.out.println("Digite a opção desejada: ");

            if (teclado.hasNextInt()) {
                int t = teclado.nextInt();

                if (t <= 6) {
                    this.escolherOpcao(t);
                } else {
                    continuar = false;
                }
            } else {
                System.out.println("Caracter inválido. Digite um inteiro de 1-6!");
                continuar = false;
            }

        } while (continuar);

    }

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Scanner teclado1 = new Scanner(System.in);

                System.out.println("----==== Adicionar Paciente ====----");
                System.out.println("Informe o nome: ");
                String nome = teclado1.nextLine();
                System.out.println("Informe a idade: ");
                int idade = teclado1.nextInt();

                covidQueue.addPaciente(nome, idade);

                break;

            case 2:
                try {
                    covidQueue.vacinarPaciente();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 3:
                try {
                    covidQueue.getPacientesFila();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 4:
                try {
                    covidQueue.next();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 5:
                try {
                    covidQueue.getPacientesVacinados();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 6:
                System.out.println("Fila Encerrada.");

                break;
        }
    }

    public String getMenu() {
        return "----==== MENU FILA VACINAÇÃO ====----" + "\n1- Adicionar Paciente na fila" + "\n2- Vacinar Paciente"
                + "\n3- Mostrar Fila de Espera" + "\n4- Mostrar Próximo da fila" + "\n5- Mostrar Pacientes Vacinados"
                + "\n6- Encerra execução\n\n";
    }
}
