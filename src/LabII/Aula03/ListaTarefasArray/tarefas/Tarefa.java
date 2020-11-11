package LabII.Aula03.ListaTarefasArray.tarefas;

import java.time.LocalDate;

public class Tarefa {
    private static final int DIAS_EXECUCAO_TAREFA = 10;
    private String descricao;
    private boolean realizado;
    private LocalDate dataCriacao;
    private LocalDate prazo;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.realizado = false;
        this.dataCriacao = LocalDate.now();
        this.prazo = LocalDate.now().plusDays(DIAS_EXECUCAO_TAREFA);
    }

    public void realiza() {
        realizado = true;
    }

    public void desfaz() {
        realizado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean realizado() {
        return realizado;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

}
