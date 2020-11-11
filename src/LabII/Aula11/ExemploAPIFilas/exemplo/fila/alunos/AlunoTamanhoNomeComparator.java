package LabII.Aula11.ExemploAPIFilas.exemplo.fila.alunos;

import java.util.Comparator;

public class AlunoTamanhoNomeComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getNome().length() < aluno2.getNome().length()) {
            return -1;
        }
        if (aluno1.getNome().length() > aluno2.getNome().length()) {
            return 1;
        }
        return 0;
    }
}
