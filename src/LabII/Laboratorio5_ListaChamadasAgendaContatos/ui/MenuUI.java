package LabII.Laboratorio5_ListaChamadasAgendaContatos.ui;

import java.util.Scanner;

import LabII.Laboratorio5_ListaChamadasAgendaContatos.estruturas.Contato;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.listas.ListaChamadas;
import LabII.Laboratorio5_ListaChamadasAgendaContatos.listas.ListaContatos;

public class MenuUI {
    private Scanner teclado;
    private ListaContatos listaContatos;
    private ListaChamadas listaChamadas;

    public MenuUI() {
        teclado = new Scanner(System.in);
        listaContatos = new ListaContatos();
        listaChamadas = new ListaChamadas(listaContatos);
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

                try {
                    System.out.println("----==== Cadastrar Contato ====----");
                    System.out.println("Informe o nome: ");
                    String nome = teclado1.nextLine();
                    System.out.println("Informe o número de telefone: ");
                    int telefone = teclado1.nextInt();

                    listaContatos.adiciona(new Contato(nome, telefone));
                    System.out.println(nome + " foi adicionado(a) na Agenda");

                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 2:
                Scanner teclado2 = new Scanner(System.in);
                try {
                    listaContatos.mostrarContatos();

                    System.out.println("Informe o código do contato que deseja excluir.");
                    int codigo = teclado2.nextInt();
                    Contato removido = listaContatos.remove(codigo);

                    System.out.println(removido.getNome() + " foi removido(a) da Agenda.");
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 3:
                try {
                    listaContatos.mostrarContatos();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;

            case 4:
                Scanner teclado3 = new Scanner(System.in);
                System.out.println("Informe o número do telefone.");
                int numero = teclado3.nextInt();
                listaChamadas.adiciona(numero);

                break;

            case 5:
                try {
                    listaChamadas.mostrarChamadas();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 6:
                listaChamadas.excluirChamadas();

                break;
        }
    }

    public String getMenu() {
        return "----==== MENU LISTA CHAMADAS ====----" + "\n1- Cadastrar Contato" + "\n2- Remover Contato"
                + "\n3- Mostrar lista de contatos" + "\n4- Cadastrar chamada não atendida"
                + "\n5- Mostrar lista de chamadas não atendidas" + "\n6- Excluir todas as chamadas não atendidas"
                + "\n7- Sair\n\n";
    }
}
