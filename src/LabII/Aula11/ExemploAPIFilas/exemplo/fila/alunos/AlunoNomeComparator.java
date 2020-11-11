package LabII.Aula11.ExemploAPIFilas.exemplo.fila.alunos;

import java.util.Comparator;

public class AlunoNomeComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        int compara = aluno1.getNome().compareToIgnoreCase(aluno2.getNome());
        if (compara < 0) {
            return -1;
        }
        if (compara > 0) {
            return 1;
        }
        return 0;
    }
}
