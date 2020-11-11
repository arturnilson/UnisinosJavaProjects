package LabII.Aula06.FuncionarioComInterface.pagamentos;

public class ControleBonificacoes {
    private static final int NUMERO_FUNCIONARIOS = 10;
    private Funcionario[] folha;
    private int numeroElementos;

    public ControleBonificacoes() {
        folha = new Funcionario[NUMERO_FUNCIONARIOS];
        numeroElementos = 0;
    }

    public void registraBonificacao(Funcionario funcionario) {
        folha[numeroElementos] = funcionario;
        numeroElementos++;
    }

    public double getTotalBonificacoes() {
        double total = 0;

        for (int indx = 0; indx < folha.length; indx++) {
            if (folha[indx] != null) {
                total = total + folha[indx].getBonificacao();
            }
        }

        return total;
    }
}
