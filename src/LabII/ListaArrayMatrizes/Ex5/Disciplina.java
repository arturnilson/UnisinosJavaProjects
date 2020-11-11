package LabII.ListaArrayMatrizes.Ex5;

public class Disciplina {
    private static final int QTD_ALUNOS = 10;
    private Aluno[] alunos;
    private int numeroElementos;

    public Disciplina() {
        alunos = new Aluno[QTD_ALUNOS];
    }

    public boolean adiciona(Aluno aluno) {
        if (listaCheia()) {
            return false;
        }

        if (!verificaNotas(aluno)) {
            return false;
        }

        alunos[numeroElementos] = aluno;
        numeroElementos++;

        return true;
    }

    private boolean listaCheia() {
        return numeroElementos == alunos.length;
    }

    private boolean verificaNotas(Aluno aluno) {
        if (aluno.getNotaGrauA() > 10 || aluno.getNotaGrauA() < 0) {
            return false;
        }

        if (aluno.getNotaGrauB() > 10 || aluno.getNotaGrauB() < 0) {
            return false;
        }

        return true;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public double maiorMedia(Aluno[] alunos) {
        double maiorMedia = alunos[0].getMediaNotas();

        for (int indx = 0; indx < alunos.length; indx++) {
            Aluno aluno = alunos[indx];
            if (aluno != null) {

                if (maiorMedia < aluno.getMediaNotas()) {
                    maiorMedia = aluno.getMediaNotas();
                }
            }
        }

        return maiorMedia;
    }

    public double menorMedia(Aluno[] alunos) {
        double menorMedia = alunos[0].getMediaNotas();

        for (int indx = 0; indx < alunos.length; indx++) {
            Aluno aluno = alunos[indx];
            if (aluno != null) {

                if (menorMedia > aluno.getMediaNotas()) {
                    menorMedia = aluno.getMediaNotas();
                }
            }
        }

        return menorMedia;
    }

    public double mediaGeral(Aluno[] alunos) {
        int count = 0;
        double auxMedia = 0;

        for (int indx = 0; indx < alunos.length; indx++) {
            Aluno aluno = alunos[indx];
            if (aluno != null) {
                ++count;
                auxMedia += aluno.getMediaNotas();
            }
        }

        return auxMedia / count;
    }

    public double maiorNota(Aluno[] alunos) {
        double maiorNota = alunos[0].getNotaGrauA();

        for (int indx = 0; indx < alunos.length; indx++) {
            Aluno aluno = alunos[indx];
            if (aluno != null) {

                if (maiorNota < aluno.getNotaGrauA()) {
                    maiorNota = aluno.getNotaGrauA();
                } else if (maiorNota < aluno.getNotaGrauB()) {
                    maiorNota = aluno.getNotaGrauB();
                }
            }
        }

        return maiorNota;
    }

    public double menorNota(Aluno[] alunos) {
        double menorNota = alunos[0].getNotaGrauA();

        for (int indx = 0; indx < alunos.length; indx++) {
            Aluno aluno = alunos[indx];
            if (aluno != null) {

                if (menorNota > aluno.getNotaGrauA()) {
                    menorNota = aluno.getNotaGrauA();
                } else if (menorNota > aluno.getNotaGrauB()) {
                    menorNota = aluno.getNotaGrauB();
                }
            }
        }

        return menorNota;
    }

}
