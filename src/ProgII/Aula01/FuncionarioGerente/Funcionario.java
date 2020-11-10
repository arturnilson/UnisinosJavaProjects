package ProgII.Aula01.FuncionarioGerente;

public class Funcionario {
    private String nome;
    private double salario;
    private int numeroDeDependentes;

    public Funcionario(String n, double s, int nd) {
        this.nome = n;
        this.salario = s;
        this.numeroDeDependentes = nd;
    }

    public Funcionario(String n, double s) {
        this.nome = n;
        this.salario = s;
    }

    public void exibeDados() {
        System.out.println("Nome Funcionário: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Nro Dependentes: " + getNumeroDeDependentes());
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

}