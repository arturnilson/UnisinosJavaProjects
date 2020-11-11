package LabII.Aula10.ExemploListaAlunos.estrutura.arrays;

// Implementacao basica de uma lista, usando arrays
public class ListaSimples {
    private static final int TAM_VETOR = 10;
    private Aluno[] alunos = new Aluno[TAM_VETOR];
    private int totalAlunos = 0;

    // public void adiciona(Aluno aluno) {
    // for(int i = 0; i < alunos.length; i++) {
    // if(alunos[i] == null) {
    // alunos[i] = aluno;
    // break;
    // }
    // }
    // }

    public void adiciona(Aluno aluno) {
        aumentaEspaco();
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    private void aumentaEspaco() {
        if (totalAlunos == alunos.length) {
            Aluno[] novoArray = new Aluno[alunos.length * 2];
            for (int x = 0; x < alunos.length; x++) {
                novoArray[x] = alunos[x];
            }
            alunos = novoArray;
        }
    }

    public void adiciona(int posicao, Aluno aluno) {
        aumentaEspaco();
        if (!existeAlunoNa(posicao)) {
            throw new IllegalArgumentException("posicao invalida...");
        }

        for (int x = totalAlunos - 1; x >= posicao; x -= 1) {
            alunos[x + 1] = alunos[x];
        }

        alunos[posicao] = aluno;
        totalAlunos++;
    }

    public Aluno retorna(int posicao) {
        if (!existeAlunoNa(posicao)) {
            throw new IllegalArgumentException("posicao invalida...");
        }
        return alunos[posicao];
    }

    private boolean existeAlunoNa(int posicao) {
        return posicao >= 0 && posicao < totalAlunos;
    }

    public void remove(int posicao) {
        if (!estaOcupada(posicao)) {
            throw new IllegalArgumentException("posicao invalida...");
        }

        for (int x = posicao; x < totalAlunos - 1; x++) {
            alunos[x] = alunos[x + 1];
        }

        totalAlunos--;
    }

    private boolean estaOcupada(int posicao) {
        return existeAlunoNa(posicao);
    }

    public boolean existe(Aluno aluno) {
        for (int x = 0; x < totalAlunos; x++) {
            if (aluno.equals(alunos[x])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalAlunos;
    }

    public String toString() {
        // return Arrays.toString(alunos);
        if (totalAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int x = 0; x < totalAlunos - 1; x++) {
            builder.append(alunos[x].getNome());
            builder.append(" = ");
            builder.append(alunos[x].getNota());
            builder.append(", ");
        }

        builder.append(alunos[totalAlunos - 1].getNome());
        builder.append(" = ");
        builder.append(alunos[totalAlunos - 1].getNota());

        builder.append("]");
        return builder.toString();
    }
}
