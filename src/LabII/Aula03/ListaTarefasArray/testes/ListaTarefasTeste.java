package LabII.Aula03.ListaTarefasArray.testes;

import java.time.format.DateTimeFormatter;

import LabII.Aula03.ListaTarefasArray.tarefas.ListaTarefas;
import LabII.Aula03.ListaTarefasArray.tarefas.Tarefa;

public class ListaTarefasTeste {
    public static void main(String[] args) {
        // Criando instancias de tarefas
        Tarefa t1 = new Tarefa("Estudar prog OO");
        Tarefa t2 = new Tarefa("Revisar conceitos GIT");
        Tarefa t3 = new Tarefa("Revisar matéria de arrays");

        // Cria a lista e adiciona tarefas
        ListaTarefas lista1 = new ListaTarefas();
        System.out.println(lista1.adiciona(0, t1));
        System.out.println(lista1.adiciona(1, t2));
        System.out.println(lista1.adiciona(50, t3));

        Tarefa[] ListaExibir1 = lista1.getTarefas();
        mostraTarefas(ListaExibir1);

        // Cria a lista e adiciona tarefas
        ListaTarefas lista2 = new ListaTarefas(10);
        System.out.println(lista2.adiciona(t1));
        System.out.println(lista2.adiciona(t2));
        // System.out.println(lista2.adiciona(t3));

        System.out.println("Existe t1 em lista2 " + lista2.existe(t3));

        Tarefa[] ListaExibir2 = lista2.getTarefas();
        mostraTarefas(ListaExibir2);

        System.out.println("\n\ntarefa que foi consultada: ");
        Tarefa tarefaConsultada = lista2.pesquisaTarefa(1);

        if (tarefaConsultada == null) {
            System.out.println("tarefa não encontrada....");
        } else {
            mostraUma(tarefaConsultada);
        }

        System.out.println("\n\ntarefa que foi consultada METODO 2: ");
        int posicao = lista2.pesquisaTarefa(t3);

        if (posicao == -1) {
            System.out.println("tarefa não encontrada....");
        } else {
            System.out.println("posicao = " + posicao);
        }

        System.out.println("Numero de Tarefas = " + lista2.numeroTarefas());
        System.out.println("Conseguiu remover? " + lista2.removeTarefa(1));
        System.out.println("Numero de Tarefas = " + lista2.numeroTarefas());

    }

    private static void mostraTarefas(Tarefa[] lista) {
        for (int indx = 0; indx < lista.length; indx++) {
            Tarefa tarefa = lista[indx];
            mostraUma(tarefa);
        }
    }

    private static void mostraUma(Tarefa tarefa) {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (tarefa != null) {
            System.out.println("----------------------------");
            System.out.println("Descrição: " + tarefa.getDescricao());
            String realizou = tarefa.realizado() ? "Sim" : "Não";
            System.out.println("Realizado: " + realizou);
            System.out.println("Data criação: " + tarefa.getDataCriacao().format(formatoData));
            System.out.println("Prazo para conclusão: " + tarefa.getPrazo().format(formatoData));
        }
    }
}
