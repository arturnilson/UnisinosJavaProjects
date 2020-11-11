package LabII.ListaArrayMatrizes.Ex5;

public class TesteGerenciador {
    public static void main(String[] args) {
        Disciplina d = new Disciplina();

        Aluno aluno = new Aluno("Joao", 7.6, 5.2);
        Aluno aluno1 = new Aluno("Paulo", 4.6, 5.0);
        Aluno aluno2 = new Aluno("Ana", 8.9, 7.1);
        Aluno aluno3 = new Aluno("Ronaldo", 5.6, 6.4);

        d.adiciona(aluno);
        d.adiciona(aluno1);
        d.adiciona(aluno2);
        d.adiciona(aluno3);

        Aluno[] ListaExibir = d.getAlunos();
        mostraNotas(ListaExibir);
        System.out.println("\n----==== MÉDIAS ====----");
        System.out.println("Média geral: " + d.mediaGeral(ListaExibir));
        System.out.println("Menor média: " + d.menorMedia(ListaExibir));
        System.out.println("Maior média: " + d.maiorMedia(ListaExibir));

        System.out.println();
        System.out.println("Menor nota: " + d.menorNota(ListaExibir));
        System.out.println("Maior nota: " + d.maiorNota(ListaExibir));

    }

    private static void mostraNotas(Aluno[] alunos) {
        for (int indx = 0; indx < alunos.length; indx++) {
            Aluno aluno = alunos[indx];
            mostraUma(aluno);
        }
    }

    private static void mostraUma(Aluno aluno) {

        if (aluno != null) {
            System.out.println("----------------------------");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota GA: " + aluno.getNotaGrauA());
            System.out.println("Nota GB: " + aluno.getNotaGrauB());
            System.out.println("Média: " + aluno.getMediaNotas());
        }
    }
}
