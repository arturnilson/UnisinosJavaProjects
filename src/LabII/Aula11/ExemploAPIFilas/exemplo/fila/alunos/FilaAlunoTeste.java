package LabII.Aula11.ExemploAPIFilas.exemplo.fila.alunos;

public class FilaAlunoTeste {

    public static void main(String[] args) {
        FilaAluno fila = new FilaAluno();

        Aluno a1 = new Aluno("Guilherme");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Paulo");
        Aluno a4 = new Aluno("Juliana");

        verificaSeEstaVazia(fila);

        System.out.println("\nInserindo alunos...");
        fila.insere(a1);
        fila.insere(a2);
        fila.insere(a3);

        verificaSeEstaVazia(fila);

        System.out.println("\nMostrando a turma...");
        System.out.println(fila.toString());

        System.out.println("\nEspiando...");
        Aluno aluno = fila.espia();
        System.out.println(aluno.getNome());

        System.out.println("\nRemovendo alunos...");
        fila.remove();
        fila.remove();
        fila.remove();

        verificaSeEstaVazia(fila);

        System.out.println("Inserindo alunos com insere especial...");
        fila.insere(a1, a2, a3, a4);
        System.out.println(fila.toString());

    }

    private static void verificaSeEstaVazia(FilaAluno fila) {
        System.out.print("Fila est� fazia? ");
        System.out.println(fila.estaVazia());
    }
}
