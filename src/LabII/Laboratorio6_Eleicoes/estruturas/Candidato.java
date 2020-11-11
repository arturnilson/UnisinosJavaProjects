package LabII.Laboratorio6_Eleicoes.estruturas;

public class Candidato {
    private String nome;
    private String partido;
    private int idade;
    private int votos;

    public Candidato(String nome, String partido, int idade, int votos) {
        this.nome = nome;
        this.partido = partido;
        this.idade = idade;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getIdade() {
        return idade;
    }

    public int getVotos() {
        return votos;
    }
}
