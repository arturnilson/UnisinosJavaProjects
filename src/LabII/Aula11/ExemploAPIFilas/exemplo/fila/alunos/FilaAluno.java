package LabII.Aula11.ExemploAPIFilas.exemplo.fila.alunos;

import java.util.LinkedList;
import java.util.List;

public class FilaAluno {
    private List<Aluno> alunos;

    public FilaAluno() {
        alunos = new LinkedList<>();
    }

    public void insere(Aluno aluno) {
        alunos.add(aluno);
    }

    public void insere(Aluno... turma) {
        for (Aluno aluno : turma) {
            alunos.add(aluno);
        }
    }

    public Aluno remove() {
        return alunos.remove(0);
    }

    public boolean estaVazia() {
        return alunos.size() == 0;
    }

    public Aluno espia() {
        return alunos.get(0);
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (Aluno aluno : alunos) {
            string.append(aluno.getNome() + "\n");
        }
        string.append("]");

        return string.toString();
    }
}
