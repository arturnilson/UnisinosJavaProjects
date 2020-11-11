package LabII.Aula11.ExemploAPIFilas.exemplo.fila.alunos;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTeste {

    public static void main(String[] args) {
        comparaPorTamanho();
        comparaPorNome();
    }

    private static void comparaPorTamanho() {
        Comparator<Aluno> comparadorPorTamanho = new AlunoTamanhoNomeComparator();
        PriorityQueue<Aluno> fila1 = new PriorityQueue<Aluno>(10, comparadorPorTamanho);

        System.out.println("Comparando por tamanho das strings...");
        Aluno a1 = new Aluno("Guilherme");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Paulo");
        Aluno a4 = new Aluno("Juliana");

        fila1.add(a1);
        fila1.add(a2);
        fila1.add(a3);
        fila1.add(a4);

        while (fila1.size() != 0) {
            Aluno aluno = fila1.remove();
            System.out.println(aluno.getNome());
        }
    }

    private static void comparaPorNome() {
        Comparator<Aluno> comparadorPorNome = new AlunoNomeComparator();
        PriorityQueue<Aluno> fila1 = new PriorityQueue<Aluno>(10, comparadorPorNome);

        System.out.println("\nComparando por ordem alfab�tica...");
        Aluno a1 = new Aluno("Guilherme");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Paulo");
        Aluno a4 = new Aluno("Juliana");

        fila1.add(a1);
        fila1.add(a2);
        fila1.add(a3);
        fila1.add(a4);

        while (fila1.size() != 0) {
            Aluno aluno = fila1.remove();
            System.out.println(aluno.getNome());
        }
    }
}
