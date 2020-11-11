package LabII.Aula11.ExemploAPIFilas.exemplo.fila.alunos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class APIQueueTeste {

    public static void main(String[] args) {
        Queue<Aluno> turma = new LinkedList<>();

        Aluno a1 = new Aluno("Guilherme");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Paulo");
        Aluno a4 = new Aluno("Juliana");

        verificaSeEstaVazia(turma);

        System.out.println("\nInserindo alunos...");
        turma.add(a1);
        turma.add(a2);
        turma.add(a3);
        turma.add(a4);

        verificaSeEstaVazia(turma);

        System.out.println("\nMostrando a turma...");
        Iterator<Aluno> alunos = turma.iterator();
        while (alunos.hasNext()) {
            Aluno aluno = alunos.next();
            System.out.println(aluno.getNome());
        }

        System.out.println("\nEspiando...");
        Aluno aluno = turma.peek();
        System.out.println(aluno.getNome());

        System.out.println("\nRemovendo alunos...");
        turma.remove();
        turma.remove();
        turma.remove();

        verificaSeEstaVazia(turma);
    }

    private static void verificaSeEstaVazia(Queue<Aluno> fila) {
        System.out.print("Fila esta fazia? ");
        System.out.println(fila.isEmpty());
    }
}
