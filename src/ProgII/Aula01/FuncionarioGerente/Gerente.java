package ProgII.Aula01.FuncionarioGerente;

public class Gerente extends Funcionario {
    private String nomeSecretario;

    public Gerente(String nome, double salario, int nroDependentes, String nomeSecretario) {
        super(nome, salario, nroDependentes); // repassando os valores pra classe Funcionario através do super
        this.nomeSecretario = nomeSecretario;
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.println("Nome Secretario: " + getNomeSecretario());
    }

    public String getNomeSecretario() {
        return nomeSecretario;
    }

    public void setNomeSecretario(String nomeSecretario) {
        this.nomeSecretario = nomeSecretario;
    }

}
