package LabII.Laboratorio4_VacinaCovid.ui;

/*
 *   Artur Nilson
 */

import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import LabII.Laboratorio4_VacinaCovid.gerenciador.CovidQueue;
import LabII.Laboratorio4_VacinaCovid.pacientes.Paciente;

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

                if (t <= 5) {
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
                System.out.println("Paciente: " + nome + " adicionado(a) na fila\n");

                break;

            case 2:
                try {
                    Paciente paciente = covidQueue.vacinarPaciente();

                    System.out.println("Paciente Vacinado!");
                    System.out.println(paciente.getIdade() + " - " + paciente.getNome());
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 3:
                try {
                    System.out.println("Pacientes aguardando vacinação: ");
                    PriorityQueue<Paciente> filaAux = covidQueue.getPacientesFila();

                    showPacientesFila(filaAux);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 4:
                try {
                    Paciente pac = covidQueue.next();

                    System.out.println("Próximo Paciente: ");
                    System.out.println(pac.getIdade() + " - " + pac.getNome());
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 5:
                try {
                    System.out.println("Pacientes vacinados: ");
                    List<Paciente> listVacinados = covidQueue.getPacientesVacinados();

                    showPacientesVacinados(listVacinados);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;
        }
    }

    public String getMenu() {
        return "----==== MENU FILA VACINAÇÃO ====----" + "\n1- Adicionar Paciente na fila" + "\n2- Vacinar Paciente"
                + "\n3- Mostrar Fila de Espera" + "\n4- Mostrar Próximo da fila" + "\n5- Mostrar Pacientes Vacinados"
                + "\n6- Encerra execução\n\n";
    }

    private static void showPacientesFila(PriorityQueue fila) {
        int size = fila.size();

        for (int indx = 0; indx < size; indx++) {
            Paciente paciente = (Paciente) fila.remove();
            System.out.println(paciente.getIdade() + " - " + paciente.getNome());
        }
        System.out.println();
    }

    private static void showPacientesVacinados(List lista) {
        int size = lista.size();

        for (int indy = 0; indy < size; indy++) {
            Paciente paciente = (Paciente) lista.remove(0);
            System.out.println(paciente.getIdade() + " - " + paciente.getNome());
        }
        System.out.println();
    }

}
