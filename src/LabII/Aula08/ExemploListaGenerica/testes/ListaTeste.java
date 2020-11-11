package LabII.Aula08.ExemploListaGenerica.testes;

import LabII.Aula08.ExemploListaGenerica.estruturas.Lista;
import LabII.Aula08.ExemploListaGenerica.objetos.Aluno;
import LabII.Aula08.ExemploListaGenerica.objetos.Marca;

public class ListaTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Joao");
        Aluno a2 = new Aluno(2, "Pedro");

        Lista<Aluno> turma = new Lista<>();
        turma.adiciona(a1);
        turma.adiciona(a2);
        turma.adiciona(new Aluno(3, "Igor"));

        mostraTurma(turma);

        Marca m1 = new Marca("Volkswagen", "Carros");
        Marca m2 = new Marca("Umbro", "Confecção e Calçados");

        Lista<Marca> marcas = new Lista<>();
        marcas.adiciona(m1);
        marcas.adiciona(m2);

        mostraMarcas(marcas);
    }

    private static void mostraTurma(Lista<Aluno> turma) {
        for (int indx = 0; indx < turma.numeroElementos(); indx++) {
            Aluno a = turma.pesquisa(indx);
            mostraUmAluno(a);
        }
    }

    private static void mostraUmAluno(Aluno a) {

        System.out.println("Matrícula: " + a.getMatricula() + "\tNome do Aluno: " + a.getNome());
    }

    private static void mostraMarcas(Lista<Marca> marcas) {
        for (int indx = 0; indx < marcas.numeroElementos(); indx++) {
            Marca m = marcas.pesquisa(indx);
            mostraUmaMarca(m);
        }
    }

    private static void mostraUmaMarca(Marca m) {

        System.out.println("Nome: " + m.getNome() + "\tTipo: " + m.getTipo());
    }
}
