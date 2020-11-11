package LabII.ListaArrayMatrizes.Ex5;

public class Aluno {
    private String nome;
    private double notaGrauA;
    private double notaGrauB;

    public Aluno(String nome, double notaGrauA, double notaGrauB) {
        this.nome = nome;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaGrauA() {
        return notaGrauA;
    }

    public double getNotaGrauB() {
        return notaGrauB;
    }

    public double getMediaNotas() {
        return (notaGrauA + notaGrauB) / 2;
    }

}
