package ProgII.Aula01.FuncionarioGerente;

public class Teste {
    public static void main(String[] args) {
        Funcionario teste = new Funcionario("Caio", 2500, 1);
        Funcionario teste1 = new Funcionario("Marcos", 3500, 3);
        Gerente testeGerente = new Gerente("Maria", 5200, 1, "Joares");

        teste.exibeDados();
        teste1.exibeDados();
        testeGerente.exibeDados();

    }
}
